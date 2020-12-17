package selenium.dummy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginCheck {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium JARS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.boddess.com/");
		driver.manage().window().maximize();
		String st= driver.getTitle();
		System.out.println(st);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[3]/aside[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id=\"social_login_email\"]")).sendKeys("ayushsharma7923@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"social_login_pass\"]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//*[@id=\"bnt-social-login-authentication\"]")).click();
		Thread.sleep(5000);
		String lt = driver.getTitle();
		System.out.println(lt);
		
		if(lt.equalsIgnoreCase("Boddess | The Best of Beauty Online"))
		{
			
		System.out.println("Test Pass");
			
		}
		
		driver.quit();
		
		
    /* List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links is " + links.size());
	   
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	      
	      System.out.println("Scrolled"); */
		
	}
	
	}

