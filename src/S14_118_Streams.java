import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S14_118_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		elementList.forEach(s->System.out.print(s +" "));
		
		List<String> originalList = elementList.stream().map(s-> s.getText()).collect(Collectors.toList());
		originalList.forEach(s->System.out.println(s));
		System.out.println();
		
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(s->System.out.println(s));
		System.out.println();
		
		Assert.assertTrue(originalList.equals(sortedList));

	}

}
