package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class SignUp
{	
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavitha.chiramana\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
    
  
	driver.get("https://mobileworld.banyanpro.com/");
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.cssSelector("a[href='signup.html']")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.id("myName")).sendKeys("Bhavitha");
    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("chiramana");
    driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("bhavitha.chiramana@gmail.com");
    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("bhavitha@19");
    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("19/11/2001");
    driver.findElement(By.cssSelector("div[class='col-md-2'] input[name='gender']")).click();
    driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("9014322699");
    driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("Hello");
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  

}
}
