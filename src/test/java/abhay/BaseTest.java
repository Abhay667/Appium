package abhay;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass; // to run TestNG

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver; // for Android Driver class
import io.appium.java_client.android.options.UiAutomator2Options; // for UiAutomator2Options class
import io.appium.java_client.service.local.AppiumDriverLocalService; // for @BeforeClass
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver; // globally declaring AndroiDriver object
	public AppiumDriverLocalService service; // globally declaring AppiumDriverLocalService object
	@BeforeClass // execute everything before executing sub class
	
	public void configureAppium() throws MalformedURLException
	{

		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib//main.js"
				+ ""))//  Appium driver object
			.withIPAddress("127.0.0.1").usingPort(4723) // not working  
			.build();
		//service.start();
				
				
		UiAutomator2Options options =new UiAutomator2Options();
		// class which provides configuration details
		options.setDeviceName("samsung SM-J210F");
		options.setApp("C:\\Users\\HP\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk"); // path of app right click on apk-> properties.
		
		
		
		
		
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options); // wrap in URL class
		// its local machine IP, capabilities 
		// driver object use to perform actions
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));// wait until you find that element , at most for 7 seconds
	}
	public void long_press(WebElement ele)
	{
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
			"duration",2000));
	}
	
	public void scroll()
	{
		boolean canScrollMore;
		do
		{
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		}
		while(canScrollMore);
		
	}
	public void swipe_action(WebElement ele ,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
	    	   "elementId", ((RemoteWebElement) ele).getId(),                
	    	    "direction", direction,
	    	    "percent", 0.75
	    	    ));
		
	}
	
	@AfterClass // it will execute after each and every code will execute
	public void tearDown()

	{
		driver.quit();// to stop driver, accessing driver object
		 service.stop();
	}
}
