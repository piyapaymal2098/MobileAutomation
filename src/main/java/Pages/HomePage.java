package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    AppiumDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.myntra.android:id/closeDialog")
    public WebElement closeDialog;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"BANNER_2\"]/android.widget.ImageView")
    public WebElement image;

   /* @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"TOPNAV_CAROUSEL_1_5\"])[1]/android.view.ViewGroup")
    public WebElement top;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[1]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement Anouk;

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[1]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement AnoukFullimg;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Add to Bag\"]")
    public WebElement AddtoBag;
    @FindBy(xpath = "//android.widget.TextView[@text=\"S\"]")
    public WebElement SizeS;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_done_button\"]")
    public WebElement buyDone;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Go to Bag\"])[2]")
    public WebElement GoToBag;*/

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.myntra.android:id/ll_react_container\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    public WebElement BagButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.myntra.android:id/ll_react_container\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    public WebElement FWd;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Women\"]")
    public WebElement women;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"TOPNAV_CAROUSEL_1_2\"]/android.view.ViewGroup")
    public WebElement Dresses;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.myntra.android:id/ll_react_container\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    public WebElement Casual;

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[3]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement dress_image;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Add to Bag\"]")
    public WebElement Bag;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"size_select_S\"]/android.view.ViewGroup")
    public WebElement size;
    @FindBy(xpath = "//android.widget.TextView[@text=\"S\"]")
    public WebElement ssize;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_done_button\"]")
     public WebElement done_button;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    public WebElement go_to_bag;

    @FindBy(xpath = "//android.webkit.WebView[@text=\"SHOPPING BAG\"]/android.view.View/android.view.View/android.view.View/android.view.View[14]/android.view.View/android.view.View/android.view.View[3]")
    public WebElement PlaceOrder;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup")
    public WebElement addToBag;


    //@FAppiumBy

    public void addcartdress(){

    }




}

