package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAppGeneralStore {
	@Test
	public void installappgeneralstore() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		//dc.setCapability(MobileCapabilityType.APP,"C:\Users\Dinesh.M\Downloads\General-Store.apk");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		driver.installApp("C:\\Users\\Dinesh.M\\Downloads\\General-Store.apk");
		boolean value = driver.isAppInstalled("com.androidsample.generalstore");
		System.out.println(value);


	}

}
