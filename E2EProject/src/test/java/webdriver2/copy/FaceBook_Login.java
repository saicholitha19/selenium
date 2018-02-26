package webdriver2.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//*[@value='First Name']")).sendKeys("sari");
		driver.findElement(By.xpath("//*[@value='Last Name']")).sendKeys("chary");

		driver.findElement(By.id("u_0_5")).sendKeys("sari@mail.com");

		driver.findElement(By.id("u_0_8")).sendKeys("sari@mail.com");
		driver.findElement(By.id("u_0_a")).sendKeys("abc12345");
		new Select(driver.findElement(By.xpath("//*[@name='birthday_day']"))).selectByVisibleText("3");

		new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByValue("11");

		new Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByValue("1987");
		driver.findElement(By.xpath("//*[@id='u_0_g']/span[1]/label")).click();
		driver.findElement(By.xpath("//*[@id='u_0_i']")).click();
	}
}