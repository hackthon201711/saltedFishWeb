package cn.com.ibm.hackthon.dto;

public class ItemRateDTO extends AbstractDTO{
	/**
	 * item id
	 */
	private String itemId;
	
	/**
	 * rate
	 */
	private String rate;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	
	
}	
