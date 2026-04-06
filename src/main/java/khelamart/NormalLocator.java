package khelamart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class NormalLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.khelmart.com/");
		System.out.print("moved to khelmart website");
		//1. Wishlist button:
		WebElement wishlist=driver.findElement(By.xpath("//ul[@class=\"header features-links items hidden-xs\"]/child::li[1]"));
	   	System.out.println("the wishlist is located: "+wishlist.isDisplayed());
	   	
	   	//2, email input
	    WebElement loginIcon=driver.findElement(By.xpath("//a[@class=\"account-trigger cdz-top-link\"]"));
	    loginIcon.click();
	    WebElement emailInput=driver.findElement(By.xpath("//input[contains(@id,'email-')] "));
	    emailInput.sendKeys("haritha",Keys.ENTER);
	    System.out.println(emailInput.getAttribute("value"));
	    Thread.sleep(1000);
	    
	    //3 signin button
	    WebElement signinButton=driver.findElement(By.xpath(" (//div[@id=\"remember-me-box\"])[2]/following-sibling::div//button"));
	    signinButton.click();

	    //4lock icon
	 
	    driver.findElement(By.tagName("body")).click();
	    Thread.sleep(1000);
	    WebElement lockIcon=driver.findElement(By.xpath("(//div[@class=\"item col-sm-6 col-xs-12\"])[1]/child::p[1]/span"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", lockIcon);
	    Thread.sleep(1000);
	    System.out.println("\nThe lockIcon is located: "+lockIcon.isDisplayed());
	    
	    //5 subcribe button
	    WebElement subscribeButton=driver.findElement(By.xpath("(//div[@class=\"actions\"])[2]/child::button"));
	    System.out.println("the subcirbe button is locate:"+subscribeButton.isDisplayed());
	    
	    //6.Top arrow Symbol
	    WebElement arrow=driver.findElement(By.xpath("//div[@id=\"cdz-sidebar-backface\"]/preceding-sibling::div/a"));
	    System.out.println("the Top arrow Symbol is Loacted:"+arrow.isDisplayed());
	    
	   	//7. Search box
	   	
	   	WebElement searchBox=driver.findElement(By.xpath("//div[@class=\"col-sm-7 col-md-7 col-lg-5 header-panel-right\"]/preceding-sibling::div[1]"));
	   	searchBox.click();
	   	
	   	//8. search Feild Input
	   	Thread.sleep(3000);
	   	WebElement searchBoxInput=driver.findElement(By.xpath("//div[@class=\"field search\"]/child::div/input"));
	   	searchBoxInput.sendKeys("Shoes");
	   	System.out.println("\n"+searchBoxInput.getAttribute("value"));
	   	searchBoxInput.sendKeys(Keys.ENTER);
	   	Thread.sleep(3000);
	   	
	   	//9 toolbar container
	   	WebElement toolBar=driver.findElement(By.xpath("//div[@class=\"product-list-container\"]/child::div[1]"));
	   	System.out.println("\nTool bar is located: "+toolBar.isDisplayed());
	   	
	   	//10add to cart button
	   	WebElement addCart=driver.findElement(By.xpath("(//div[@class=\"product-item-inner\"])[1]/child::div[2]"));
	    System.out.println("the Add to cart button is located: "+addCart.isDisplayed());
	    Thread.sleep(3000);
	    
	    //11 product list from grid to list
	    WebElement toolBarList=driver.findElement(By.xpath("(//div[@class=\"toolbar toolbar-products\"])[1]/div[1]/a"));
	    toolBarList.click();
	    Thread.sleep(3000);
	    System.out.println("The grid is changed to list");
	   
		//12 first product in the searched one
	    WebElement firstproductview=driver.findElement(By.xpath("(//div[@class=\"toolbar toolbar-products\"])[1]/div[1]/a"));
	    System.out.println("\nproduct one is lacated: "+firstproductview.isDisplayed());
	    WebElement firstProduct = driver.findElement(By.xpath("(//strong[@class=\"product name product-item-name\"]/a)[1]"));
	    System.out.println("the first product description: "+firstProduct.getText());
	  
	    //13 right arrow
	    
	    WebElement productTouch=driver.findElement(By.xpath("(//div[@class='product-item-top'])[1]//a[@class=\"product photo product-item-photo\"]"));
	    ((JavascriptExecutor) driver).executeScript(
	        "arguments[0].scrollIntoView({block: 'center'});", productTouch
	    );
	    Thread.sleep(600);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", productTouch);
	    WebElement rightArrow=driver.findElement(By.xpath("//div[@class=\"fotorama__thumb__arr fotorama__thumb__arr--right\"]/child::div"));
	    System.out.println("The right arrow is located: "+rightArrow.isDisplayed());
	 
	   //14 .keep shop button inadd to cart.
	  
	   WebElement shoesSize=driver.findElement(By.xpath("//select[@id=\"select_5908\"]"));
	   shoesSize.click();
	   shoesSize.sendKeys("UK-6",Keys.ENTER);
	   Thread.sleep(1000);
	   WebElement cartbutton=driver.findElement(By.xpath("//button[@id=\"product-addtocart-button\"]"));
	   cartbutton.getText();
	   cartbutton.click();
	   
	   Thread.sleep(2000);
	   WebElement keepShopCart=driver.findElement(By.xpath("//button[@data-action=\"closeInformedPopup\"]"));
	   System.out.println("the keep shooping button is located in the add cart:"+keepShopCart.isDisplayed());
	    		
	   //15.old price text finding
	   driver.findElement(By.tagName("body")).click();
	   WebElement oldprice=driver.findElement(By.xpath("(//span[@data-price-type=\"oldPrice\"])[1]"));
	   System.out.println("the oldprice is located:"+oldprice.isDisplayed());
	   
	   //16. save percentage
	   WebElement save=driver.findElement(By.xpath(" (//span[@class=\"special-price\"]/following-sibling::span)[1]"));
	   System.out.println("the save percentage is located:"+save.isDisplayed());
	  
	   
	   //17. decrese button
	   WebElement decreases=driver.findElement(By.xpath("(//div[@class=\"qty-ctl\"])[1]/child::button"));
	   decreases.click();
	   Thread.sleep(1000);
	   System.out.println("the decreases button is located: "+decreases.isDisplayed());
	   
	   //18.calculate shipping cost
	   WebElement cost=driver.findElement(By.xpath("//a[@class=\"content-toggle\"]"));
	   cost.click();
	   Thread.sleep(2000);
	   System.out.println("the calulate shopping cost is located: "+cost.isDisplayed());
	  
	   
	   //19.socila media icon
	   WebElement media=driver.findElement(By.xpath("//ul[@class=\"cdz-social-listing\"]/child::li[1] "));
	   System.out.println("the facebook media symbol is located:"+media.isDisplayed());
	   
	   //20. shipping address container
	   WebElement shoesSizebuy=driver.findElement(By.xpath("//select[@id=\"select_5908\"]"));
	   shoesSizebuy.click();
	   shoesSizebuy.sendKeys("UK-6",Keys.ENTER);
	   Thread.sleep(1000);
	   WebElement count=driver.findElement(By.xpath("//button[@title=\"Increase\"]"));
	   count.click();
	   Thread.sleep(1000);
	   WebElement buynow=driver.findElement(By.xpath("//button[@id=\"product-buy-now-button\"]"));
	   buynow.click();
	   Thread.sleep(3000);
	   WebElement address=driver.findElement(By.xpath("//li[@id=\"opc-shipping_method\"]/preceding-sibling::li"));
	   System.out.println("the address container is located:"+address.isDisplayed());
	   
	   //21. state/province select
	   WebElement state=driver.findElement(By.xpath("(//select[@name=\"region_id\"])[1]"));
	   state.click();
	   state.sendKeys("Assam",Keys.ENTER);
	   System.out.println("the state selection option is located:"+state.isDisplayed());
	   
	   //22.checkbox 
	   WebElement checkbox=driver.findElement(By.xpath("//div[@class=\"checkout-billing-address\"]/child::div/input"));
	   System.out.println("the check box is Located: "+checkbox.isDisplayed());
	  
	   
	   //23.cart item visbile or not
	   WebElement cartItem=driver.findElement(By.xpath("//div[contains(@class,'items-in-cart') and contains(@class,'active')]"));
	   System.out.println("is the cart is visble:"+cartItem.isEnabled());
	   
	   //24. discountInput
	   WebElement discountInput=driver.findElement(By.xpath("(//div[@class=\"field\"])[4]/child::div/input"));
	   System.out.println("the discountInput is located: "+discountInput.isDisplayed());
	   
	   //25.place order button
	   WebElement order=driver.findElement(By.xpath("(//button[@title=\"Place Order\"])[2]"));
	   System.out.println("the place ordeer is located: "+order.isDisplayed());
	   
	   //26 whatsapp icon
	   WebElement appIcon=driver.findElement(By.xpath("//div[@class=\"whatsAppIcon\"]/child::a/img"));
	   System.out.println("the whatsapp icon is located: "+appIcon.isDisplayed());
	   
	   //27. Khelmart icon
	   WebElement webIcon=driver.findElement(By.xpath("//a[@class=\"logo\"]/child::picture[1]/img"));
	   System.out.println("the Khelmart icon is located: "+webIcon.isDisplayed());
	   
	   //28. Read more text in resource
	   driver.navigate().back();
	   driver.navigate().back();
       WebElement resource=driver.findElement(By.xpath("(//li[@class=\"item level0 level-top\"]/a)[2]"));
       resource.click();
       Thread.sleep(2000);
	   WebElement readmore=driver.findElement(By.xpath("(//div[@class=\"post-footer\"])[1]/child::a"));
	   System.out.println("the read more is located: "+readmore.isDisplayed());
	   
	   //29. date of publish
	   WebElement date=driver.findElement(By.xpath("(//div[@class=\"post-item-date\"]/span)[1]"));
	   System.out.println("The date of publish is: "+date.getText());
	   
	   //30.view more in home page
	   WebElement home=driver.findElement(By.xpath("//a[@title=\"Go to Home Page\"]"));
	   home.click();
	   Thread.sleep(1000);
	   WebElement viewMore =driver.findElement(By.xpath("//div[@class=\"bc-actions space-md\"]/a"));
	   viewMore.click();
	   Thread.sleep(2000);
	   driver.navigate().back();
	   Thread.sleep(2000);
	   System.out.println("the view more is located: "+viewMore.isDisplayed());
	   
	   driver.close();  
	}	
}
