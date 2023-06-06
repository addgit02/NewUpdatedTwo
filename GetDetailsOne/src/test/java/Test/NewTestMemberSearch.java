package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTestMemberSearch {
	WebDriver driver;

	@Test
	public void findMember() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println("Hello Brother and Sister !!!!");
		Thread.sleep(5000);
		driver.close();
			}
}