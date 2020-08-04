package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demorunTest {

	@Test
	public void demorunjenkin() {
		System.setProperty("webdriver.chrome.driver", "E:\\java\\JenkinDemo\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com");
		driver.manage().window();
		System.out.println(driver.getTitle());
		driver.close();


		
		
	}

}
