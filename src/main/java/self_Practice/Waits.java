package self_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement click1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"j_idt87:j_idt89\"]")));
		click1.click();
		System.out.println("The click 1 element is enabled: "+click1.isEnabled());
		
		driver.close();
	}

}
