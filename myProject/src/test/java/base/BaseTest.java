package base;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected WebDriver driver;
	
//	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
	
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicit wait
		
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
