package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String []args) {
		
		Set<Product> set = new TreeSet<>();
		set.add(new Product("TV",900.0));
		set.add(new Product("Nootbook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Nootbook", 1200.0);
		
		System.out.println(set.contains(prod));
	}
}
