import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFromNextTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles(); // [parent, child]
		
		Iterator<String> iterator = windows.iterator();
		
		String parentID = iterator.next();
		
		String childID = iterator.next();
		
		driver.switchTo().window(childID);
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String mailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.print(mailId);
		driver.switchTo().window(parentID);
		
		driver.findElement(By.id("username")).sendKeys(mailId);

	}

}
