
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Firefox
//		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");
//
//		WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge
//		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//		WebDriver driver2 = new EdgeDriver();
		
//		System.setProperty("webdriver.chrome.driver", "Path of driver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formula1.com/");
//		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		driver.close(); 
		
//		driver.quit(); // for quitting all tab at once
	}

}
