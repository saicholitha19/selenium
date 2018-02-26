package webdriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetwithRandomnum {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(8);
		System.out.println("Randomnumber is : " + num);
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");

		new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']"))).selectByIndex(num);
		int currencyNo = r.nextInt(3);
		if (currencyNo == 0) {
			currencyNo = 1;
		}
		//currenc-y dropdown script
		

	}
}