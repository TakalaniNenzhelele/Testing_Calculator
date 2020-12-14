package Calculate;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import Data.ExcelData;
import Report.reports;
import Utilities.Utilies;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class calculating {

	static AppiumDriver<MobileElement>driver;
	Utilies obj = new Utilies();
	reports rep = new reports();
	ExcelData info = new ExcelData();
	
	
	public void Add() throws Exception { // method to add
		
		DesiredCapabilities cap = obj.CalculatorCapability();
		URL url = obj.urlServer();
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application started........");
		
		
		MobileElement One = driver.findElement(By.id("com.google.android.calculator:id/digit_"+info.getcell(1, 0)));
		One.click();
		MobileElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		plus.click();
		MobileElement Two = driver.findElement(By.id("com.google.android.calculator:id/digit_"+info.getcell(1, 2)));
		Two.click();
		MobileElement Result = driver.findElement(By.id("com.google.android.calculator:id/eq")); 
		Result.click();
		rep.extentReporter(driver);
		MobileElement Final = driver.findElement(By.className("android.widget.TextView"));
		
		System.out.println("Results : "+Final.getText());
		System.out.println("Adding Completed");
		
		
	}
	
}
