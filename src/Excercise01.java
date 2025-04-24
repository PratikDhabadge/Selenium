import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Excercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		Assert.assertFalse(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		
		System.out.println("Successfull");

	}

}
