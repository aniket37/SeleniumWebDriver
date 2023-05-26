package ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_Shot_REcord {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

// to start recording
		ScreenRecorderUtil.startRecord("main");

		driver.get("https://blazedemo.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement e0 = driver.findElement(By.name("fromPort"));

		Select dd = new Select(e0);

		dd.selectByValue("Portland");
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.name("toPort"));

		Select dd1 = new Select(e1);
		dd1.selectByValue("Dublin");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//*[@id=\"inputName\"]"));
		name.sendKeys("Aniket");

		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Noida Up India");

		driver.findElement(By.id("city")).sendKeys("sector -2 ");

		driver.findElement(By.name("state")).sendKeys("Uttar Pradesh");

		driver.findElement(By.id("zipCode")).sendKeys("201301");

		WebElement CardType = driver.findElement(By.id("cardType"));
		Select drp = new Select(CardType);
		drp.selectByValue("dinersclub");
		Thread.sleep(2000);

		driver.findElement(By.id("creditCardNumber")).sendKeys("1234000044445555");

		WebElement month = driver.findElement(By.id("creditCardMonth"));
		month.clear();
		month.sendKeys("December");

		WebElement year = driver.findElement(By.id("creditCardYear"));
		year.clear();
		year.sendKeys("2024");

		driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("Aniket Chaudhary");

		driver.findElement(By.name("rememberMe")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);

//code to take Screenshot in next 4 lines 
		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\Ghanendra\\Desktop\\AniketWebdriverScreenshot.png");
		FileUtils.copyFile(src, f2);

// to STOP video recording		
		ScreenRecorderUtil.stopRecord();// to stop recording
		Thread.sleep(3000);
		driver.close();

	}
}
