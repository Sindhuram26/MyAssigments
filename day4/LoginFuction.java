package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFuction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		//Java Wait
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Salesforce")) {
			System.out.println("We are in the right page");
		}
		
		else {
			System.out.println("We are in the wrong page");
		}
		// TODO Auto-generated method stub
		
		driver.close();

	}

}
