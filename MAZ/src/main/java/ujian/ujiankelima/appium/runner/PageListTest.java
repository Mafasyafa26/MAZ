package ujian.ujiankelima.appium.runner;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import ujian.ujiankelima.appium.pageobject.Keep;
import ujian.ujiankelima.appium.pageobject.PageList;

public class PageListTest {
	private static AndroidDriver<MobileElement> driver;
	private PageList pageList;
	
	@BeforeTest
	public void befTest(){
		try {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "A5010");
		capabilities.setCapability("udid", "127.0.0.1:21513");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.1.2");
		capabilities.setCapability("appPackage", "com.socialnmobile.dictapps.notepad.color.note");
		capabilities.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		System.out.println("DRIVER : "+driver);
		pageList = new PageList(driver);
		
		} catch (MalformedURLException e){
			e.printStackTrace();
		}

	}
	
	@Test 
	public void testList() throws InterruptedException {
		pageList.listCoba("Masak" , "Ayam");
		assertEquals(pageList.getText(), "Search");
	}
	
	
	@AfterTest
	public void closeApp() {
		driver.quit();
	}	
}
