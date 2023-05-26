package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[23]/a")).click();

		Thread.sleep(3000);
//three navigation methods are given below		
		driver.navigate().back();

		Thread.sleep(2000);
		driver.navigate().refresh();

		Thread.sleep(2000);
		driver.navigate().forward();

		Thread.sleep(2000);
		driver.close();

	}

}
