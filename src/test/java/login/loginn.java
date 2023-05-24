package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginn {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		Thread.sleep(4000);
		String Actualurl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.saucedemo.com/";
		if (Actualurl.equals(ExpectedUrl)) {
			System.out.println("Correct uRL");
		} else {
			System.out.println("Wrong URL");
		}

		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "Swag Labs";
		if (Actualtitle.equals(ExpectedTitle)) {
			System.out.println("Correct title");
		} else {
			System.out.println("Wrong Title");
		}

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

//		driver.navigate().
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("Aniket");

		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Chaudhary");

		WebElement zip = driver.findElement(By.id("postal-code"));
		zip.sendKeys("201301");
		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		String pagesource = driver.getPageSource();
		System.out.println("the source of the page is : " + pagesource);
		driver.close();
	}

}
