package Steps;

import Pages.NCLhomePage;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class steps {

    NCLhomePage nclHomePage = new NCLhomePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("client searches for sailings on first available month")
    public void client_searches_for_sailings_on_first_available_month() {

        Driver.getDriver().get("https://www.ncl.com");

    }

    @Given("cruise counter on filter updates")
    public void cruise_counter_on_filter_updates() throws InterruptedException {

        try {
            Thread.sleep(5000);
            Driver.getDriver().switchTo().frame("//iframe[@id='IPerceptionsEmbed']");
            nclHomePage.closeBtn.click();
            Driver.getDriver().switchTo().parentFrame();
            System.out.println("ALERT WINDOW APPEARED. CLICKED CLOSE BUTTON");
        } catch (Exception e) {
            System.out.println("NO IFRAME IS DISPLAYED");

        }


        wait.until(ExpectedConditions.elementToBeClickable(nclHomePage.dates));
        nclHomePage.dates.click();
        Thread.sleep(1000);
        nclHomePage.firstAvailableMonth.click();

        nclHomePage.applyFilterBtn.click();
        nclHomePage.findACruise.click();

    }

    @When("filtered list of cruises is displayed")
    public void filtered_list_of_cruises_is_displayed() {

        wait.until(ExpectedConditions.visibilityOf(nclHomePage.exploreNumber));
        System.out.println("NUMBER OF AVAILABLE CRUISES ==> " + nclHomePage.exploreNumber.getText());

        try {
            wait.until(ExpectedConditions.elementToBeClickable(nclHomePage.getSpecialOfferCloseBtn));
            nclHomePage.getSpecialOfferCloseBtn.click();
            System.out.println("CLICKING CLOSE BUTTON ON SPECIAL OFFER IFRAME");
        } catch (Exception e) {
            System.out.println("NO SPECIAL OFFER WAS DISPLAYED");
        }


    }

    @Then("all displayed cruises should start on selected month")
    public void all_displayed_cruises_should_start_on_selected_month() {

    }

    @Then("number of displayed cruises should match previous counter on filter")
    public void number_of_displayed_cruises_should_match_previous_counter_on_filter() {


    }


}

