import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//sometimes index is not allowed in code to select dropdown or other element so traversing from parent to child
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			
			System.out.println("Was not enabled");
			driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		}else {
		
			System.out.println("Was enabled");
		}
	}

}
