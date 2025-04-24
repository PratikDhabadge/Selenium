import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void addItem(WebDriver driver) {

//		String[] products= {"Brocolli - 1 Kg", "Cucumber - 1 Kg"}; without split method used
		String[] products = { "Brocolli", "Carrot", "Beetroot" };
		List items = Arrays.asList(products); // for inbuild methods of list

		List<WebElement> options = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;
		for (int i = 0; i < options.size(); i++) {

			String[] opt = options.get(i).getText().split("-");
			String formattedOpt = opt[0].trim();

//			System.out.println(opt);

			// without split method
//			if(items.contains(opt)) {

//			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//			break; }

			if (items.contains(formattedOpt)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(i);

				if (j == products.length) {
					break;
				}

//				break;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		addItem(driver);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
//		**************Explicit wait**************
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());




	}
}
