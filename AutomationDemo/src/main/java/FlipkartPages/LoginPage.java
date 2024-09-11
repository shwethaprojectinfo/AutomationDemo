package FlipkartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	

	WebDriver driver = null;
	

	@FindBy(xpath="//a//span[contains(text(),'Login')]")
	private WebElement loginButton;
	
	@FindBy(xpath="//label//span[contains(text(),'Enter Email/Mobile number')]")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//button[@class='QqFHMw twnTnD _7Pd1Fp']")
	private WebElement login;
	
	
}
