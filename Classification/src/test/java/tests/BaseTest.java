package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import pages.HomePage;

import pages.LoginPage;

import pages.Page;

import utilities.Env;



public class BaseTest {

	
	public static WebDriver driver;
	public static LoginPage loginPage;
	public static HomePage homePage;
	
	public  static HashMap <String, String> certEnvConfig;
	static Page page;
	

	
	public static By locator;

    public Properties prop = new Properties();
    
     
	@SuppressWarnings("unchecked")
	@BeforeMethod
	public void setup() throws MalformedURLException 
	{
		
		 

		 driver = Env.CreateWebDriver(Env.getBrowserName());
		
		 driver.manage().window().setSize(new Dimension(1300,1000));
		 //driver.manage().window().maximize();
		File file = new File("datafile.properties");
		  
			FileInputStream fileInput = null;
			try
			{
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try 
			{
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	//@BeforeMethod
    public String getTestName(Method method)
    {
        String testName = method.getName(); 
        return testName;
    }
	
	@AfterMethod
	public void teardown()
	{
	 //driver.close();
	 driver.quit();
	}
	
	
	public void logout()
	{	
		locator=By.xpath("//div[@class='alert alert-success']");
		driver.findElement(By.xpath("//span[@id='accountUserName']")).click();
		driver.findElement(By.id("accountLogout")).click();
		waitForText(locator,"You have been logged out.");
	}
	
	
			
	public void waitForText(By locator,String text)
	{
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
	}
	
	public void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("/e2e/uploads/screenshot1.png"));
    }
	
	
	
}