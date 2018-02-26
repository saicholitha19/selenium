package webdriver;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import jxl.JXLException;
	import jxl.Sheet;
	import jxl.Workbook;

	public class AddingSplitwisegroups {

		public static void main(String[] args) throws JXLException, IOException, InterruptedException {
			// TODO Auto-generated method stub

			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://secure.splitwise.com/");
			// implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			FileInputStream fi = new FileInputStream(".\\TestData\\TD.xls");
			Workbook w = Workbook.getWorkbook(fi);

			Sheet s = w.getSheet("Sheet2");

			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("user_session_email")).sendKeys("cholitasai99@gmail.com");
			driver.findElement(By.id("user_session_password")).sendKeys("A8985064190");
			driver.findElement(By.name("commit")).click();

			Thread.sleep(3000);

			// Always take Row is 'i' , coloumn is 'j'
			System.out.println("row count" + s.getRows());
			System.out.println("colom count" + s.getColumns());
		
			for (int i = 1; i < s.getRows(); i++) {
				// add button
				driver.findElement(By.xpath("//*[@id=\'view_links\']/div[i]/div[1]/div/a")).click();
				Thread.sleep(3000);
				// Enter Group name
				driver.findElement(By.id("group_name")).clear();
				driver.findElement(By.id("group_name")).sendKeys(s.getCell(0, i).getContents());
				Thread.sleep(3000);
				// Add name of the group memebers
				for (int j = 1; j < s.getColumns(); j++) {

					if (!s.getCell(j, i).getContents().equals("NA")) {
						// add user
						// driver.findElement(By.xpath("//*[@class='name
						// ui-autocomplete-input']")).clear();
						driver.findElement(By.xpath("html/body/div[2]/div[2]/div/form/div[2]/div[1]/div[1]/div[" + (2 + j) + "]/div/div/input[1]")).sendKeys(s.getCell(j, i).getContents());
						Thread.sleep(2000);
						// adding a new user
						if (j >= 3) {
							driver.findElement(By.xpath("//*[@id=\'manual_entry\']/a")).click();
							Thread.sleep(3000);
						}
					} else {
						break;
					}

				} // j for loop
				driver.findElement(By.name("commit")).click();
				Thread.sleep(3000);
			} // i for loop

		}

	}

	
	
	
	


