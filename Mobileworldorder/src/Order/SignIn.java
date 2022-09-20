package Order;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
	@Test

	public void signin() {
		// TODO Ao-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/bhavitha.chiramana/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com");
	Landingpage ob = new Landingpage (driver);
    ob.SignIn("Bhavithachiramana", "bhavitha19");
	}

}
