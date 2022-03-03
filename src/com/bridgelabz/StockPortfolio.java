package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	static ArrayList<Stock> stocks=new ArrayList<Stock>();
	public static void getStockData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of stocks");
		int count=sc.nextInt();
		

		for(int i=0;i<count;i++) {
			System.out.print("Enter stock name, number of shares and share price: ");
			String shareName = sc.next();
			int shareNumber = sc.nextInt();
			int sharePrice = sc.nextInt();
			Stock stock = new Stock(shareName, shareNumber, sharePrice);
			stocks.add(stock);
			printReport();
		}
		sc.close();

	}
	public static void printReport() {
		int totalValue = 0;
		System.out.println("\nName\tShares\tPrice\tValue");
		
		for(int i=0;i<stocks.size();i++) {
			Stock s=stocks.get(i);
			totalValue += s.getValue();
			System.out.println(s.getShareName()+"\t" +s.getShareNumber()+"\t" +s.getValue()+"\t"+totalValue);
		}
	
	
	}




	public static void main(String[] args) {

		StockPortfolio.getStockData();
		StockPortfolio.printReport();
	}


}
