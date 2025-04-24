import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollingHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum =0;
		
		for(int i=0; i<values.size(); i++) {
			
			sum= sum + Integer.parseInt(values.get(i).getText());
		}
		
		String s = driver.findElement(By.className("totalAmount")).getText();
		
		String[] s1 = s.split(":");
		int s2= Integer.parseInt(s1[1].trim());
		
		if(sum== s2) {
			
			System.out.print(s2);
		}
		
	}	
}
