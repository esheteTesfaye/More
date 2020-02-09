package learning;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handelingCookie {
	WebDriver driver;
	
	public  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",utility.PathList.chromeDriver);
		 driver = new ChromeDriver();
     
	// Go to the correct domain
	driver.get("http://objectivewellness");
	// Now set the cookie. This one's valid for the entire domain
	Cookie cookie = new Cookie("key", "value");
	driver.manage().addCookie(cookie);

	// And now output all the available cookies for the current URL
	Set<Cookie> allCookies = driver.manage().getCookies();
	for (Cookie loadedCookie : allCookies) {
	    System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
	}

	// You can delete cookies in 3 ways
	// By name
	//driver.manage().deleteCookieNamed("CookieName");
	// By Cookie
	//driver.manage().deleteCookie(loadedCookie);
	// Or all of them
	//driver.manage().deleteAllCookies();

}
}
