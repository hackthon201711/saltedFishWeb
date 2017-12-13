package cn.com.ibm.hackthon.controller.helper;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.Picture;
import cn.com.ibm.hackthon.service.ItemService;
import cn.com.ibm.hackthon.service.LocationService;
import cn.com.ibm.hackthon.service.PictureService;
import cn.com.ibm.hackthon.service.UserService;
import cn.com.ibm.hackthon.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component("itemDetailHelper")
public class ItemDetailControllerHelper {

    @Autowired
    private UserService userService;
    @Autowired
    private PictureService pictureService;
    @Autowired
    private ItemService itemService;

    private final String PATH= Constant.PICTURE_VIRTUAL_ADRESS;
    public ModelAndView displayItemDetail(String s,int itemid) throws SQLException{
        ModelAndView mav = new ModelAndView(s);

        //需要获取session 中 loginname and itemid
        List <Item>itemlist = itemService.selectItemByUserName(itemid);
        if(itemlist!=null){
            Item Item=(Item)itemlist.get(0);
            System.out.println("=================="+itemlist);

            List<Picture> pictureList=pictureService.getPictureList(1);
            //取出附图
            List<Picture> deplist = pictureList.parallelStream().filter(p -> p.getPicutureType()==1)
                    .collect(Collectors.toList());

            //取出主图
            List<Picture> mainlist = pictureList.parallelStream().filter(p -> p.getPicutureType()==0)
                    .collect(Collectors.toList());
            mav.addObject("mainpicture",mainlist);
            mav.addObject("itemdto", Item);
            mav.addObject("pictureList", deplist);
            mav.addObject("path",PATH);
        }

        return mav;
    }
}
