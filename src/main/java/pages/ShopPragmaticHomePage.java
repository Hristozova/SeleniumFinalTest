package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Browser.driver;

public class ShopPragmaticHomePage {

    @FindBy(className = "caret")
    private static WebElement myAccount;

    @FindBy(css = "[href='https://shop.pragmatic.bg/index.php?route=account/register']")
    private static WebElement register;


    static {
        PageFactory.initElements(driver, ShopPragmaticHomePage.class);
    }

    /**
     * This method redirects you to the Home page.
     */
    public static void goTo(){
        driver.get("http://shop.pragmatic.bg/");
    }

    /**
     * finds and clicks registration button
     */
    public static void findAndClickRegisterButton(){
        myAccount.click();
        register.click();
    }
}
