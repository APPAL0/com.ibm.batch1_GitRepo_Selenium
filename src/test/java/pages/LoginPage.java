package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	// Identification

	By txtEmail = By.id("Email");
	By txtPass = By.id("Password");
	By chkRem = By.id("RememberMe");
	By btnLogin = By.tagName("button");

	// Methods

	public void enterEmail(String email) {

		// driver is null
		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);

	}

	public void enterPass(String pwd) {

		// driver is null
		driver.findElement(txtPass).clear();
		driver.findElement(txtPass).sendKeys(pwd);

	}

	public void clickCkeckbox() {

		// driver is null
		driver.findElement(chkRem).click();;
		

	}

	public void clickLogin() {

		// driver is null
		driver.findElement(btnLogin).click();
		

	}

	public boolean verifyEmailDisplayed() {
		return driver.findElement(txtEmail).isDisplayed();

	}

	

	public void verifyApplicationTitle(String expTitle) throws Exception {
		
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), expTitle);

	}
	
	
	public void login(String email, String pwd) {
		
		enterEmail(email);
		enterPass(pwd);
		clickLogin();
		
		
	}
	
	
	
}
