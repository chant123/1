import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaidu {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
WebDriver dr =  new FirefoxDriver();
dr.get("http://www.baidu.com");
dr.findElement(By.id("kw")).sendKeys("hello Selenium");
dr.findElement(By.id("su")).click();
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
      
dr.quit();
}
 
}