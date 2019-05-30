package util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BrowserFactory {
	
static WebDriver driver;

@SuppressWarnings("rawtypes")
public static WebDriver startBrowser(String browserName, String url ) throws MalformedURLException, InterruptedException{
	
	
	if (browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	if (browserName.equalsIgnoreCase("AndroidBrowser"))
	{
		DesiredCapabilities capb=new DesiredCapabilities();
		capb.setCapability("platformName", "Android");
		capb.setCapability("platformVersion", "7.0");
		capb.setCapability("deviceName", "emulator-5554");
		capb.setCapability("browserName", "Browser");
		
		driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capb);
		
		Thread.sleep(9000);
		
		
	}	
		
	driver.get(url);
	return driver;
}

}
