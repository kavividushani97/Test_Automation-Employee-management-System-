package examPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://localhost/employee/admin/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("adminadmin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"login-frm\"]/button[1]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"Employee\"]")).click();
		
		
//driver.findElement(By.xpath("//*[@id=\"new_emp_btn\"]")).click();
		
	/*
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[1]/input[2]")).sendKeys("gayanthrika");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[2]/input")).sendKeys("kumari");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[3]/input")).sendKeys("muthunayaka");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[4]/input")).sendKeys("computer science");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[5]/input")).sendKeys("dean");
		
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[2]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		
		*/
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys("ga");
		
		
		
		
		
		
		

	}

}
