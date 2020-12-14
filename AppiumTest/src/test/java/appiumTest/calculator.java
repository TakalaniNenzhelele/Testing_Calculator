package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Calculate.calculating;
import Report.reports;
import Utilities.Utilies;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class calculator { 
    
	AppiumDriver<MobileElement>driver;
	calculating obj = new calculating();
	reports rep = new reports();

	 @Test
	public void calculate() throws Exception {
		
	obj.Add();
	
	}

}

