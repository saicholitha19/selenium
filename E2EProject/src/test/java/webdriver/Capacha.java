package webdriver;


import java.io.IOException;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capacha {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("usernameId")).sendKeys("saicholitha");
		driver.findElement(By.name("j_password")).sendKeys("cholitha");

		Scanner abc = new Scanner(System.in);
		String captcha;
		System.out.println("Please Enter the CAPTCHA Code:: ");
		captcha = abc.next();
		System.out.println("Entered  CAPTCHA Code is:: " + captcha);

		driver.findElement(By.id("nlpAnswer")).sendKeys(captcha);

		driver.findElement(By.id("loginbutton")).click();
abc.close();
	}
}