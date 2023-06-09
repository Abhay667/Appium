package abhay;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest {
	@Test
	public void wifiSettingsName() throws MalformedURLException
	
	{
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//Preferences 
		

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		//Preferences Dependencies 

		driver.findElement(AppiumBy.id("android:id/checkbox")).click(); 
		// check box
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		// using [2] index of 'WIFI settings' 
		
		String alerttitle =driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		// extracting  from Pop UP title
		Assert.assertEquals(alerttitle,"WiFi settings");
		//using assertions to verify values 
		
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Abhay's wifi");
		// sending data by using 'sendKeys' .
		
	    
	    driver.findElements(AppiumBy.className("android.widget.Button")).get(1).clear();
	    //second index 
	    
	}
	// using 'Appium By' for Appium only.  findElement,using accessibility, click() is an event. 
	//  how to prepare x path?
   //  //tagName[@attribute='value']
  //   Accessibility id is always unique use it if available
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox")).click(); 
	//this is not appropriate(recommended) 
 //	driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click(); you can use id as well instead of xpath in Preference dependencies.
// try to use AppiumBy(future proof)	
	
	//driver.findElement(By.xpath("//android.widget.RelativeLayout")).click(); (x path can also be used by // tag name )
	//driver.findElement(AppiumBy.id("android:id/button1")); for buttons you can use unique id
	
	

}
