package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	WebDriver driver = null;
	@Given("^I launch google Page$")
	public void i_launch_google_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}

	@When("^Search for a text UBS$")
	public void search_for_a_text_UBS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("UBS");
		driver.findElement(By.name("btnK")).click();
	}

	@Then("^I should be able to print all links starts with UBS$")
	public void i_should_be_able_to_print_all_links_starts_with_UBS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));
		
		
		for (WebElement webElement : searchResults) {
			System.out.println(webElement.getText());
		}
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
		driver = null;
	}

	
	@When("^Search for a text \"([^\"]*)\"$")
	public void search_for_a_text(String arg1) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(arg1);
		driver.findElement(By.name("btnK")).click();
	}
}
