package com.pl.filip;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("plyta dvd", "1201", 9.89));
		products.add(new Product("szczotka", "0999", 24.99));
		products.add(new Product("telewizor", "1001", 249.99));
		products.add(new Product("tablet", "0012", 1249.99));
		products.add(new Product("wrotki", "1148", 149.99));
				
		Client ct = new Client("Jan", "Kowalski", products);

        
		
		
		ct.printProducts();
		System.out.println(23);
	
	}

}
