package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlaze {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement login= driver.findElement(By.id("login2"));
        login.click();
        WebElement logPage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logInModal .modal-content")));
        WebElement name= driver.findElement(By.cssSelector("#loginusername"));
        name.click();
        name.sendKeys("admin");
        WebElement password= driver.findElement(By.cssSelector("#loginpassword"));
        password.click();
        password.sendKeys("admin");
        WebElement logbutton= driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        logbutton.click();
        WebElement welcome=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nameofuser")));
        System.out.println("The typed name is:"+welcome.getText());
        String name1="Welcome admin";
        if(name1.matches(welcome.getText())) {
        	System.out.println("it is same as type");
        }
        else {
        	System.out.println("it is not same as type");
        }
        System.out.println(welcome.isDisplayed());
        driver.close();
        		
        


	}

}
