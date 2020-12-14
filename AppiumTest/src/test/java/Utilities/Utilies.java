package Utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Utilies {

	static AppiumDriver<MobileElement>driver;
	
	public  DesiredCapabilities CalculatorCapability() throws Exception { //method to set capabilities
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName", "sdk_gphone_x86");
	cap.setCapability("udid", "emulator-5554");
	cap.setCapability("platformName", "android");
	cap.setCapability("platformVersion", "R");
	cap.setCapability("appPackage", "com.google.android.calculator");
	cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	return cap;
	}
	
	
	
	public URL urlServer() { // method for url appium server
		
	URL url = null;
	try {
		url = new URL("http://127.0.0.1:4723/wd/hub");
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	}
	return url;
	
	
	}
}
