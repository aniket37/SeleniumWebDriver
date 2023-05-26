package CreateXpath_Video_Record;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CHeckbox {
	public static void main(String[] args) throws Exception {

//		ScreenRecorderUtil.startRecord("main");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(3000);

//FOR MULTIPLE CHECKBOXES 
		driver.findElement(By.id("wednesday")).click();

		List<WebElement> chkboxs = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		Thread.sleep(2000);
		System.out.println("checkbox elements are : " + chkboxs.size());
		Thread.sleep(2000);
		for (WebElement box : chkboxs) {

			String chkn = box.getAttribute("id");
			System.out.println(chkn);

			if (chkn.equals("monday") || chkn.equals("friday")) {
				box.click();
			}

		}
		Thread.sleep(2000);

//FOR RADIO BUTTON 
		driver.findElement(By.id("female")).click();
		Thread.sleep(2000);
		List<WebElement> rad = driver.findElements(By.xpath("//input[@type='radio' and contains(@id,'male')]"));
		System.out.println("radio elements are : " + rad.size());

		for (WebElement radio : rad) {
			String radi = radio.getAttribute("id");
			System.out.println(radi);
			if (radi.equals("male")) {
				radio.click();
			}

		}

//		ScreenRecorderUtil.stopRecord();
		Thread.sleep(3000);
		driver.close();

	}

}
