package controlExample;

import org.openqa.selenium.Alert;
//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDropdown extends BaseTest{
    
    
    @Test
    public void handleCarList() throws Exception {
        
        System.out.println("handleCarList Example");
            
        
        WebElement carlist = driver.findElement(By.tagName("select"));              // match -3 
        
        
        //className refName = new ClassName(constructor);
        
        Select  list = new Select(carlist);
        
        
        
        
        System.out.println("handleCarList - is dropdown accept multiple selection or not: " + list.isMultiple());          //false
        
        
        //index
        //visibleText
        //Value
        Thread.sleep(2000);
        list.selectByIndex(1);                      //Saab
        
        Thread.sleep(2000);
        
        list.selectByIndex(4);                      //Toyota            
        
        Thread.sleep(2000);
        
        list.selectByValue("USA");                  //Volvo
        
        Thread.sleep(2000);
        
        list.selectByVisibleText("Audi");           //Audi
        
        Thread.sleep(5000);
        
        
        
        
        Thread.sleep(5000);
        
    }
    
    
    
    @Test
    public void handleCountryList() throws Exception {
        
        System.out.println("handleCountryList Example");
            
        
        WebElement countryList = driver.findElement(By.cssSelector("[name*='From']"));
        
        
        //className refName = new ClassName(constructor);
        
        Select  list = new Select(countryList);
        
        
        
        
        System.out.println("countryList - is dropdown accept multiple selection or not: " + list.isMultiple());          //true
        
        
        //index
        //visibleText
        //Value
        
        list.selectByIndex(0);                      //USA
        list.selectByIndex(4);                      //India         
        
        
        list.selectByValue("Germany");              //Germany
        list.selectByVisibleText("Spain");          //Spain
        
        Thread.sleep(5000);
        
        
        
        list.deselectAll();
        
        
        Thread.sleep(5000);
        
        list.selectByIndex(0);                      //USA
        list.selectByIndex(4);                      //India 
        list.selectByValue("Greece");               //Greece
        list.selectByVisibleText("Japan");          //Japan
        
        
        Thread.sleep(5000);
        
        list.deselectByValue("USA");                //USA
        list.deselectByVisibleText("Greece");
        
        
        Thread.sleep(5000);
        
    }
    
    
    

}