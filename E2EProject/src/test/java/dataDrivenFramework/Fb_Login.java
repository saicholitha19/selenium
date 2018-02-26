package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Fb_Login {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FileInputStream fi = new FileInputStream(".\\TestData\\TD.xls");
		Workbook w = Workbook.getWorkbook(fi);
		
		Sheet s=w.getSheet("Sheet1");
		 

		driver.findElement(By.name(s.getCell(2, 1).getContents())).sendKeys(s.getCell(3, 1).getContents());
		driver.findElement(By.id(s.getCell(2, 2).getContents())).sendKeys(s.getCell(3, 2).getContents());
		driver.findElement(By.id(s.getCell(2, 3).getContents())).click();
		
		
		/*driver.findElement(By.id("pass")).sendKeys("pass123");
		driver.findElement(By.id("loginbutton")).click();*/
		}

}
