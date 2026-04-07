package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		WebElement email=driver.findElement(By.cssSelector("#username"));
		email.click();
		email.sendKeys("2k22cse051@gmail.com");
		
		WebElement password= driver.findElement(By.cssSelector("#password"));
		password.click();
		password.sendKeys("Haritha@20");
		
		WebElement signin=driver.findElement(By.cssSelector("button[aria-label=\"Sign in\"]"));
		signin.click();
		Thread.sleep(1000);
		WebElement icon=driver.findElement(By.cssSelector("#linkedin-bug-blue-medium"));
		System.out.println(icon.isDisplayed());
		

	}

}
