package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions act = new Actions(driver);
		WebElement compendiumDev= driver.findElement(By.linkText("compendiumdev"));
		act.keyDown(Keys.CONTROL).moveToElement(compendiumDev).click().keyUp(Keys.CONTROL).build().perform();
        String parent=driver.getWindowHandle();
		Set<String> windowhandle=driver.getWindowHandles();
		for(String handle:windowhandle) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(3000);
		System.out.println("child window:"+windowhandle);
		driver.switchTo().window(parent);
	}

}
