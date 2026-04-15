package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4WindowsHandle {

	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://leafground.com/window.xhtml");
	        String parent = driver.getWindowHandle();
	        driver.switchTo().newWindow(WindowType.WINDOW);
	        driver.get("https://leafground.com/window.xhtml");
	        driver.findElement(By.id("j_idt88:j_idt93")).click();
	        Set<String> allWindows = driver.getWindowHandles();
	        System.out.println("Total windows: " + allWindows.size());
	        driver.switchTo().window(parent);
	        System.out.println("Back to Parent Title: " + driver.getTitle());
	        driver.quit();
	    }
}
