import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
	
	public static String getPass(WebDriver driver) throws InterruptedException {
//		System.out.println("lllk");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		System.out.println("kk");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String errorText= driver.findElement(By.cssSelector("form p")).getText();
		String[] passKey= errorText.split("'");
		
		String password= passKey[1].split("'")[0];
		
//		System.out.println(password);
		return password;
		
//		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		String name= "Pratik";
		String pass= getPass(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
//		driver.close();
	}

}
