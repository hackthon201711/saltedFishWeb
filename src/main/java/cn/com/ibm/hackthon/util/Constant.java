package cn.com.ibm.hackthon.util;

public interface Constant {
	/** 物品状态*/
	/** 已发布*/
	public static final int ITEM_STATUS_PUBLISHED = 0;
	/** 已关闭*/
	public static final int ITEM_STATUS_CLOSED = 1;
	
	public static final int FIRST_PIC = 0;
	
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
	public static final String PICTURE_VIRTUAL_ADRESS="http://9.110.24.109:8080/picture/";
	
	public static final String SYMBOL_COMMA = ",";
	public static final String SYMBOL_LEFT_BRACKET="[";
	public static final String SYMBOL_RIGHT_BRACKET="]";
	
	
	/**找到感兴趣商品*/
	public static final int INTEREST_ITEM_FOUND=0;
	/**没有找到感兴趣商品*/
	public static final int INTEREST_ITEM_NOT_FOUND=1;

	/**添加感兴趣商品成功*/
	public static final String ADD_INTEREST_SUCCESS = "0";
	/**添加感兴趣商品失败*/
	public static final String ADD_INTEREST_UN_SUCCESS = "1";
	
	public static final String USERID_IN_SESSION = "uId";
}
