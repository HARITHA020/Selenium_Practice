package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		/*WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");*/
		
		WebElement login=driver.findElement(By.name("login-button"));
		login.click();
		 WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
	     String message = error.getText();
	     System.out.println("Error message: " + message);
		Thread.sleep(2000);
		driver.close();

	}

}
