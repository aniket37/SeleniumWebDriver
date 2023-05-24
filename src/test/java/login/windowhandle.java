package login;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		String Wid = driver.getWindowHandle();
		System.out.println(Wid);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Thread.sleep(4000);

		Set<String> wids = driver.getWindowHandles();

		List<String> windowlist = new ArrayList<String>(wids);
		String pwid = windowlist.get(0);

		System.out.println("The parent window id :" + pwid);

		String cwid = windowlist.get(1);
		System.out.println("the child window id :" + cwid);

		Thread.sleep(3000);

		driver.switchTo().window(pwid);

		System.out.println("the page details=: " + driver.getTitle());
		driver.switchTo().window(cwid);

		System.out.println("the page details = : " + driver.getTitle());
		Thread.sleep(4000);

		driver.quit();

	}

}
