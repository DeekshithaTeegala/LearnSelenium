package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeTitleCheck {
	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver",  "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        String expectedtitle="OrangeHRM";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.equals(expectedtitle))
		{
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	        driver.findElement(By.id("welcome")).click();
	        //driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			// driver.findElement(By.linkText("Welcome Linda")).click();
		        
	        WebDriverWait MyWait=new WebDriverWait(driver,10);
	        MyWait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//a[contains(text(),'Logout')]")));
	        
//	        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isEnabled();
//	        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	        System.out.println("end");
			driver.close();
		}
		else
		{           
			System.out.println("Title does not match");
			driver.close();
		}   
	}
}
