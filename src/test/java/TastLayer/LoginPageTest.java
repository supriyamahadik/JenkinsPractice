package TastLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

@Test(groups={ "loginpage" })
public class LoginPageTest extends BaseClass {

	private LoginPage loginpage;
	
	@BeforeTest
	public void setup() {
		BaseClass.initialization();
	}
	
	@Test
	public void login() {
		loginpage=new LoginPage();
		loginpage.loginPagefun(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
