package seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		
//		WebElement year=driver.findElement(By.xpath("//select[@placeholder='Year']"));
//		Select sel=new Select(year);
//		sel.selectByValue("1999");
//		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel1=new Select(month);
		
		List<WebElement> monthcount=sel1.getOptions();
		System.out.println(monthcount.size());
		
		for(int i=0;i<monthcount.size();i++)
		{
			System.out.println(monthcount.get(i).getText());
		}
		
		sel1.selectByIndex(5);
		
//		WebElement date=driver.findElement(By.xpath("//select[@placeholder='Day']"));
//		Select sel2=new Select(date);
//		sel2.selectByVisibleText("4");
//		
//		driver.close();
		
	}

}
