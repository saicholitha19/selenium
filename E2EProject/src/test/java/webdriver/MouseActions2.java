package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions2 {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		//omplisit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
		Actions a = new Actions(driver);
		
		//RightClick
		//a.moveToElement(target)
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
	
		
		a.dragAndDrop(draggable, droppable).build().perform();
		
		
		
		
		
	}
}
