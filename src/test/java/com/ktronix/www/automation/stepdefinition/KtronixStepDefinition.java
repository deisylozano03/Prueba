package com.ktronix.www.automation.stepdefinition;

import com.ktronix.www.automation.tasks.GoToCart;
import com.ktronix.www.automation.tasks.GoToCheckOut;
import com.ktronix.www.automation.tasks.GoToProduct;
import com.ktronix.www.automation.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class KtronixStepDefinition {
        @Managed(driver="chrome")
        private WebDriver hisBrowser;
        private Actor deisy =Actor.named("Deisy");

        @Before
        public void openBrowser(){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            deisy.can(BrowseTheWeb.with(hisBrowser));
            deisy.wasAbleTo(Open.browserOn(new HomePage()));
            hisBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        @Given("^that deisy select gamer chair$")
        public void thatDeisySelectGamerChair(){
            deisy.attemptsTo(GoToProduct.theProduct());

        }

        @When("^Deisy add to cart the product$")
        public void DeisyAddToCartTheProduct(){
         deisy.attemptsTo(GoToCart.theCart());

        }

        @Then("^check out until payment method$")
        public void checkOutUntilPaymentMethod(){
           deisy.attemptsTo(GoToCheckOut.theCheck());
        }
    }