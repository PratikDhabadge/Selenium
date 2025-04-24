import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		
		WebElement element= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
//		a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		//CAPITAL LETTERS
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//hover
		a.moveToElement(element).build().perform();
		
		//Double Click
		a.moveToElement(element).contextClick().build().perform();
	}

}
