package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginDemo {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		Thread.sleep(3000);
	}

	@Test
	public void verfiyUrl() throws InterruptedException {
		String Actualurl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.saucedemo.com/";
		if (Actualurl.equals(ExpectedUrl)) {
			System.out.println("Correct uRL");
		} else {
			System.out.println("Wrong URL");
		}
		Thread.sleep(2000);
	}

	@Test
	public void VerifyTitle() throws InterruptedException {
		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "Swag Labs";
		if (Actualtitle.equals(ExpectedTitle)) {
			System.out.println("Correct title");
		} else {
			System.out.println("Wrong Title");
		}
		Thread.sleep(3000);
	}

	@Test
	public void VerifyLogin() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);

		driver.close();
	}

}
