package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_sample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		//launch browser: identify supported exe file where the .exe file located in our system
		//System.setProperty("Key","Path of the browser .exe file");
		System.setProperty("webdriver.chrome.driver",  ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//URL type
		driver.get("https://www.facebook.com/");
		//window maximize
		driver.manage().window().maximize();
		
		//get text from application using any locater
		String fbText = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2")).getText();
		System.out.println(fbText);
		
		Thread.sleep(3000);
		//to close the current window
		//driver.close();
		driver.quit();
		
	}

}
