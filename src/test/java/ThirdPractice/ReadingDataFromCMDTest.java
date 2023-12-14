package ThirdPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataFromCMDTest {
	
	@Test
	public void passDataFromCMDTest() {
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
		WebDriver driver;

		if(BROWSER.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			
			WebDriverManager.edgedriver().setup();
				  driver = new EdgeDriver();
		}
		
		driver.get(URL);
		}
	
}


			/** mvn -Dtest=ClassName -Dbrowser=browserChoice -Durl="sampleUrl" test **/
//mvn -Dtest=ReadingDataFromCMDTest -Dbrowser=chrome -Durl="https://demowebshop.tricentis.com/" test

//Need to check for Login User name and password, inspect elements also and do it.
