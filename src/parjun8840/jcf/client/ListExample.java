package parjun8840.jcf.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import parjun8840.jcf.entity.Product;

public class ListExample {
//Command+shift+o
	public static void main(String[] args) {
        List<Product> products = new ArrayList<>(); // till Java6 ArrayList<Product> was require, from 7+ not required
        products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
        products.add(new Product(224, "iPhone", 98000.00, "mobile"));
        products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
        products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
        products.add(new Product(912, "One Plus", 32000.00, "mobile"));
        products.add(new Product(88, "HP Printer", 19000.00, "computer"));
        Collections.sort(products);// It is List of product not Array so we have to use Collections.sort.
        
        Collections.sort(products, new Comparator<Product>() {
        	@Override
        	public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
				
        		
        	}
        });
        
        Collections.sort(products, (o1, o2) -> o1.getName().compareTo(o2.getName()));
				
        		
 
        
        for(Product p : products) {
        	System.out.println(p);
        }
        
	}

}
