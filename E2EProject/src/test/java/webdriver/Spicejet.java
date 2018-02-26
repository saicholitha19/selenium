package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Spicejet {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");

		//driver.findElement(By.xpath(".//*[@id='buttons']/div/div/ul/li[1]/a/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();	
		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[9]/a")).click();
		
		driver.findElement(By.xpath("html/body/form/div[6]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[4]/li[8]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[6]/td[1]/a")).click();
		
		new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']"))).selectByVisibleText("4");
		new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Child']"))).selectByVisibleText("4");
		
		//currency
		new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']"))).selectByVisibleText("USD");
		
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")).click();
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']/option[4]")).click();
		
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']/option[4]")).click();
		
		
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
	
	}
}