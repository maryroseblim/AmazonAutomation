package stefdefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SortItem {
	

	By searchBox = By.id("twotabsearchtextbox");

    By searchBtn = By.className("nav-input");

    By CPdept =By.linkText("Cell Phones");

    By lowPrice = By.id("low-price");

    By highPrice = By.id("high-price");	

    By priceBtn = By.xpath("(//input[@type='submit'])[2]");
    
    By Result = By.xpath("//span[@class='a-price-whole']");
    
    By nameResult = By.xpath("//span[@cel_widget_id='SEARCH_RESULTS-SEARCH_RESULTS']//h2//span");

	
	WebDriver driver;
	
	// For Amazon Feature

	@Given("^Open URl \"([^\"]*)\"$")
	public void open_URl(String URL) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String Item) throws Throwable {
		driver.findElement(searchBox).sendKeys(Item);
		driver.findElement(searchBtn).click();

	}

	@When("^Refine the results to show only items under the Cell Phones department$")
	public void refine_the_results_to_show_only_items_under_the_Cell_Phones_department() throws Throwable {
		driver.findElement(CPdept).click();
	}

	@When("^Refine results to show only items ranging from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void refine_results_to_show_only_items_ranging_from_to(String lowprice, String highprice) throws Throwable {
        driver.findElement(lowPrice).sendKeys(lowprice);
	  driver.findElement(highPrice).sendKeys(highprice);
	  driver.findElement(priceBtn).click();
   
	}

	@Then("^Take the first (\\d+) results then sort their prices by highest to lowest in Java, without using Sort by Price feature on Amazon's website\\.$")
	public void take_the_first_results_then_sort_their_prices_by_highest_to_lowest_in_Java_without_using_Sort_by_Price_feature_on_Amazon_s_website(int arg1) throws Throwable {
		
		System.out.println("sort item");
		
		List<WebElement> pResult = driver.findElements(Result);		
		ArrayList<String> priceList = new ArrayList<String>(); 
 	
		System.out.println("price: " + pResult.size());
		
		
		for (WebElement result : pResult) {
		
			priceList.add(result.getText());	
			System.out.println(result.getText());
		}
		
		Collections.sort(priceList.subList(0, 5));
		System.out.println(priceList.subList(0, 5));
		
			
	}

	@Then("^Print all the product names after sorting\\.$")
	public void print_all_the_product_names_after_sorting() throws Throwable {
		System.out.println("print item");
		
		List<WebElement> nResult = driver.findElements(nameResult);
		System.out.println("name: " + nResult.size());
		
		ArrayList<String> nameList = new ArrayList<String>(); 
		
		for (WebElement result : nResult) {
			
			nameList.add(result.getText());	
			System.out.println(result.getText());
		}
			
	}

}
