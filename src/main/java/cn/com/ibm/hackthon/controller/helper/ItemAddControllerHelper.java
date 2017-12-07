package cn.com.ibm.hackthon.controller.helper;

import cn.com.ibm.hackthon.po.Picture;
import cn.com.ibm.hackthon.service.ItemTypeService;
import cn.com.ibm.hackthon.service.LocationService;
import cn.com.ibm.hackthon.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Component("pictureUploadHelper")
public class ItemAddControllerHelper {

    @Autowired
    private PictureService pictureService;

    @Autowired
    private LocationService locationService;
    @Autowired
    private ItemTypeService itemTypeService;


    public String UploadfiletoServer(MultipartFile file, HttpServletRequest request, HttpServletResponse response, HttpSession session)throws IllegalStateException, IOException {
        String path=null;
        if (file!=null) {// 判断上传的文件是否为空

            String type=null;// 文件类型
            String fileName=file.getOriginalFilename();// 文件原名称
            System.out.println("picture:"+fileName);
            // 判断文件类型
            type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
            if (type!=null) {// 判断文件类型是否为空
                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    String realPath=request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
                    // 设置存放图片文件的路径
                    path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
                    System.out.println("store path:"+path);
                    // 转存文件到指定的路径
                    file.transferTo(new File(path));
                    System.out.println("path is====="+path);
                }else {
                    System.out.println("not support this file type");
                    return null;
                }
            }else {
                System.out.println("other problem");
                return null;
            }
        }else {
            System.out.println("no file existing");
            return null;
        }
        return path;
    }


    /**
     *
     * @param picture
     * @return
     * @throws Exception
     */
    public int AddNewPicturePath(Picture picture)throws Exception{
        int id=pictureService.generateNewPicturePath(picture);
        return id;
    }


    public ModelAndView GenerateListForAddItemPage(String s) {
        ModelAndView mav = new ModelAndView(s);

        List liloc= locationService.getLocation();
        List liI_type=itemTypeService.getItemTypeList();

        mav.addObject("LocationList", liloc);
        mav.addObject("ItemTypeList", liI_type);
        return mav;
    }
}
