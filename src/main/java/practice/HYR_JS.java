package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class HYR_JS {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			//name
			jse.executeScript("document.getElementsByName('name')[0].value='haritha';");
			// get value
			String name = (String) jse.executeScript("return document.getElementsByName('name')[0].value;");
			System.out.println(name);	
			//lastname
			String lastname=jse.executeScript("document.getElementsByName('name')[1].values='SR';").toString();
			System.out.println(lastname);
			//email
			String email=jse.executeScript("document.querySelectorAll('input')[2].values='admin1@gmail.com'").toString();
			System.out.println(email);
			//password
			String pass=jse.executeScript("document.querySelectorAll('input')[2].values='admin123'").toString();
			System.out.println(pass);
			//repassword
			String repass=jse.executeScript("document.querySelectorAll('input')[2].values='admin123'").toString();
			System.out.println(repass);
		    //register
			jse.executeScript("document.getElementsByClassName('btn')[0].click()");
			driver.close();
			
		}

}
