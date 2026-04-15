package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotElement {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev");

        try {
            WebElement logo = driver.findElement(By.xpath("//h1"));

            File source = logo.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(source,
                    new File("./SeleniumScreenshots/logo_" + System.currentTimeMillis() + ".png"));

            System.out.println("Screenshot saved successfully");

        } catch (Exception e) {
            System.out.println("Error occurred ❌: " + e.getMessage());
        }
        driver.quit();
    }
}