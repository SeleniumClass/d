package Framework;

import org.openqa.selenium.By;

public class Login extends Basepage{
		private By Hellosignin = By.xpath("//*[contains(@id,'nav-link-accountList')]");
		private By sign = By.xpath("(//*[contains(text(),'Sign in')])[1]");
		private By emailId = By.xpath("//input[@id='u_0_2']");
		private By password = By.xpath("//input[@id='u_0_2']");
		

		public void enterEmail(String enterEmail) {
			sendText(emailId, enterEmail);
		}
		
		public void enterPassword(String enterPassword) {
			sendText(password, enterPassword);
		}
		public void clickOnLoginButton() {
			clickOn(sign);
		}
		
		
		public void clickOnHellosigninButton() {
			clickOn(Hellosignin);
		}

		
		
	}
	
	
	

