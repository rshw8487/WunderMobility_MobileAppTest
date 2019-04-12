package appium.setup;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppiumDriverBase {

// create global variable

	public static AndroidDriver<?> driver;

//before Test Annotation makes a java function to run every time before a TestNG test case

	@BeforeTest

	public void createAppiumDriver() throws MalformedURLException, InterruptedException {

		// relative path to apk file
		final File classpathRoot = new File(System.getProperty("user.dir"));
		final File appDir = new File(classpathRoot, "src/test/resources/apps/");
		final File app = new File(appDir, "selendroid-test-app-0.17.0.apk");

		// Create object of DesiredCapabilities class

		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Specify the device name

		capabilities.setCapability("deviceName", "SM-N7505");

		// Platform version

		capabilities.setCapability("platformVersion", "4.4.2");

		// platform name

		capabilities.setCapability("platformName", "Android");

		// specify the application package that we copied from appium

		capabilities.setCapability("appPackage", "io.selendroid.testapp");

		// specify the application activity that we copied from appium

		capabilities.setCapability("appActivity", ".HomeScreenActivity");

		// Start android driver I used 4727 port by default it will be 4723

		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4722/wd/hub"), capabilities);

		// Specify the implicit wait of 5 second

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

//After Test Annotation makes a java function to run every time after a TestNG test case

	@AfterTest

	public void afterTest() {
		// quit the driver
		driver.quit();
	}

}
