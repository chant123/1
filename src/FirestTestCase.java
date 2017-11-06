import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

class Webdriver{

	public Object navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class FirestTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.ie.driver", "D:\browser\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\browser\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("12306");
		driver.findElement(By.id("su")).click();
		driver.close();
	}

}