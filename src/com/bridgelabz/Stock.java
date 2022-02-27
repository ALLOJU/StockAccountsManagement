package com.bridgelabz;

/**
 * @author sri
 *
 */
public class Stock {

	private String shareName;
	private int shareNumber;
	private int sharePrice;
	
	public Stock(String shareName, int shareNumber, int sharePrice) {
		super();
		this.shareName = shareName;
		this.shareNumber = shareNumber;
		this.sharePrice = sharePrice;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getShareNumber() {
		return shareNumber;
	}

	public void setShareNumber(int shareNumber) {
		this.shareNumber = shareNumber;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [shareName=" + shareName + ", shareNumber=" + shareNumber + ", sharePrice=" + sharePrice + "]";
	}

	public int getValue() {
		return shareNumber * sharePrice;
	}
	
}
