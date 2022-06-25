package util;

import java.util.function.Predicate;

import entities.Product;

public class PredicateProduct implements Predicate<Product>{

	@Override
	public boolean test(Product p) {		
		return p.getPrice() >= 100.0;
	}

}
