package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunningAllClassUsingCMDTest {

			//Pushing From Git
	
	@Test
	public void amazonURLTest() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon connected");
		
	}

}
					/** Syntax :  
					 * mvn test **/
				//Running all the test: mvn test


