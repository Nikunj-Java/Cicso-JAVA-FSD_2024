package com.simplilearn.demo;

import java.util.ArrayList;

public class Estore {
	
	ArrayList<Products> getProductsFromStore(){
		ArrayList<Products> products= new ArrayList<Products>();
		products.add(new Products("Apple",70000,4.8));
		products.add(new Products("Samsung Galaxy",40000,4.5));
		products.add(new Products("Huawaie",170000,4.9));
		products.add(new Products("RealMe",35000,4.4));
		
		return products;
		
	}
	
	
	

}
