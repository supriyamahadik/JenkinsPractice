package TastLayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
@Test(groups={ "homepage" },dependsOnGroups={ "loginpage" })
public class HomePageTest extends BaseClass {
	
	HomePage homepage;
	@Test(priority=1)
	public void logo()
	{
		 homepage=new  HomePage();
	}

	@Test(priority=2)
	public void tille()
	{
		System.out.println(homepage.captureTitle());
	}
	
	@Test(priority=3)
	public void url()
	{
		System.out.println(homepage.captureCurrentURL());
	}
}
