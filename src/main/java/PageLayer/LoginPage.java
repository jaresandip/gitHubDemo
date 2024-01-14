package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "")
	WebElement wbUsername;

	@FindBy(xpath = "")
	WebElement wbpasswrd;

	@FindBy(xpath = "")
	WebElement wbloginBtn;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

}
