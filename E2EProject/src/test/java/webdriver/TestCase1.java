package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		

	}

}
