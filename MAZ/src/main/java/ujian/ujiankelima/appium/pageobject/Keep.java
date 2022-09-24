package ujian.ujiankelima.appium.pageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Keep {

	public AndroidDriver<MobileElement> driver;

	public Keep(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Locator number
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip")
	private MobileElement btnStartSkip;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab")
	private MobileElement btnAdd;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]")
	private MobileElement textAdd;
//	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
	private MobileElement isiNote;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement saveBtn;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_btn")
	private MobileElement editBtn;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/color_btn")
	private MobileElement colorBtn;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn8")
	private MobileElement btnGrey;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/text_button_center")
	private MobileElement txtDb;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
//	@AndroidFindBy(id = "")
//	private MobileElement ;
	
	
	public void keepB(String isiNote) throws InterruptedException {
		btnStartSkip.click();
		Thread.sleep(1000);
		btnAdd.click();
		Thread.sleep(1000);
		textAdd.click();
		Thread.sleep(1000);
		this.isiNote.sendKeys(isiNote);
		Thread.sleep(1000);
		saveBtn.click();
		Thread.sleep(1000);
		editBtn.click();
		Thread.sleep(1000);
		colorBtn.click();
		Thread.sleep(1000);
		btnGrey.click();
		Thread.sleep(1000);
		saveBtn.click();
		Thread.sleep(1000);
		saveBtn.click();
		Thread.sleep(1000);
	}

	public String getText() {
		return txtDb.getText();
	}
}
