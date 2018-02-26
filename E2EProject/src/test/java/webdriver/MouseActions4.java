package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/tooltip/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        
			
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("html/body/p[4]/input"))).build().perform();
		
		boolean tootlTip = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']/div[1]")).isDisplayed();
		
		if (tootlTip) {
			String tooltipText = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']/div[1]")).getText();
			System.out.println(tooltipText);
			
		} else {
			driver.quit();

		}
		
		
		
		
		
		
		
	}

}
