package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactRetriveData {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        driver.findElement(By.id("email")).sendKeys("admin1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("admin123");
        driver.findElement(By.id("submit")).click();

        Thread.sleep(3000);
        List<WebElement> contactName = driver.findElements(
                By.xpath("//table[@id='myTable']//tr/td[2]")
        );

        int count = contactName.size();
        System.out.println("The contact count: " + count);

        for (WebElement names : contactName) {
            System.out.println(names.getText());
        }
        
        int i=1;
        for(WebElement names: cotactName) {
        	
        }

        driver.quit();
    }
}