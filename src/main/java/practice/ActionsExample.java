package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement blog=driver.findElement(By.id("blogsmenu"));
        Actions act = new Actions(driver);
        act.moveToElement(blog).perform();
        
      //  WebElement Options2= driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
      //  act.moveToElement(Options2).click().build().perform();
        
      //  WebElement search =driver.findElement(By.xpath("//input[@name='q']"));
      //  act.contextClick(search).perform();
        
        WebElement doubleclick= driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
        act.doubleClick(doubleclick).perform();
        
	}

}
