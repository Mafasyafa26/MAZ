package ujian.ujiankelima.appium.pageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageList {
	public AndroidDriver<MobileElement> driver;

	public PageList(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Locator number
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip")
	private MobileElement btnStartSkip;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab")
	private MobileElement btnAdd;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	private MobileElement btnList;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/color_btn")
	private MobileElement btnColor;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn7")
	private MobileElement btnHitam;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement addList;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit")
	private MobileElement editList;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement btnOk;
	
	@AndroidFindBy(id = "android:id/button2")
	private MobileElement btnCancel;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement btnSave;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.ImageView")
	private MobileElement btnSearch;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_search")
	private MobileElement txtSearch;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
	
	public void listCoba(String editList, String editList2) throws InterruptedException {
		btnStartSkip.click();
		Thread.sleep(1000);
		btnAdd.click();
		Thread.sleep(1000);
		btnList.click();
		Thread.sleep(1000);
		btnColor.click();
		Thread.sleep(1000);
		btnHitam.click();
		Thread.sleep(1000);
		addList.click();
		Thread.sleep(1000);
		this.editList.sendKeys(editList);
		Thread.sleep(1000);
		btnOk.click();
		Thread.sleep(1000);
		addList.click();
		Thread.sleep(1000);
		this.editList.sendKeys(editList2);
		Thread.sleep(1000);
		btnCancel.click();
		Thread.sleep(1000);
		btnSave.click();
		Thread.sleep(1000);
		btnSave.click();
		Thread.sleep(1000);
		btnSearch.click();
	}

	public String getText() {
		return txtSearch.getText();
	}
}
