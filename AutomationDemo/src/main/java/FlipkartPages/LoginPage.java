package FlipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath="//a//span[contains(text(),'Login')]")
	private WebElement loginButton;
	
	@FindBy(xpath="//label//span[contains(text(),'Enter Email/Mobile number')]")
	private WebElement emailTextField;

}
