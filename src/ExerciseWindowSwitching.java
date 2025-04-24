import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseWindowSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> iterator = window.iterator();
		
		String parentID = iterator.next();
		String chilID = iterator.next();
		
		driver.switchTo().window(chilID);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentID);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
		
		
	}

}
