package stepDefiniation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	
	private static WebDriver driver;
	

	@Given("^user visit the website$")
	public void user_visit_the_website(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C://Users//sourabh.sarnaik//Downloads//chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rms.hatchearlychildhood.com");
	}
	

	@When("^user enters a Username as \"([^\"]*)\" and a Password as \"([^\"]*)\" field$")
	public void user_enters_a_Username_and_a_Password(String username, String password) throws Throwable {
		driver.findElement(By.cssSelector("input[id='LoginForm_username']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id='LoginForm_password']")).sendKeys(password);
	}

	@And("^user clicks on a Login button$")
	public void user_clicks_on_a_Login_button() {
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}
	@When("^user close a browser$")
	public void user_close_a_browser(){
	   driver.close();
	}

}
