package com.product_order_detail.model;

public class Order_detail_VO {
	private String product_order_detail_id;
	private String product_order_id;
	private String product_version_id;
	private Integer quantity;
	@Override
	public String toString() {
		return "Order_detail_VO [product_order_detail_id=" + product_order_detail_id + ", product_order_id="
				+ product_order_id + ", product_version_id=" + product_version_id + ", quantity=" + quantity + "]";
	}
	public String getProduct_order_detail_id() {
		return product_order_detail_id;
	}
	public void setProduct_order_detail_id(String product_order_detail_id) {
		this.product_order_detail_id = product_order_detail_id;
	}
	public String getProduct_order_id() {
		return product_order_id;
	}
	public void setProduct_order_id(String product_order_id) {
		this.product_order_id = product_order_id;
	}
	public String getProduct_version_id() {
		return product_version_id;
	}
	public void setProduct_version_id(String product_version_id) {
		this.product_version_id = product_version_id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	

}
