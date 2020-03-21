package pages;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class HomePage extends Page{


    public HomePage(WebDriver driver){
		super(driver);
	}

	

	public  By fileDescriptionLocator (String filename)
	{
		
		By locator = By.xpath("//table[@class='striped-table-thead margin-top-medium table']//input[@type='text']");
		//By locator = By.xpath("//td[text()='"+filename+"']/parent::tr/td/input");
		return locator;
	}

	public  By fileSizeLocator (String filename){
		By locator =By.xpath("//tr//td[1]");
		//By locator = By.xpath("//td[text()='"+filename+"']/parent::tr/td[2]");
		return locator;
	}

	

	public void javascriptDragAndDrop(WebElement source, WebElement target) throws IOException
	{
		String script = readFile("/dev/shm/draganddrop.js", Charset.forName("UTF-8"));
		script += "simulateHTML5DragAndDrop(arguments[0], arguments[1])";
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript(script, source, target);
	}

	static String readFile(String path, Charset encoding) throws IOException
	{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	
}



