package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerth_demoblaze {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(1000);

		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Aniket");
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("India");
		Thread.sleep(1000);

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Greater Noida");
		Thread.sleep(1000);

		WebElement cc = driver.findElement(By.id("card"));
		cc.sendKeys("1234567789997");
		Thread.sleep(1000);

		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("july");

		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("2023");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(1000);

//		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();

		Thread.sleep(3000);
		driver.close();

	}

}
