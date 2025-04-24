import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://qaclickacademy.com/practice.php");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		int a = footerdriver.findElements(By.tagName("a")).size();

		System.out.print(a);

		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			columndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
