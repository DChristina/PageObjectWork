package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseObjectClass{

    @FindBy(xpath = "//div/section[@class=\"ticket-item new__ticket t paid\"][6]//div[@class=\"head-ticket\"]")
    public WebElement carInList;

    public SearchResultPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
