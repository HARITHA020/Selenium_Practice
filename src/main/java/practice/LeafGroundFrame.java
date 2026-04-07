package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        WebElement iframe=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframe);
        String Frame_1=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Switch by locator:"+Frame_1);
        //switch back to main content
        driver.switchTo().defaultContent();
        String mainpage=driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
        System.out.println("the main page content:"+mainpage);
        
        //switch iframe using index
        driver.switchTo().frame(1);
        String frame_2=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("the frame 2 locator: "+frame_2);
        
        driver.close();
        
        

	}

}
