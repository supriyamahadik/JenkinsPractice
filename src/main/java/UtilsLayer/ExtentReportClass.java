package UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass extends BaseClass {

	public static ExtentReports extentreports;

	public static void reportsSetup() {
		ExtentSparkReporter extentsparkreporter=new ExtentSparkReporter("C:\\Users\\DELL\\eclipse-workspace\\HybridFrameworkFinal\\ALLReportsFolder\\"+System.currentTimeMillis()+".html");
		extentreports=new ExtentReports();
		extentreports.attachReporter(extentsparkreporter);
	}
	
	public static String captureScreenShot(String foldername, String methodname)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String des=System.getProperty("user.dir")+"\\"+foldername+"\\"+methodname+""+System.currentTimeMillis()+".png";
		
		try {
			FileUtils.copyFile(src, new File(des));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return des;
	}

}
