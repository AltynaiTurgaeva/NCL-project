package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCLhomePage {


    @FindBy(xpath = "//div[.='Find a Cruise']")
    public WebElement findACruise;
    @FindBy(xpath = "//div[.='Dates']")
    public WebElement dates;
    @FindBy(xpath = "(//*[@data-code='dates']//*[@class='listing']/li/*[@class='btn-group'])[1]")
    public WebElement firstAvailableMonth;
    @FindBy(xpath = "(//a[@data-action='apply'])[3]")
    public WebElement applyFilterBtn;
    @FindBy(xpath = "//*[@class='c282_wrap']")
    public WebElement cruiseSailingDates;
    @FindBy(xpath = "//h1[@class='headline-7 -variant-1']")
    public WebElement exploreNumber;
    @FindBy(xpath = "//*[@class='c5_figcaption']")
    public WebElement availableCruiseInfo;
    @FindBy(id = "closeButton")
    public WebElement closeBtn;
    @FindBy(xpath = "//a[@id='simplemodal-close-img']")
    public WebElement getSpecialOfferCloseBtn;
    @FindBy(xpath = "//*[@class='c197_block -dates']//span[@class='e1_toggle_single']")
    public WebElement selectedDate;

    public NCLhomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}






