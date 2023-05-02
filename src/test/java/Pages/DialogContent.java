package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='Tüm çerezlere izin ver']")
    private WebElement cerezler;

    @FindBy(xpath = "(//a[text()='Jean'])[1]")
    private WebElement Jean;

    @FindBy(xpath = "(//div[@class='half-section__content-box__inner position-middle position-left mobile:position-middle'])[2]")
    private WebElement male;

    @FindBy(css = "section[class='product-list-category-normal']")
    public WebElement productFilterList;

    @FindBy(xpath = "//div[@class='filter-item']")
    public List<WebElement> filterList;

    @FindBy(css = "div[data-filter-code='waist']")
    public WebElement waist;

    @FindBy(xpath = "//span[contains(text(),'Normal Bel')]")
    public WebElement normalWaist;

    @FindBy(css = "div[data-filter-code='fit']")
    public WebElement fit;

    @FindBy(xpath = "//span[contains(text(),'Slim Straight')]")
    public WebElement slimFit;

    @FindBy(css = "div[data-filter-code='swatchColor']")
    public WebElement swatchColor;

    @FindBy(xpath = "(//span[contains(text(),'Siyah')])[1]")
    public WebElement black;

    @FindBy(css = "div[data-filter-code='priceOrSalePrice']")
    public WebElement priceOrSale;

    @FindBy(xpath = "(//span[contains(text(),'₺500-₺599.99')])[1]")
    public WebElement price;

    @FindBy(css = "[src='//sky-static.mavi.com/sys-master/maviTrImages/hb1/hd1/9910884859934/0020932936_image_1.jpg_Default-MainProductImage']")
    private WebElement slimFitBlackJean;

    @FindBy(css = "div[id='size-length']")
    public WebElement size_length;

    @FindBy(xpath = "(//span[text()='33'])[3]")
    public WebElement size;

    @FindBy(xpath = "(//span[text()='30'])[6]")
    public WebElement height;

    @FindBy(css = "div[class='product__details']")
    private WebElement detailsClick;

    @FindBy(css = "div[class='AddToCart-AddToCartAction']")
    public WebElement addToCart;

    @FindBy(css = "div[class='added-cart']")
    private WebElement addedCartVerify;

    @FindBy(css = "a[class='button go-to-cart']")
    private WebElement goToCart;

    @FindBy(xpath = "(//div[@class='detail'])[2]//span[2]")
    private WebElement productVisible;

    @FindBy(xpath = "//div[@class='sepet-total']//li[1]")
    private WebElement orderSum;

    @FindBy(xpath = "//div[@class='sepet-total']//li[2]")
    private WebElement cargo;

    @FindBy(xpath = "//div[@class='sepet-total']//li[3]")
    private WebElement total;

    @FindBy(css = "a[class='removeItemButton btn btn-line remove-item remove-entry-button']")
    public WebElement deleteProduct;

    @FindBy(css = "button[id='removeProductFromCartBtn']")
    public WebElement deleteButton;

    @FindBy(css = "div[class='content']")
    private WebElement productIsEmptyVerify;

    @FindBy(xpath = "(//*[@src='//sky-static.mavi.com/sys-master/maviTrImages/hf2/h44/10039872061470/mavi-logo-orijinal.svg'])[1]")
    private WebElement maviLogo;















    WebElement myElement;

    public void findAndClick(String element){
        switch (element){
            case "Jean":myElement=Jean;break;
            case "male":myElement=male;break;
            case "cerezler":myElement=cerezler;break;
            case "waist":myElement=waist;break;
            case "normalWaist":myElement=normalWaist;break;
            case "slimFitBlackJean":myElement=slimFitBlackJean;break;
            case "size_length":myElement=size_length;break;
            case "size":myElement=size;break;
            case "height":myElement=height;break;
            case "detailsClick":myElement=detailsClick;break;
            case "addToCart":myElement=addToCart;break;
            case "goToCart":myElement=goToCart;break;
            case "deleteProduct":myElement=deleteProduct;break;
            case "deleteButton":myElement=deleteButton;break;
            case "maviLogo":myElement=maviLogo;break;
        }
        clickFunction(myElement);
    }

    public void findAndSend(String element, String value){
        switch (element){





        }
        sendKeysFunction(myElement,value);
    }

    public void verifyText(String element, String text){
        switch (element) {
            case "addedCartVerify":
                myElement = addedCartVerify;
                break;
            case "productVisible":
                myElement = productVisible;
                break;
            case "orderSum":
                myElement = orderSum;
                break;
            case "cargo":
                myElement = cargo;
                break;
            case "total":
                myElement = total;
                break;
            case "productIsEmptyVerify":
                myElement=productIsEmptyVerify;
                break;

        }
        verifyContainsText(myElement,text);
    }










}
