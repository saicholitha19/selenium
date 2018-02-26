package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertSBI {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.onlinesbi.com/");
		
		driver.findElement(By.xpath("html/body/div[1]/div/div[4]/div[1]/div/a[1]/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='banner']/div[2]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='Button2']")).click();
		Thread.sleep(2000);
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(".//*[@id='login_fields']/div[1]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		String alerttext1 = driver.switchTo().alert().getText();
		System.out.println(alerttext1);
		driver.switchTo().alert().dismiss();		

	}

}
