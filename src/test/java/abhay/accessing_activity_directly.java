package abhay;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class accessing_activity_directly extends BaseTest {
	@Test
	public void Direct_access_activity() throws MalformedURLException
	
	{
	
		
		
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		
		
		//***accessing activity directly******
		
		Activity val =new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(val);
		
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
			
	    
	}
	
	

}
