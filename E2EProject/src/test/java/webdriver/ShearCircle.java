package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShearCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shearcircle.com/login");

		driver.findElement(By.xpath(".//*[@id='navbar-collapse-1']/span/a[2]")).click();
		driver.findElement(By.xpath("html/body/section[2]/div/div/div/div[2]/div/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("saicholitha");

		driver.findElement(By.name("lastname")).sendKeys("anne");

		driver.findElement(By.name("username")).sendKeys("csanne99@gmail.com");
		driver.findElement(By.name("business_name")).sendKeys("cholitha123");
		//driver.findElement(By.name("subdomain")).sendKeys("cholitha123");
		
		WebElement password = driver.findElement(By.xpath("html/body/section[2]/div/div/div/div/form/div[6]/input"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border = '6px groove green'", password);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", password);
		password.sendKeys("cholitha123");
		
		driver.findElement(By.xpath(".//*[@id='register_form']/div[7]/input")).sendKeys("cholitha123");
		driver.findElement(By.xpath(".//*[@id='register_form']/div[8]/div/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='register_form']/div[9]/div/label/input")).click();

driver.findElement(By.xpath(".//*[@id='register_form']/div[10]/button")).click();
		
		
		
		
		
	}

}
