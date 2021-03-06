package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new  ArrayList<>();
		
		products.add(new Product("TV", 900.00));
		products.add(new Product("Notebook", 1220.00));
		products.add(new Product("Tablet", 450.00));
		
		/*primeira op??o
			products.sort(new MyComparator());
		*/
		
		/*segunda op??o
		  Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};	
		products.sort(comp);
		*/
		
		/*  terceira  op??o
		Comparator<Product> comp =(p1,p2)  -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};	
		products.sort(comp);
		*/
		
		products.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p: products) {
			System.out.println(p);
		}
	}

}
