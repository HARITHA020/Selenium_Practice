package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BStackAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		WebElement input = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button/span[1]"));
		input.click();
		WebElement searchkey= driver.findElement(By.xpath("//span[@id=\"j_idt87:auto-complete_panel\"]/ul/li[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(searchkey).click().perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
