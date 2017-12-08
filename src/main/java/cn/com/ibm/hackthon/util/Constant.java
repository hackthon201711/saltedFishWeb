package cn.com.ibm.hackthon.util;

public interface Constant {
	/** 物品状态*/
	/** 已发布*/
	public static final String ITEM_STATUS_PUBLISHED = "1";
	/** 已关闭*/
	public static final String ITEM_STATUS_CLOSED = "2";
	
	/**index 页面**/
	public static final String PAGE_INDEX="index";
	public static final String PAGE_LOGIN="login";
	public static final String PAGE_PUBLIC_ITEM="public_item";
	public static final String PAGE_SHOP_ITEM="shop_item";
	public static final String PAGE_SHOP_PRODUCT_LIST="shop-product-list";
	public static final String PAGE_SHOP_SEARCH_LIST="shop-search-list";
	public static final String PAGE_SHOP_STANDART_FORMS="shop-standart-forms";
	public static final String PAGE_SHOP_WISHLIST="shop-wishlist";
	public static final String PAGE_USER_REGISTER="user-register";
	public static final String PICTURE_STROE_ADDREES="C://yu/";
	//图片读取虚拟地址 需要相应的配置tomcat
	public static final String PICTURE_VIRTUAL_ADRESS="http://localhost:8081/picture";
}
