package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicReveal {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		WebElement reveal= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#reveal")));
		reveal.click();
		WebElement revealinput= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#revealed")));
		revealinput.click();
		
		System.out.println("the entered text is:"+);

	}

}
