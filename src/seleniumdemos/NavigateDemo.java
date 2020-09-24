package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.navigate().refresh();
		
		driver.close();
	}

}
