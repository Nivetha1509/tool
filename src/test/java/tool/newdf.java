package tool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newdf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected="What warranty does Urban Ladder have for its products?";
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.urbanladder.com/");
	   driver.findElement(By.xpath("//*[@id=\'header\']/section/div/ul[1]/li[1]/a")).click();
	   Thread.sleep(1000);
	   WebElement help= driver.findElement(By.id("help-center-search-input"));
	   help.sendKeys("Warranty");
	   Thread.sleep(1000);
	   help.sendKeys(Keys.ARROW_DOWN);
	   help.sendKeys(Keys.ENTER);
	   //String actual=driver.findElement(By.xpath("//*[@id=\'3574\']/div[2]/div)")).getAttribute("innerHTML");
	   System.out.println(driver.findElement(By.xpath("//*[@id=\"3574\"]/div[2]/div")).getAttribute("innerHTML"));
	  
	}

}
