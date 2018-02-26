package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	public static void main(String[] args) throws Exception {
		 
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.collegeweeklive.com/");
			
		
		Actions a = new Actions(driver);
		//move mouce pointer to Resource menu
		WebElement ele = driver.findElement(By.xpath("html/body/div[1]/div/div/div/ul[1]/li[9]/a"));
		a.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[3]/a")).click();
		Thread.sleep(5000);		
		//Double click
		a.doubleClick(driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[1]/a"))).build().perform();
		Thread.sleep(5000);
		//RightClick
		a.contextClick(driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[2]/a"))).build().perform();
		
	}

}
