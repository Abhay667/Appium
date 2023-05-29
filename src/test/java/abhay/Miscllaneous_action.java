package abhay;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Miscllaneous_action extends BaseTest {
	@Test
	public void Misc_actions() throws MalformedURLException
	
	{
	
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		//class for rotation
				DeviceRotation landscape = new DeviceRotation(0, 0, 90);
				driver.rotate(landscape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		String alerttitle =driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alerttitle,"WiFi settings");
		//for clip board
		driver.setClipboardText("my wifi"); // copied to the clip board   
		String ele= driver.getClipboardText(); // paste from the clip board
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(ele);
	    driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	     // performing key elements (back button home button )
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    
	}
	
	

}
