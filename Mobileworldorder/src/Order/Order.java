package Order;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {
	@Test
    public void order() throws InterruptedException{
    
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/bhavitha.chiramana/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");
    Landingpage ordr = new Landingpage(driver);
    
    ordr.Order("Bhavitha","chiramana","bhavitha.chiramana@gmail.com", "bhavitha@19", "9014322699","olive greens", "Nagawara","Bangalore", "123456", "1", "2");


}

}
