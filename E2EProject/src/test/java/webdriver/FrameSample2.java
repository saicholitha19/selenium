package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameSample2 {
	static WebDriver driver;
/*
	public static Integer IframeCount() {
		driver.switchTo().defaultContent();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
		return numberOfFrames;
	}
	public static void switchToFrameByInt(int i) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(i);
	}
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.toyota.co.uk/order-a-brochure");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*int ElementpresenceCount = 0;
		int Loop = 0;
		int maxFramaecount = IframeCount();// 3

		while (ElementpresenceCount < 1) {
			try {
				Thread.sleep(250);
				switchToFrameByInt(Loop);
				ElementpresenceCount = driver.findElements(By.xpath(".//*[@id='car_models']/div/ul/li[1]/div/img")).size();// 1
				System.out.println("Try LoopAllframesAndReturnWebEL Old: " + Loop + "; ElementpresenceCount: " + ElementpresenceCount);
				Loop++;
				if (ElementpresenceCount > 0 || Loop > maxFramaecount) {
					break;
				}
			} catch (Exception ex) {
				System.out.println("Catch LoopAllframesAndReturnWebEL Old: " + Loop + "; " + ex);
			}
		}
		//return ElementpresenceCount;
*/
		driver.switchTo().defaultContent();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
	
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(".//*[@id='car_models']/div/ul/li[1]/div/img")).click();

	}

}
