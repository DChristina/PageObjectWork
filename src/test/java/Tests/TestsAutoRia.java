package Tests;

import Pages.BaseObjectClass;
import Pages.CarSearchResultPage;
import Pages.HomePageAutoRia;
import Pages.SearchResultPage;
import com.opera.core.systems.OperaDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestsAutoRia extends BaseTest {
    //HomePageAutoRia newpageAutoRia=PageFactory.initElements(driver,HomePageAutoRia.class);//аналогично можно в
    HomePageAutoRia newpageAutoRia = new HomePageAutoRia(driver);
    SearchResultPage newSearchresuluPage = new SearchResultPage(driver);
    CarSearchResultPage newCarSearchResultPage = new CarSearchResultPage(driver);//вместо верхней строки с + PageFactory.initElements(driver,this); - в тесте


    @Test
    public void presenceElements() {
        newpageAutoRia.openingHomePage();
        // Assert.assertTrue(newpageAutoRia.advancedSearchButton.isDisplayed());

        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.radioButton));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.categoriesDropDown));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.brandDropDown));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.modelDropDown));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.regionDropDown));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.yearFromField));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.yearToField));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.currencyDropDown));
        Assert.assertTrue(newpageAutoRia.isdisplaiedElement(newpageAutoRia.searchButton));

     /*Assert.assertTrue(newpageAutoRia.radioButton.isDisplayed());
     Assert.assertTrue(newpageAutoRia.categoriesDropDown.isDisplayed());
     Assert.assertTrue(newpageAutoRia.brandDropDown.isDisplayed());
     Assert.assertTrue(newpageAutoRia.modelDropDown.isDisplayed());
     Assert.assertTrue(newpageAutoRia.regionDropDown.isDisplayed());
     Assert.assertTrue(newpageAutoRia.yearFromField.isDisplayed());
     Assert.assertTrue(newpageAutoRia.yearToField.isDisplayed());
     Assert.assertTrue(newpageAutoRia.currencyDropDown.isDisplayed());
     Assert.assertTrue(newpageAutoRia.searchButton.isDisplayed());*/

    }


    @Test
    public void searchCarFlow() {
        newpageAutoRia.openingHomePage();
        newpageAutoRia.radioButton.click();
        newpageAutoRia.brandDropDown.click();
        //newpageAutoRia.searchBrandInList.click();
        newpageAutoRia.searchBrandInList.sendKeys("Mercedes-Benz");
        newpageAutoRia.searchBrandInDropDownList.click();
        //Select brandSelect=new Select (newpageAutoRia.brandDropDown);
        // brandSelect.deselectByVisibleText("Mercedes-Benz");
        // newpageAutoRia.brandDropDown.click();
        //  newpageAutoRia.brandDropDown.sendKeys("Mercedes-Benz");
        newpageAutoRia.searchButton.click();
        // newpageAutoRia.carInList.click();
        newSearchresuluPage.carInList.click();
        newCarSearchResultPage.carName.getText();
        Assert.assertTrue(newCarSearchResultPage.carName.getText().equals("Mercedes-Benz E-Class TSI TURBO 7G-TRONIC 2014"));
        Assert.assertEquals(newCarSearchResultPage.carName.getText(), "Mercedes-Benz E-Class TSI TURBO 7G-TRONIC 2014");
        //Assert.assertTrue(newpageAutoRia.carInList,"Mercedes-Benz E-Class  1987");
        Assert.assertTrue(newCarSearchResultPage.carPrice.getText().equals("26 900 $"));
        Assert.assertEquals(newCarSearchResultPage.carPrice.getText(), "26 900 $");
        Assert.assertTrue(newCarSearchResultPage.carMileageCalculate("147"));
        Assert.assertTrue(newCarSearchResultPage.carSailorCityDetected("Хмельницкий ул.Свободы,15/1А"));
        Assert.assertTrue(newCarSearchResultPage.carsStarsCount("4.03"));

    }

    //@Test
//public void ClickOnButton(){
//HomePageAutoRia newpageAutoRia=new HomePageAutoRia();
//newpageAutoRia.openingHomePage();
//newpageAutoRia.advancedSearchClick();
//}
    //@Ignore
    @Test
    public void searchMarkNewmethod() {
        newpageAutoRia.openingHomePage();
        newpageAutoRia.radioButton.click();
        newpageAutoRia.brandDropDown.click();
        newpageAutoRia.selectCar(Config.get("car"));// ередаем в тесте значение искомой марки, работает только для видимых марок(подуматьк как открыть весь список)

    }

    @Test
    public void newTestProperties() {
        System.out.println(Config.get("driver"));//при этом из файла config будет найдено значение с таким ключем
    }

    @Test
    public void newDriverModeFromProperties() {
        WebDriver driver;
     System.setProperty("webdriver.gecko.driver","C:\\Users\\Tihon\\Desktop\\Новая папка\\geckodriver.exe");
     driver = new FirefoxDriver();
     driver.get("https://www.google.com.ua/");
}
@Test
    public void NewoperaDriverModeFromProperties(){
    WebDriver driver;
    System.setProperty("webdriver.opera.driver","C:\\Users\\Tihon\\Desktop\\Новая папка\\operadriver_win64\\operadriver.exe");
    driver = new OperaDriver();
    driver.get("https://www.google.com.ua/");
}
@Test
    public void systemVMprop() {
    if (System.getProperty("env") == null) {
        System.out.println("There is no such option");
    } else {
        System.out.println(System.getProperty("env"));
    }
}
@Test
            public void systemVMDriver(){



}


        }


