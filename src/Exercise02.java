import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Max");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("max@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		driver.findElement(By.id("exampleCheck1")).click();
		
		//static drop down
		driver.findElement(By.className("form-group")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		WebElement options=  driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropDown= new Select(options);
		
		dropDown.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/input[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01-01-2000");
//		driver.findElement(By.id("date-time-edit")).sendKeys("12");
		driver.findElement(By.cssSelector("input[type='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
	}

}
