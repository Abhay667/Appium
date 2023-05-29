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

public class Drag_and_drop extends BaseTest {
	@Test
	public void drag_and_drop() throws MalformedURLException, InterruptedException
	{
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	WebElement ele=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View[1]"));
	
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	    "elementId", ((RemoteWebElement) ele).getId(),
	    "endX", 470,
	    "endY", 424
	));
	
	 String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
	Assert.assertEquals(result, "Dropped!");
	
	 Thread.sleep(3000);
	 
	}
	
	

}
