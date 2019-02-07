package com.hatchtest.HatchTestProject;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test {

	public void dummy() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rms.hatchearlychildhood.com");
		driver.findElement(By.cssSelector("input[id='LoginForm_username']")).sendKeys("orgadmin@piedmont.com");
		driver.findElement(By.cssSelector("input[id='LoginForm_password']")).sendKeys("h@tch");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		//driver.findElement(By.cssSelector("li[class='has_sub']:last-child")).click();
		
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.cssSelector("li[class='has_sub']:last-child"));
		actions.moveToElement(mainMenu);

		WebElement subMenu = driver.findElement(By.cssSelector("li[class='has_sub']:last-child>ul>li>a"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		
		
		//driver.findElement(By.cssSelector("li[class='has_sub']:last-child>ul>li>a")).click();
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		Date date=new Date();
		String currentDateAndTime = date.toString();
		String modifiedTimeStamp = currentDateAndTime.replace(" ", "_").replace(":", "_");
		String fileNameType = modifiedTimeStamp+".html";
		System.out.println(fileNameType);
	}

}
