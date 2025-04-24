import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String name= "Max";
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept(); //accept
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss(); //cancel
	

		System.out.println(driver.findElement(By.id("alertbtn")).isDisplayed());
	}

}
