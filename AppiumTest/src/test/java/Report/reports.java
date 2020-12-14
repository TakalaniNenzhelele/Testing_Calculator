package Report;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.windows.WindowsDriver;

public class reports {
	
	

	//Method to create a report
	public void extentReporter(AppiumDriver<MobileElement> driver) throws Exception
	{
	
		ExtentHtmlReporter HtmlReporter = new ExtentHtmlReporter("./Report/file.html");
		ExtentReports Report = new ExtentReports();
		Report.attachReporter(HtmlReporter);
			 
		ExtentTest logger = Report.createTest("Mobile Addition Test");
		logger.assignAuthor("Nenzhelele Takalani");
			
		String Picture =  ".r-img{width:30%}";
		HtmlReporter.config().setCSS(Picture);
		//logger.pass("First number is 3", MediaEntityBuilder.createScreenCaptureFromPath("." +Takeshoot(driver, "fNumber")).build());
	    logger.pass("Two numbers added and the answer is 3", MediaEntityBuilder.createScreenCaptureFromPath("." +Takeshoot(driver)).build());
		Report.flush();
		
	}// end of method	
	
	
	//Method to Take a ScreenShoot
		public String Takeshoot(AppiumDriver<MobileElement> driver)
		{

			 String path="";
			 try {
				  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
				  String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
				  path = "./Screenshots/"+timeStamp+".png";
				  FileUtils.copyFile(srcFile, new File(path));// copying screenshot to directory
			     } 
			 catch (Exception e) {
				 e.printStackTrace();
				 }
			 return path; 
	    }// end of method

}
