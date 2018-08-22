package com.akshaya.springbootrabbitmqdemo;

import java.io.Serializable;

public class Order implements Serializable{
   private String orderNumber;
   	private String productId;
    private double amount;
    public Order() {
     }
    public Order(String orderInvoice, String productId, double amount) {
     this.orderNumber = orderInvoice;
    this.productId = productId;
    this.amount = amount;
 }
    public String toString(){
		return "Order{orderNumber:"+ orderNumber+",productid:"+productId+", amount:"+ amount+"}";
    	
    }
    public String getOrderInvoice() {
    	return orderNumber;
    }
    public void setOrderInvoice(String orderInvoice) {
    	this.orderNumber = orderInvoice;
    }  
   
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}

