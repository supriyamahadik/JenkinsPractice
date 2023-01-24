package com.BaseLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	 protected static WebDriver driver;
	 protected static Properties prop;
	 
	public BaseClass()  {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Downloads\\Testing_Aug batch\\All Project zip\\Mock_Final HybridFramework\\HybridFrameworkFinal3\\HybridFrameworkFinal\\src\\main\\java\\com\\ConfigLayer\\Config.Properties");
			prop.load(fis);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(prop.getProperty("url"));
	}

}
