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
	private String locationId;
	
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

	/**
	 * 物品类别id
	 */
	private String itemTypeId;
	
	/**
	 * 物品扩展字段
	 */
	private String field;
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

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
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

	public String getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(String itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	
}
