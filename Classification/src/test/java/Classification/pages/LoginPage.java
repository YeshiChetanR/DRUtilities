package Classification.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
	    
 
	    public static By userName = By.id("username");
	    public static By password = By.id("password");
	    public static By submitButton =By.id("_eventId_submit");
	    By editCaseDetailsLink = By.xpath("//a[contains(text(),'Edit Case Details')]");
	      
	    public LoginPage(WebDriver driver){
	 
	    	super(driver);
	 
	    }
	    
	    public void enterLoginDetails(String strUserName, String strPasword) throws Exception
	    {
	    	driver.findElement(userName).sendKeys(strUserName);
	        driver.findElement(password).sendKeys(strPasword);
	        driver.findElement(submitButton).click();
	    }
	    
	    public HomePage logIn(String UserName, String Pasword) throws Exception
		{
	    
	    		  enterLoginDetails(UserName, Pasword);
	    		  return new HomePage(driver);
		}

	
	    
	  
}
