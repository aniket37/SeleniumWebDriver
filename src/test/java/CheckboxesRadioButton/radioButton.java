package CheckboxesRadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(3000);

		List<WebElement> rad = driver.findElements(By.xpath("//input[@type='radio' and contains(@id,'male')]"));
		System.out.println(rad.size());

		for (WebElement i : rad) {
			String radi = i.getAttribute("id");
			System.out.println(radi);
			if (radi.equals("female")) {
				i.click();
			}
		}

		// for experience year selections
		Thread.sleep(2000);
		List<WebElement> exp = driver
				.findElements(By.xpath("// label[@class='custom-control-label' and contains(@for,'year')]"));
		System.out.println("The number of element in year xpath" + exp.size());
		for (WebElement j : exp) {

			String ex = j.getAttribute("for");
			System.out.println(ex);
			if (ex.equals("1year") || ex.equals("4years")) {
				j.click();
			}
			Thread.sleep(1000);
		}

		Thread.sleep(2000);
		driver.close();

	}

}
