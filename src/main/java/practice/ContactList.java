package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("admin1@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("admin123");
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(3000);
		List <WebElement> data =driver.findElements(By.xpath("//tr[@class=\"contactTableBodyRow\"]"));
		System.out.println("the size of row:"+data.size());
		for(WebElement value:data) {
			System.out.println(value.getText());
		}
		driver.close();
	}

}
