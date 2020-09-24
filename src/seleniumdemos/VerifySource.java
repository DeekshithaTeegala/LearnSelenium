package seleniumdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySource {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
	
		String pagetitle=driver.getTitle();
		int titlelength=pagetitle.length();
		System.out.println("Page Title : "+pagetitle+" Title Length: "+titlelength );
		
		String expectedurl="http://demowebshop.tricentis.com/login";
		String actualurl=driver.getCurrentUrl();

		driver.manage().window().maximize();
		
	}

}
