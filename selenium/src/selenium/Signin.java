package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Signin {
	   
		
	{
        
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavitha.chiramana\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
	    WebDriver driver = new ChromeDriver();
	     driver.get("https:mobileworld.banyanpro.com/");
	     driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
	     driver.manage().window().maximize();
         
         driver.findElement(By.id("username")).sendKeys("Bhavitha");
         driver.findElement(By.id("password")).sendKeys("Bhavi@19");
         try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
         driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
}
}
