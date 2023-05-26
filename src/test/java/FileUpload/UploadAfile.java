package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadAfile {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);

//		1st method long method

		WebElement ele = driver.findElement(By.id("file-upload"));

		// here we gave path of a file from our computer
		ele.sendKeys("C:\\Users\\Ghanendra\\Desktop\\AniketWebdriverScreenshot.png");

		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2090);

		driver.navigate().back();
		Thread.sleep(2090);

//		short  method without object creation
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Ghanendra\\Pictures\\Screenshots\\Git Codes.png");
		driver.findElement(By.id("file-submit")).click();

		Thread.sleep(2090);
		driver.close();

	}

}
