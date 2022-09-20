package Order;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	@Test
	public  void sigin() throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/bhavitha.chiramana/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com");
	Landingpage sup = new Landingpage(driver);
	sup.SignUp("Bhavitha","chiramana","bhavitha.chiramana@gmail.com","bhavitha@19","11/19/2001","9014322699","Hello");



}
}
