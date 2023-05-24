package login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.ADD).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.DIVIDE).perform();
		Thread.sleep(1000);
		driver.close();
	}

}
