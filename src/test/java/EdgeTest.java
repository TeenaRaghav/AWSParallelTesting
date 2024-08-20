import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeTest {
@Test
public void edgeTest() throws MalformedURLException {
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setBrowserName("edge");
	URL url = new URL("http:// 192.168.1:4444");
	WebDriver driver = new RemoteWebDriver(url, caps);
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("Selenium Grid");
	driver.close();
	
}
}
