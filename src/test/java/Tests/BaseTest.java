package Tests;

import com.opera.core.systems.OperaDriver;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
//    {
//        if (Config.get("driver").equals("chrome"))
//        {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tihon\\Desktop\\Новая папка\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//        driver.manage().window().maximize();
//        }
//       else if(Config.get("driver").equals("firefox"))
//       {
//           System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tihon\\Desktop\\Новая папка\\geckodriver.exe");
//           driver = new FirefoxDriver();
//           driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);}
//        else
//            {
//        System.out.println("Driver is not defiend correctly");
//    }
//    }
{
    if(System.getProperty("driv").equals("chrome")){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tihon\\Desktop\\Новая папка\\chromedriver.exe");
        driver= new ChromeDriver();
    }
    else if (System.getProperty("driv").equals("firefox")){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Tihon\\Desktop\\Новая папка\\geckodriver.exe");
        driver= new FirefoxDriver();
    }
    else if (Config.get("driver").equals("chrome")){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tihon\\Desktop\\Новая папка\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize(); }
    else if (Config.get("driver").equals("firefox")){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tihon\\Desktop\\Новая папка\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);}
    else {System.out.println("The chrome driver would be user by default");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tihon\\Desktop\\Новая папка\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
    driver.manage().window().maximize(); }
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}

