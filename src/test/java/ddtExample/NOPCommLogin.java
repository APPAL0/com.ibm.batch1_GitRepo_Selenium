package ddtExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NOPCommLogin extends BaseTest{
    
    
    
    @Test(dataProvider = "regressionTest")
    public void verifyLoginWithInValidCred(String email, String pwd) throws Exception {
        
        
        System.out.println("user credentails are: " + email + " : " + pwd);
        
        Thread.sleep(4000);
        
        driver.findElement(By.cssSelector("input#Email")).clear();
        driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
        
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input#Password")).clear();
        driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
        Thread.sleep(4000);
        
        //driver.findElement(By.cssSelector("input#RememberMe")).click();
        
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(4000);
        
        
        
//      //error message
//      String actualURL = "https://admin-demo.nopcommerce.com/login?returnurl=%2Fadmin%2F";
//      actualURL.contains("login");
        
        
        Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful."));
        
        Thread.sleep(4000);
       // driver.navigate().refresh();
        
    }
    
    @DataProvider
    public Object[][] smokeTest() {
        
        Object [][] data = { {"pooja@google.com", "Welcome"},{"Saranya@yahoo.com", "Demo@122"}, {"Praveen@gmail.com", "demo@123456"} };
        return data;
        
    }
    
    
    @DataProvider
    public Object[][] regressionTest() {
        
        Object [][] data = { {"poojaRegression@google.com", "Welcome"},{"SaranyaRegression@yahoo.com", "Demo@122"}, {"PraveenRegression@gmail.com", "demo@123456"}, {"SubhenduRegression@gmail.com", "demo@123456"} };
        return data;
        
    }

}

