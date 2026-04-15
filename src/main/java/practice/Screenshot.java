package practice;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.testim.io");
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File source= screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./SeleniumScreenshots/Screen.png"));
        System.out.println("screenShot is captured");
        driver.quit();
	}
}
