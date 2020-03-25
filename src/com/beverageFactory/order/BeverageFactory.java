package com.beverageFactory.order;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeverageFactory {
	 List<String> orderList;
	 double chaiOrderValue;
	 static Map<String, Double> menuMap  = new HashMap<String, Double>();
	 
	 static {
		menuMap.put("chai", 4.0);
		menuMap.put("-milk", -1.0);
		menuMap.put("-sugar", -0.5);
		menuMap.put("-water", -0.5 );
		menuMap.put("coffee", 5.0 );
		menuMap.put("banana smoothi", 6.0 );
		menuMap.put("strawberries Shake", 7.0 );
		menuMap.put("mojito", 7.5 );
		menuMap.put("-mint", -0.5 );
		menuMap.put("-soda", -0.5 );
	 }
	public void processOrder(String order) {
		String[] orderArray = order.split(",");
		Double finalOrderValue =0.0;
		orderList = Arrays.asList(orderArray);
		
		for (String oneOrder : orderList) {
			if(menuMap.containsKey(oneOrder)) {
				//Double val = menuMap.get(oneOrder);
				finalOrderValue = finalOrderValue + menuMap.get(oneOrder);
			}
		}		
		System.out.println(finalOrderValue);
	}
	
	public static void main(String args[]) {
		BeverageFactory bf =  new BeverageFactory();
		bf.processOrder("chai,-sugar,coffee,-milk,mojito,-soda");
	}
}
