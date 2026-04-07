package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHtml {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		WebElement addbox= driver.findElement(By.cssSelector("#adder"));
		addbox.click();
		WebElement redbox=driver.findElement(By.cssSelector(".redbox"));
		System.out.println("the marigin values is:"+redbox.getCssValue("margin"));
		
		driver.close();
	}

}
