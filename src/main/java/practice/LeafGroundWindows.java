package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/window.xhtml");
        String parent=driver.getWindowHandle();
        System.out.println(parent);
        Set<String> parentwindow=driver.getWindowHandles();
        System.out.println("the count is :"+parentwindow.size());
        
        WebElement closewindow= driver.findElement(By.cssSelector("button[name=\"j_idt88:j_idt93\"]"));
        closewindow.click();
        

        Set<String> newwindow=driver.getWindowHandles();
        System.out.println("new count of windows: "+newwindow.size());
        

        String parentHandle=driver.getWindowHandle();
        System.out.println("parent windows:"+parentHandle);
        
        Iterator<String> iterator=newwindow.iterator();
        String mainWindow=iterator.next();
        String childWindow=iterator.next();
        System.out.println("Parent Window:"+mainWindow);
        System.out.println("the child Window:"+childWindow);
        
        driver.switchTo().window(childWindow);
        WebElement text=driver.findElement(By.id(""));
        System.out.println("child title:"+text.getText());
        
        

	}

}
