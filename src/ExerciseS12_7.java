import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseS12_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int rows = driver.findElements(By.xpath("//table[@name ='courses']/tbody/tr")).size();
		System.out.println(rows);
		
		int columns= driver.findElements(By.xpath("//table[@name = 'courses']/tbody/tr[1]/th")).size();
		System.out.println(columns);
		
		List<WebElement> ls	=driver.findElements(By.xpath("//table[@name = 'courses']/tbody/tr[3]/td"));
	
		for(WebElement s: ls) {
			System.out.print(" " + s.getText() + "");
		}
//	System.out.println(string);
		
		
	}

}
