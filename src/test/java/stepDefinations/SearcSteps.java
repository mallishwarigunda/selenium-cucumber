package stepDefinations;

import org.testng.Assert;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearcSteps {

	Product product;
	Search search;
	
	@Given("I hava a search feild on amazon page")
	public void i_hava_a_search_feild_on_amazon_page() {
	 System.out.println("Step1: searching on page");
	}

	@When("I search for a product with a name {string} and price {int}")
	public void i_search_for_a_product_with_a_name_and_price(String productname, Integer price) {
	   System.out.println("Step2: I search for a product with a name "+productname+" and price"+price);
	   product = new Product(productname, price);
	   
	   
	}

	@Then("product with name {string} should displayed")
	public void product_with_name_should_displayed(String productname) {
	   System.out.println("Step3: product with name "+productname+" should displayed");
	   search = new Search();
	   System.out.println("my product is:" + product.getProductname());
	   String name = search.displayProduct(product);
	   System.out.println("my searched product is:"+name);
	 // Assert.assertEquals(product.getProductname(),name);
	   
	}

	
	
	
}
