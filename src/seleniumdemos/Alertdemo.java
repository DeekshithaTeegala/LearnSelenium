package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK& Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert1=driver.switchTo().alert();
		String alertmessage1=driver.switchTo().alert().getText();
		System.out.println(alertmessage1);
		Thread.sleep(3000);
		alert.dismiss();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert2=driver.switchTo().alert();
		alert.sendKeys("priya");
		Thread.sleep(3000);
		alert.accept();
		
		
		
	}

}
