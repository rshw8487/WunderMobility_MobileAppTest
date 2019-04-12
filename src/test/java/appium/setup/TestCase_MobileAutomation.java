package appium.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestCase_MobileAutomation extends AppiumDriverBase {

	// Test Annotation changes any java function to TestNG test case

	@Test
	public void StartRegistration() throws Exception {

		// Enter the text in textbox

		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']"))
				.sendKeys("Wunder Test");

		// click on registration button

		driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();

		// Wait for 10 second

		Thread.sleep(10000);

		// Fill registration form data

		WebElement element;

		// Username
		element = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		element.sendKeys("Wunder Test");

		// E-mail
		element = driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		element.sendKeys("rshw8487@gmail.com");

		// Password
		element = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		element.clear();
		element.sendKeys("Travel123");

		// Name
		element = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		element.clear();
		element.sendKeys("Rahul");

		// Select Programming language
		element = driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
		element.click();

		element = driver.findElement(By.id("android:id/text1"));
		element.click();

		// Accept adds
		element = driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));
		element.click();

		// Register user
		element = driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser"));
		element.click();

		// Confirm registration
		element = driver.findElement(By.id("io.selendroid.testapp:id/buttonRegisterUser"));
		element.click();

	}

	@Parameters({ "driver" })

	@Test
	// Creation of second scenario for 'Web view interaction'on selendroid app

	public void WebViewInteraction() throws Exception {
		// Web View interaction details
		WebElement element;
		// click on Icon to fill Web Interaction details
		element = driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview"));
		element.click();

		// select Webdriver Test file
		element = driver.findElement(By.id("io.selendroid.testapp:id/spinner_webdriver_test_data"));
		element.click();

		element = driver.findElement(By.id("android:id/text1"));
		element.click();

		// Enter name
		element = driver.findElement(By.xpath("//*[@content-desc ='Enter your name here!']"));
		element.click();
		
		WebElement toClear = driver.findElement(By.xpath("//*[@content-desc ='Enter your name here!']"));
		
		toClear.sendKeys(Keys.CONTROL + "a");
		//toClear.sendKeys(Keys.DELETE);
		toClear.clear();
		

		// Select prefered card
		element = driver.findElement(By.xpath("//*[@content-desc = 'Volvo']"));
		element.click();

		element = driver.findElement(By.id("android:id/text1"));
		element.click();

		// Send name to view the details
		element = driver.findElement(By.xpath("//*[@content-desc = 'Send me your name!']"));
		element.click();

	}

}
