package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		WebElement simple = driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt91\"]"));
		simple.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WebElement message= driver.findElement(By.id("simple_result"));
		System.out.println("is the simple text located:"+message.isDisplayed());
		Thread.sleep(3000);
		
		WebElement confirmation= driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt93\"]"));
		confirmation.click();
		alert.accept();
		WebElement confmsg= driver.findElement(By.id("result"));
		System.out.println("is the simple text located:"+confmsg.isDisplayed());
		Thread.sleep(3000);
		
		WebElement prompt= driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt104\"]"));
		prompt.click();
		alert.sendKeys("haritha");
		alert.accept();
		WebElement promptmsg= driver.findElement(By.id("confirm_result"));
		System.out.println("is the simple text located:"+promptmsg.getText());
		Thread.sleep(3000);
		driver.close();
		
	}

}
