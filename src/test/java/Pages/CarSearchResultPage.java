package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarSearchResultPage  extends BaseObjectClass {
    public CarSearchResultPage(WebDriver driver){//драйвер будет браться из BaseObject
        super(driver);//посредник, отсюда происходит пересылка к родителю , позже исп драйв родителя
        PageFactory.initElements(driver,this);// или в  тесте     HomePageAutoRia newpageAutoRia=PageFactory.initElements(driver,HomePageAutoRia.class);
    }
    @FindBy(xpath = "//*[@id=\"heading-cars\"]/div/h1")
    public WebElement carName;
    @FindBy(xpath = "//span[@class=\"price\"]")
    public WebElement carPrice;
    @FindBy(xpath = "//div[@class='run']/*")
    public WebElement carMileage;
    @FindBy (xpath = "//a[@class=\"map-loc\"]")
    public WebElement carSailorCity;
    @FindBy(xpath = "//span[@class=\"size20 text\"]")
    public WebElement carStars;


    public  boolean carMileageCalculate(String carMileageValue){
        return carMileage.getText().equals(carMileageValue+" тыс. км");
    }
    public  boolean carsStarsCount(String carStarValue){
        return carStars.getText().equals(carStarValue);
    }
    public  boolean carSailorCityDetected(String carCity){
        return carSailorCity.getText().equals(carCity);
    }

}
