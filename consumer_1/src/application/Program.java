package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	
	public static void main(String []args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1220.00));
		list.add(new Product("Tablet", 450.00));
		
		
		 list.forEach((p) -> {
			 p.setPrice(p.getPrice() * 1.1);
			 System.out.println(String.format("%.2f", p.getPrice()));
		 });
		 
		
	}
	
}
