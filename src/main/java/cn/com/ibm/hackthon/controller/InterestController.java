package cn.com.ibm.hackthon.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.ibm.hackthon.controller.helper.InterestControllerHelper;
import cn.com.ibm.hackthon.dto.InterestDTO;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.util.Constant;

/**
 * 感兴趣商品controller
 * @author lizhiwei
 *
 */
@Controller
public class InterestController implements Constant{
	private static final Logger logger = LoggerFactory.getLogger(InterestController.class); 
	@Autowired
	private InterestControllerHelper helper;
	
	@RequestMapping(value="/interest",method=RequestMethod.GET)
	@ResponseBody
	public String interestIn(String itemId,HttpSession session) throws Exception{
		logger.info("add interest item ...");
		if(session.getAttribute(USERID_IN_SESSION)==null) {
			return null;
		}
		String userId = session.getAttribute(USERID_IN_SESSION).toString();
		InterestDTO inDTO = new InterestDTO();
		inDTO.setUserId(userId);
		inDTO.setItemId(itemId);
		if(helper.interetInItem(inDTO)==Constant.INTEREST_ITEM_NOT_FOUND) {
			logger.info("add interest item success...");
			return Constant.ADD_INTEREST_SUCCESS;
		}
		logger.info("add interest item failed...");
		return Constant.ADD_INTEREST_UN_SUCCESS;
	}
	
	/**
	 * 我关注的商品
	 * @return
	 * @throws SQLException 
	 */
	@RequestMapping(value="/myinterest",method=RequestMethod.GET)
	public String myInterestItem(HttpSession session,Model model) throws SQLException {
		logger.info("view my interest item ...");
		String userId = session.getAttribute(USERID_IN_SESSION).toString();
		List<ItemDTO> list = helper.selectInterestItemList(userId);
		model.addAttribute("itemList",list);
		return "shop-myInterestItem";
	}
}
