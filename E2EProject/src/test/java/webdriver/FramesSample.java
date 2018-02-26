package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://mis.nyiso.com/public/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Frame count "123"  123
		driver.switchTo().defaultContent();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
		//return numberOfFrames;
			
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("html/body/table/tbody/tr[6]/td/a")).click();;
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("html/body/table/tbody/tr[8]/td[2]/span"))).build().perform();

		boolean timestamp = driver.findElement(By.xpath("html/body/table/tbody/tr[8]/td[2]/span")).isDisplayed();

		if (timestamp) {
			String timestamptext = driver.findElement(By.xpath("html/body/table/tbody/tr[8]/td[2]/span")).getText();
			System.out.println(timestamptext);

		} else {
			driver.quit();

		}

	}

}
