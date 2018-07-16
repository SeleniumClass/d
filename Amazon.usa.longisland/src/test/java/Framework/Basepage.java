package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import stepdef.ShareSD;


public class Basepage {
	
	public void clickOn(By locator) {
		try {
			
		ShareSD.getDriver().findElement(locator).click();
		}catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator :" +locator.toString() );
			e.printStackTrace();
		}
		
	}

	public void sendText(By locator ,String text) {
		try {
		ShareSD.getDriver().findElement(locator).sendKeys(text);
		}catch(NoSuchElementException e) {
		Assert.fail("Element is not found with this locator :" +locator.toString());	
		e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
