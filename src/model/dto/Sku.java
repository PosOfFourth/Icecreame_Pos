package model.dto;

public class Sku {
	private String skuId;
	private String dealerId;
	private String skuName;
	private int skuPrice;
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getDealerId() {
		return dealerId;
	}
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public int getSkuPrice() {
		return skuPrice;
	}
	public void setSkuPrice(int skuPrice) {
		this.skuPrice = skuPrice;
	}
	
	
}
