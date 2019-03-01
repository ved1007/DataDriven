package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
	
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\DataDriven\\src\\myWebDrivers\\chromedriver.exe");
		// launch chrome driver
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		//enter URL
//		driver.get("https://sso.teachable.com/secure/42299/users/sign_up?reset_purchase_session=1");
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\PC User1\\Desktop\\SeleniumFiles\\DataDriven\\src\\com\\testdata\\HalfEbayTestData.xlsx");
		
		String firstName = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println("firstName");
		
		
		
		
		
	}
}
