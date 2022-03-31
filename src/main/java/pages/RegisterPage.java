package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utils.Browser.driver;

public class RegisterPage {

    @FindBy(id = "input-firstname")
    private static WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private static WebElement lastNameInput;

    @FindBy(id = "input-email")
    private static WebElement emailInput;

    @FindBy(id = "input-telephone")
    private static WebElement telephoneInput;

    @FindBy(id = "input-password")
    private static WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private static WebElement passwordConfirmInput;

    @FindBy(xpath = "//input[@name='agree']")
    private static WebElement privacyPolicyBox;

    @FindBy(className = "btn-primary")
    private static WebElement continueButton;

    @FindBy(xpath = "//div/h1")
    private static WebElement verifyingSuccess;

    static{
        PageFactory.initElements(driver, RegisterPage.class);
    }

    /**
     * writes in the first name input field
     * @param firstName first name you want to use
     */
    public static void writeInTheFirstNameInputField(String firstName){
        firstNameInput.sendKeys(firstName);
    }

    /**
     * writes in the last name input field
     * @param lastName last name you want to use
     */
    public static void writeInTheLastNameInputField(String lastName){
        lastNameInput.sendKeys(lastName);
    }

    /**
     * writes in the e-mail input field
     * @param email email you want to use
     */
    public static void writeInTheEmailInputField(String email){
        emailInput.sendKeys(email);
    }

    /**
     * writes in the telephone input field
     * @param telephone telephone you want to use
     */
    public static void writeInTheTelephoneInputField(String telephone){
        telephoneInput.sendKeys(telephone);
    }

    /**
     * writes in the password input field
     * @param password password you want to use
     */
    public static void writeInThePasswordInputField(String password){
        passwordInput.sendKeys(password);
    }

    /**
     * writes in the password confirm input field
     * @param passwordConfirm password you want to confirm
     */
    public static void writeInThePasswordConfirmInputField(String passwordConfirm){
        passwordConfirmInput.sendKeys(passwordConfirm);
    }

    /**
     * fills all the obligatory input fields
     * @param firstName first name you want to use
     * @param lastName last name you want to use
     * @param email email you want to use
     * @param telephone telephone you want to use
     * @param password password you want to use
     * @param passwordConfirm password you want to confirm
     */
    public static void fillPersonalInformation(String firstName, String lastName, String email,
                                               String telephone, String password, String passwordConfirm){
        writeInTheFirstNameInputField(firstName);
        writeInTheLastNameInputField(lastName);
        writeInTheEmailInputField(email);
        writeInTheTelephoneInputField(telephone);
        writeInThePasswordInputField(password);
        writeInThePasswordConfirmInputField(passwordConfirm);
    }

    /**
     * finds and clicks on privacy policy box and continue button
     */
    public static void checkPrivacyPolicyAndContinue(){
        privacyPolicyBox.click();
        continueButton.click();
    }

    /**
     * verifies that your registration is successful
     * @param expectedMessage expected text to occur
     */
    public static void verifySuccessfulRegistration(String expectedMessage){
        Assert.assertEquals(verifyingSuccess.getText(), "Your Account Has Been Created!");
    }






}
