import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		List<WebElement> allOptions= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : allOptions) {
			
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
		}
	}

}
