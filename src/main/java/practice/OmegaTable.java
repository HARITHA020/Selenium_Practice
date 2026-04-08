package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmegaTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List <WebElement>table= driver.findElements(By.xpath("//table[@id=\"table1\"]//tr[2]/td[3]"));
		System.out.println("the size of table is:"+table.size());
		for(WebElement value:table) {
			System.out.println(value.getText());
		}
		//row
		List <WebElement>tablerow= driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
		int rows=tablerow.size();
		System.out.println("the row size in table:"+rows);
		//column
		List <WebElement>tablecol= driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		int col=tablecol.size();
		System.out.println("the col size in table:"+col);
		
		for(int r=1;r<=rows;r++) {
			for(int c=1;c<=col;c++) {
				WebElement data;
				if(r==1) {
					data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr[" +r+ "]//th[" +c+ "]"));
				}
				else {
					data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr[" +(r)+ "]//td[" +c+ "]"));
				}
				System.out.print(data.getText()+" ");
			}
			System.out.println();
			
		}
        driver.close();
	}
}
