package seleniumdemos;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("deekshitha.teegala850@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("deekshitha@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		String expectedtitle="Demo Web Shop";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("You are on the correct page");
			driver.close();
		}
		else
		{
			System.out.println("You are on the wrong page");
			driver.findElement(By.linkText("Log out")).click();
			driver.close();
		}
		
		
		
	}
}
