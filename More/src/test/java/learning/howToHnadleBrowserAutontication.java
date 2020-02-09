package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class howToHnadleBrowserAutontication {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
