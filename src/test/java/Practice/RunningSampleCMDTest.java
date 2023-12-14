package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunningSampleCMDTest {
	
	@Test
	public void googleURLTest() {
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Google Connected");
	}

}


/** Right Click on Project -> Show in System Explorer -> Enter CMD on search Bar ->
 * mvn -v
 * mvn clean
 * mvn validate
 * mvn compile
 * mvn test
 */
					/** mvn test **/
				//Running all the test