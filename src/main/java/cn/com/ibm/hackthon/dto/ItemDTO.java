package cn.com.ibm.hackthon.dto;

public class ItemDTO extends AbstractDTO{
	/**
	 * id
	 */
	private String id;
	
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 物品名称
	 */
	private String itemName;
	/**
	 * 原价
	 */
	private String prePrice;
	
	/**
	 * 现价
	 */
	private String currentPrice;
	
	/**
	 * 商品所在地
	 */
	private String location;
	
	/**
	 * 图片路径
	 */
	private String picPath;
	
	/**
	 * 物品描述
	 */
	private String itemDesc;
	
	/**
	 * 物品状态
	 */
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrePrice() {
		return prePrice;
	}

	public void setPrePrice(String prePrice) {
		this.prePrice = prePrice;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
