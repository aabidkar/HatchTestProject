package stepDefiniation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import extentReportGenerator.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	private static WebDriver driver;

	ExtentReports eRep = ExtentManager.getInstance();
	ExtentTest eTest;

	@Given("^user visit the website$")
	public void user_visit_the_website() {
		eTest = eRep.startTest("CHSC Verify Login Test is Started.");
		eTest.log(LogStatus.INFO, "User visit the Website.");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		eTest.log(LogStatus.INFO, "Chrome Browser is Launching.");
		driver.manage().window().maximize();
		eTest.log(LogStatus.INFO, "Chrome Browser is Maximizing");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rms.hatchearlychildhood.com");
		eTest.log(LogStatus.INFO, "CHSC Website ULR is hit.");
	}

	@When("^user enters a Username as \"([^\"]*)\" and a Password as \"([^\"]*)\" field$")
	public void user_enters_a_Username_and_a_Password(String username, String password) throws Throwable {
		driver.findElement(By.cssSelector("input[id='LoginForm_username']")).sendKeys(username);
		eTest.log(LogStatus.INFO, "Username is Entered.");
		driver.findElement(By.cssSelector("input[id='LoginForm_password']")).sendKeys(password);
		eTest.log(LogStatus.INFO, "Password is Entered.");
	}

	@And("^user clicks on a Login button$")
	public void user_clicks_on_a_Login_button() {
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		eTest.log(LogStatus.INFO, "Login Button is Clicked.");
	}

	@When("^user clicks on CHSC option$")
	public void user_clicks_on_CHSC_option() {
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.cssSelector("li[class='has_sub']:last-child"));
		actions.moveToElement(mainMenu);
		WebElement subMenu = driver.findElement(By.cssSelector("li[class='has_sub']:last-child>ul>li>a"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();

	}

	@And("^user verify user is successfully login$")
	public void user_verify_user_is_successfully_login() throws IOException {
		if (driver.findElements(By.cssSelector("a > img")).size() != 0) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("screenshots\\screenshot1.jpg"));
			eTest.log(LogStatus.PASS, "Login Successfully Done");
		} else {
			eTest.log(LogStatus.FAIL, "Login Unsuccessfully.");
		}
	}

	@When("^user close a browser$")
	public void user_close_a_browser() {
		driver.close();
		eTest.log(LogStatus.INFO, "Closing Browser.");
		eRep.endTest(eTest);
		eRep.flush();

	}
}
