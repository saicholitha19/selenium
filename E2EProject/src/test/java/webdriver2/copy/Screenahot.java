package webdriver2.copy;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenahot {
	public static WebDriver driver;

	public static void screenshot(String name) throws IOException {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		String time = df.format(d);

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(".\\Screenshots\\" + name + time + ".png"));

	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://www.fb.com");
		screenshot("Launch");
		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		screenshot("Email");
		driver.findElement(By.id("pass")).sendKeys("testing");
		screenshot("pass");

	}

}
