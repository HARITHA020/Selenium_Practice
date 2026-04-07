package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQanewBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        String parent=driver.getWindowHandle();
        System.out.println(parent);
        Set<String> allWindows=driver.getWindowHandles();
        System.out.println("count of windows: "+allWindows.size());
        driver.findElement(By.id("windowButton")).click();
        
        Set<String> newAllWindows=driver.getWindowHandles();
        System.out.println("new count of windows: "+newAllWindows.size());
        
        String parentHandle=driver.getWindowHandle();
        System.out.println("parent windows:"+parentHandle);
        
        Iterator<String> iterator=newAllWindows.iterator();
        String mainWindow=iterator.next();
        String childWindow=iterator.next();
        System.out.println("Parent Window:"+mainWindow);
        System.out.println("the child Window:"+childWindow);
        
        driver.switchTo().window(childWindow);
        WebElement text=driver.findElement(By.id("sampleHeading"));
        System.out.println("child title:"+text.getText());
        
        driver.close();
        
        driver.switchTo().window(parentHandle);
        System.out.println("parent title:"+driver.getTitle());

        driver.close();
	}

}
