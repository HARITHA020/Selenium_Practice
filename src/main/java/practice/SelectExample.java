package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Select objselect = new Select(driver.findElement(By.id("drop1")));
        List<WebElement> options=objselect.getOptions();
        System.out.println(options.size());
        for(WebElement value:options) {
        	System.out.println("values:"+value.getText());
        }
        
        boolean multiple= objselect.isMultiple();
        System.out.println("the multiple options:"+multiple);
        objselect.selectByIndex(2);
        objselect.selectByVisibleText("Older Newsletters");
        
        driver.close();
	}
}
