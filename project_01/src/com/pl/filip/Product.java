package com.pl.filip;

public class Product {
	public String nazwa, nr;
	public double cena;
	public Product(String nazwa, String nr, double cena){
		this.nazwa=nazwa;
		this.nr=nr;
		this.cena=cena;
	}
	
	public void printProduct(){
		System.out.println("nazwa: "+nazwa+"\tnr: "+nr+"\tcena: "+cena+"zl");
	}
	

}
