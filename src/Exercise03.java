import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String info= driver.findElement(By.cssSelector(".text-center.text-white")).getText();
		
		String[] arr= info.split(" ");
		
		for(String i : arr) {
			System.out.print(i + " ");
		}
		
		String userName= arr[2];
		
		String pass= arr[6]; //learning)
		String[] arr2 = pass.split("");
		
		String s1="";
		String[] s;
		
		for(int i=0; i<arr2.length-1; i++) {
			
			 s= arr2[i];			
			System.out.print(s + " ");			
		}
//		
		s1= s.toString();
		
		System.out.println(" " + s1);
//		driver.findElement(By.id("username")).sendKeys("");
		
	}

}
