package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium tutorial");
		WebElement clickSearch=driver.findElement(By.name("btnK"));
		clickSearch.click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
