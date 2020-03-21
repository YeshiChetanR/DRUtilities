package Classification.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	public WebDriver driver;

	public Page(WebDriver driver) {

		this.driver = driver;
		
	}

	public void clickAt(By by) {
		try {
			Thread.sleep(1500);
			Actions builder = new Actions(driver);
			WebElement tagElement = driver.findElement(by);
			builder.moveToElement(tagElement).click().perform();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void jsExecutorClick(By locator) throws Exception{
		WebElement clickElement = driver.findElement(locator);
		JavascriptExecutor clickOnElement = (JavascriptExecutor)driver;
		clickOnElement.executeScript("arguments[0].click();", clickElement);

	}

	public void click(By locator) {
		waitUntillClickable(locator);
		driver.findElement(locator).click();

	}


	public void enterText(By locator, String text) {
		waitUntillClickable(locator);
		driver.findElement(locator).sendKeys(text);

	}

	public void selectOption(By locator, By option) {
		waitUntillClickable(locator);
		clickAt(locator);
		waitUntillClickable(option);
		clickAt(option);

	}

	public void selectOptionFromPicklist(String selectListID, String option) throws InterruptedException {
		driver.findElement(By.id(selectListID)).click();
		Thread.sleep(3000);
		Select picklist = new Select(driver.findElement(By.id(selectListID)));
		picklist.selectByValue(option);
	}

	public boolean verifyOptionFromPicklist(String selectListID, String option) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.document.getElementById('" + selectListID + "').setAttribute('style','');");
		Select list = new Select(driver.findElement(By.id(selectListID)));
		Boolean found = false;
		List<WebElement> allOptions = list.getOptions();
		for (WebElement e : allOptions) {
			if (e.equals(option)) {
				found = true;
				break;
			}
		}
		if (found) {
			return true;
		}
		return found;
	}

	public void waitUntillClickable(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

	public void scrollInto(By locator) throws InterruptedException {

		WebElement element = driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);
	}

	public int getElementCount(By locator) {
		waitUntillClickable(locator);
		int count = driver.findElements(locator).size();
		return count;

	}

	public void waitUntilltheTextisEmptyIn(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = driver.findElement(locator);
		wait.until(ExpectedConditions.attributeToBeNotEmpty(element, "text"));
	}

	public List<WebElement> getWebElements(By by) {
		return driver.findElements(by);
	}

	public ArrayList<String> webElementListToStringList(ArrayList<WebElement> webElements) {
		ArrayList<String> stringList = new ArrayList<String>();
		for (int i = 0; i < webElements.size(); i++) {
			stringList.add(webElements.get(i).getText());
		}
		return stringList;
	}

}
