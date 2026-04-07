package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimerButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		WebElement time= wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		time.click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		WebElement disappear= wait.until(ExpectedConditions.elementToBeClickable(By.id("alert2")));
		disappear.click();
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert1.getText());
		driver.close();
		

	}

}
