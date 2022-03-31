package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumFinalTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Browser's Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void registerNewAccount(){

        driver.get("http://shop.pragmatic.bg/");

        WebElement myAccount = driver.findElement(By.className("caret"));
        myAccount.click();

        WebElement register = driver.findElement(By.cssSelector("[href='https://shop.pragmatic.bg/index.php?route=account/register']"));
        register.click();

        WebElement firstNameInput = driver.findElement(By.id("input-firstname"));
        firstNameInput.sendKeys("Vladimira");

        WebElement lastNameInput = driver.findElement(By.id("input-lastname"));
        lastNameInput.sendKeys("Hristozova");

        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("vladi" + "@maill.com");

        WebElement telephoneInput = driver.findElement(By.id("input-telephone"));
        telephoneInput.sendKeys("+359252526");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("1213654");

        WebElement passwordConfirmInput = driver.findElement(By.id("input-confirm"));
        passwordConfirmInput.sendKeys("1213654");

        WebElement privacyPolicyBox = driver.findElement(By.xpath("//input[@name='agree']"));
        privacyPolicyBox.click();

        WebElement continueButton = driver.findElement(By.className("btn-primary"));
        continueButton.click();

        WebElement verifyingSuccess = driver.findElement(By.xpath("//div/h1"));

        Assert.assertEquals(verifyingSuccess.getText(), "Your Account Has Been Created!");
    }

   @AfterMethod
   public void tearDown() {
        driver.quit();
    }
}
