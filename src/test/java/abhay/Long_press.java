package abhay;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Long_press extends BaseTest {// inheriting base class to access objects 
	@Test
	public void Longpressgesture() throws MalformedURLException, InterruptedException
	{
		//Views->expandable lists->Cursor adaptor -> sample names(long press)
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	// click on 'Views' ,using accessibility id
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
	//click on Expandable lists , using X path
	
	System.out.println("passed view element");
	// just debugging
	
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		//click on Custom Adapter ,using accessibility id 
		
		WebElement ele= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]"));
		long_press(ele);
		//Thread.sleep(200);
		
		 String text = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		 Assert.assertEquals(text,"Sample menu");
	    Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/alertTitle")).isDisplayed());
	    
	}
	
	

}
