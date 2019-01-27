package Pages;

import Tests.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePageAutoRia extends BaseObjectClass {

    public HomePageAutoRia(WebDriver driver){//драйвер будет браться из BaseObject
        super(driver);//посредник, отсюда происходит пересылка к родителю , позже исп драйв родителя
    PageFactory.initElements(driver,this);// или в  тесте     HomePageAutoRia newpageAutoRia=PageFactory.initElements(driver,HomePageAutoRia.class);
    }


    @FindBy(xpath ="//a[@id=\"advanced-search\"]")
    public  WebElement advancedSearchButton;
    @FindBy(xpath ="//*[@id=\"BuRadioButton\"]")
    public  WebElement radioButton;
    @FindBy(xpath ="//select[@id=\"categories\"]")
    public  WebElement categoriesDropDown;
    @FindBy(xpath ="//label[@for=\"brandTooltipBrandAutocompleteInput-1\"]" )
    public  WebElement brandDropDown;
    @FindBy(xpath ="//label[@for=\"brandTooltipModelAutocompleteInput-1\"]" )
    public  WebElement modelDropDown;
    @FindBy(xpath = "//select[@id=\"regionCenters\"]")
    public  WebElement regionDropDown;
    @FindBy(xpath = "//select[@class=\"e-form\"]")
    public  WebElement yearFromField;
    @FindBy(xpath = "//select[@id=\"yearTo\"]")
    public  WebElement yearToField;
    @FindBy(xpath = "//select[@id=\"currency\"]")
    public  WebElement currencyDropDown;
    @FindBy (xpath = "//i[@class=\"icon-search\"]")
    public  WebElement searchButton;
    @FindBy(xpath = "//input[@id=\"brandTooltipBrandAutocompleteInput-1\"]")
    public WebElement searchBrandInList;

    @FindBy(xpath = "//*[@id=\"brandTooltipBrandAutocomplete-1\"]/ul/li[1]/a")
    public WebElement searchBrandInDropDownList;


//   public WebElement advancedSearch=driver.findElement(By.xpath("//a[@id=\"advanced-search\"]"));
    public void selectCar(String Car){
     WebElement carMark=driver.findElement(By.xpath("//div[@id='brandTooltipBrandAutocomplete-1']//ul[@class='unstyle scrollbar autocomplete-select']/li//strong[text()='"+Car+"']"));
    carMark.click();
    }// для выбора машины любой марки

    public void openingHomePage(){
        driver.get(Config.get("url"));
    }

public void advancedSearchClick(){
    advancedSearchButton.click();
}
//public void closeBrowser(){
//        driver.quit();
//}
}
