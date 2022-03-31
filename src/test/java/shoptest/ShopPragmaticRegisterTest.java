package shoptest;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.ShopPragmaticHomePage;

public class ShopPragmaticRegisterTest extends BaseTest {

    @Test
    public void makeNewRegistration(){

        ShopPragmaticHomePage.goTo();
        ShopPragmaticHomePage.findAndClickRegisterButton();
        RegisterPage.fillPersonalInformation("vladimira", "hristozova", "vladi@vvf.com", "85666", "1234", "1234");
        RegisterPage.checkPrivacyPolicyAndContinue();
        RegisterPage.verifySuccessfulRegistration("Your Account Has Been Created!");
    }
}
