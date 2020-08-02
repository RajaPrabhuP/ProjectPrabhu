package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class demorunjenkin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java\\JenkinDemo\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
