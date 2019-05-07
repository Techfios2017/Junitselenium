package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
@Test
public void TechfiosLoginTest(){
	
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	
	
LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

logintotechfios.Login("techfiosdemo@gmail.com", "abc123");

driver.close();

driver.quit();

}
 

}
