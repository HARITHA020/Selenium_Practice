package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		//dropdown element
		WebElement dropdown= driver.findElement(By.cssSelector(".dropdown .dropbtn"));
		dropdown.click();
		//facebook navigation
		WebElement facebook= driver.findElement(By.cssSelector("#myDropdown a:nth-child(1)"));
		facebook.click();
		driver.close();
	}
}
