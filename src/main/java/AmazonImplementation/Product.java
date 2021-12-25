package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	String productname;
	int price;
	public Product(String productname, int price) {
		super();
		this.productname = productname;
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static List<String> getproductList(){
		List<String> productList = new ArrayList<>();
		productList.add("Apple Macbook pro");
		productList.add("Apple Macbook air");
		productList.add("Apple iphone 12 ");
		return productList;
	}
}
