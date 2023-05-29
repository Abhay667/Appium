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

public class Swipe_gesture extends BaseTest {
	@Test
	public void swipegesture() throws MalformedURLException, InterruptedException
	{
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
    WebElement ele = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));    
    String att_name = ele.getAttribute("focusable");
//    System.out.println(att_name);
    Assert.assertEquals(att_name,"true");
    
//    ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//    	   "elementId", ((RemoteWebElement) ele).getId(),                
//    	    "direction", "left",
//    	    "percent", 0.75
//    	));
    swipe_action(ele,"left"); // calling the swipe_method
    //swipe logic
    WebElement ele2 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[2]"));    
    String att_name2 = ele2.getAttribute("focusable");
//    System.out.println(att_name2);
    Assert.assertEquals(att_name2,"true");
   
    
	}
	
	

}
