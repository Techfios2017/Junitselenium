package test;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
@Test
public void TechfiosLoginTest() throws MalformedURLException, InterruptedException{
	
WebDriver driver = BrowserFactory.startBrowser("AndroidBrowser", "http://techfios.com/test/billing/?ng=login/");

//Thread.sleep(9000);
	
LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

//Thread.sleep(9000);

logintotechfios.Login("techfiosdemo@gmail.com", "abc123");

//Thread.sleep(9000);

driver.close();

//Thread.sleep(9000);

driver.quit();

}
 

}
