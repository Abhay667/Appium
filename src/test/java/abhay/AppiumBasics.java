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
//		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		//driver.findElement(By.xpath("//android.widget.RelativeLayout")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alerttitle =driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alerttitle,"WiFi settings");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("my wifi");
	    //driver.findElement(AppiumBy.id("android:id/button1"));
	    driver.findElements(AppiumBy.className("android.widget.Button")).get(1).clear();
	    
	}
	
	

}
