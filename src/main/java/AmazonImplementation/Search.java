package AmazonImplementation;

import java.util.List;

public class Search {

	public String displayProduct(Product product) {
		
		List<String> list = Product.getproductList();
		
		if(list.contains(product.getProductname())) {
			return product.getProductname();
		}
		
	
		return null;
		
		
	}
}
