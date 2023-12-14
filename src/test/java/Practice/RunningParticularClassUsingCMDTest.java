package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunningParticularClassUsingCMDTest {
	
	@Test
	public void accessDemoWebShopURLTest() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Demo Web Shop opened");
	}
	
	/// pushing for the third time /// 
	
}

				/**			Syntax :  
				 * mvn -Dtest=ClassName test  **/

				//  mvn -Dtest=OpenDemoWebShopTest test