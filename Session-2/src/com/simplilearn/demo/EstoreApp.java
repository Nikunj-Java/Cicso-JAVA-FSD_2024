package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class EstoreApp {
	
	ArrayList<Products>products;

	public EstoreApp() {
		products= new  ArrayList<Products>();
		products.add(new  Products("iphone","Apple",119000));
		products.add(new  Products("realme","Narazo",19000));
		products.add(new  Products("F21","OPPO",21000));
		products.add(new  Products("GALAXY","SAMASUNG",119000));
		products.add(new  Products("MACBOOK","Apple",124000));
		products.add(new  Products("WATER BOTTLE","XYZ",3000));
		products.add(new  Products("FRIDGE","WHIRLPOOL",15000));
	}
	
	void showProductInEstore() {
		products.forEach((product)->product.showProduct());
	}
	
	void filterProductsInPriceRange(int fromPrice,int toPrice) {
		/*products.forEach((product)->{
			if(product.price>=fromPrice && product.price<=toPrice) {
				product.showProduct();
			}
		});*/
		
		Stream<Products> stream= products.stream();
		Stream<Products> filteredProducts=stream.filter((product)->product.price>=fromPrice && product.price<=toPrice);
		filteredProducts.forEach((product)->product.showProduct());
	}
}
