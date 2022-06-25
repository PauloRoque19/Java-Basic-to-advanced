package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.PredicateProduct;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.0));
		list.add(new Product("Mouse",50.0));
		list.add(new Product("Tablet",350.50));
		list.add(new Product("HD Case",80.90));
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		/*primeira opção
		list.removeIf(new PredicateProduct());
		*/
		
		list.removeIf(pred);
		for(Product p : list) {
			System.out.print(p);
		}

	}

}
