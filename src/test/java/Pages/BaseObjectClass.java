package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BaseObjectClass {
        WebDriver driver;
        public BaseObjectClass(WebDriver driver){
                this.driver=driver;
        }
        public boolean isdisplaiedElement(WebElement element){
            try{element.isDisplayed();}
            catch(NoSuchElementException e){
               e.fillInStackTrace();
               return false;
            }
            return true;
        }
}
