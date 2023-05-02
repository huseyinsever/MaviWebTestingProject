package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MaviJeanTest_Steps {
    DialogContent dc=new DialogContent();
    JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    @Given("Navigate to Basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://www.mavi.com/");
        GWD.getDriver().manage().window().maximize();
        dc.findAndClick("cerezler");
    }

    @When("The user should click on the Jean section.")
    public void theUserShouldClickOnTheJeanSection() {
        dc.findAndClick("Jean");
    }

    @And("The user answers the Gender question as Male.")
    public void theUserAnswersTheGenderQuestionAsMale() {
        dc.findAndClick("male");
    }

    @And("Verifies that the User Filtering section exists.")
    public void verifiesThatTheUserFilteringSectionExists() {
        double scrollingPrecision=0;
        String doubleCevirilmisHali=String.valueOf(scrollingPrecision).replace(".",",");
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/"+doubleCevirilmisHali+"));";

        js.executeScript(scrollElementIntoMiddle, dc.productFilterList);

        List<String> expectedList=new ArrayList<>();
        expectedList.add("Kategori");
        expectedList.add("Alt Kategori");
        expectedList.add("Tema");
        expectedList.add("Fit/Kalıp");
        expectedList.add("Renk");
        expectedList.add("Beden");
        expectedList.add("Bel");
        expectedList.add("Paça");
        expectedList.add("Boy");
        expectedList.add("Fiyat");
        expectedList.add("Düğme/Fermuar");

        for (int i = 0; i < expectedList.size(); i++) {
            Assert.assertEquals(expectedList.get(i),dc.filterList.get(i).getText());
        }
    }

    @And("The user answers the Waist Type question as Normal Waist.")
    public void theUserAnswersTheWaistTypeQuestionAsNormalWaist() {
        GWD.Bekle();
        dc.waist.click();
        dc.normalWaist.click();
    }

    @And("The user answers Slim Fit to the Jean Cut question.")
    public void theUserAnswersSlimFitToTheJeanCutQuestion() throws InterruptedException {
        Thread.sleep(1000);
        dc.fit.click();
        dc.slimFit.click();
    }

    @And("The user answers the Color question Black.")
    public void theUserAnswersTheColorQuestionBlack() throws InterruptedException {
        Thread.sleep(1000);
        dc.swatchColor.click();
        dc.black.click();
    }

    @And("The user answers the price range question of [fivehundred - fivehundred ninety nine] TL.")
    public void theUserAnswersThePriceRangeQuestionOfFivehundredFivehundredNinetyNineTL() throws InterruptedException {
        Thread.sleep(1000);
        dc.priceOrSale.click();
        dc.price.click();
    }

    @And("The user clicks on the Slim Fit Black Jean option.")
    public void theUserClicksOnTheSlimFitBlackJeanOption() {
        GWD.Bekle();
        dc.findAndClick("slimFitBlackJean");
    }

    @And("User should make size and height selections")
    public void userShouldMakeSizeAndHeightSelections() throws InterruptedException {
        wait.until(ExpectedConditions.urlContains("https://www.mavi.com/pierre-mavi-black-kaplamali-siyah-jean-pantolon/p/0020932936"));
        dc.size_length.click();
        dc.size.click();
        dc.height.click();
        Thread.sleep(1000);
        dc.findAndClick("detailsClick");
    }

    @And("User should click Add to Cart.")
    public void userShouldClickAddToCart() {
        GWD.Bekle();
        dc.addToCart.click();
    }

    @And("Added to Cart text should be verified and go to cart")
    public void addedToCartTextShouldBeVerifiedAndGoToCart() {
        dc.verifyText("addedCartVerify","Sepete eklendi");
    }

    @And("Verify that the item has arrived in the cart and the order summary and delete the item from the cart.")
    public void verifyThatTheItemHasArrivedInTheCartAndTheOrderSummaryAndDeleteTheItemFromTheCart() {
        dc.findAndClick("goToCart");
        GWD.Bekle();
        dc.verifyText("productVisible","Pierre Mavi Black Kaplamalı Siyah Jean Pantolon");
        dc.verifyText("orderSum", "569,99 TL");
        dc.verifyText("cargo","Ücretsiz");
        dc.verifyText("total","569,99 TL");
        GWD.Bekle();
        dc.deleteProduct.click();
        wait.until(ExpectedConditions.visibilityOf(dc.deleteButton));
        dc.deleteButton.click();
    }

    @Then("Verify that the basket is empty and return to the main page.")
    public void verifyThatTheBasketIsEmptyAndReturnToTheMainPage() {
        dc.verifyText("productIsEmptyVerify","Alışveriş sepetiniz boş");
        dc.findAndClick("maviLogo");
    }


}
