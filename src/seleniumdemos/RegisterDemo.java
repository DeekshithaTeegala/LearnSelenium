package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		driver.findElement(By.name("FirstName")).sendKeys("deekshitha");
		driver.findElement(By.name("LastName")).sendKeys("teegala");
		driver.findElement(By.id("Email")).sendKeys("deekshitha.teegala85@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("deekshitha@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("deekshitha@123");
		
		driver.findElement(By.id("register-button")).click();
		driver.close();

		
	}

}
