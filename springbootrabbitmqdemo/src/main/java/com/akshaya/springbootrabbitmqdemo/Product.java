package com.akshaya.springbootrabbitmqdemo;

public class Product {
	private int productid;

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + "]";
	}

	private String productname;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

}
