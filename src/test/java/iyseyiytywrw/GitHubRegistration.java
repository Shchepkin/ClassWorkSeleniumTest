package iyseyiytywrw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHubRegistration {

    @Test
    public void negativeTest(){
        WebDriver driver = new FirefoxDriver();
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        mainPage.open();
        mainPage.clickRegister();

        registrationPage.enterLogin("drrgrtgrtgrtg");
        registrationPage.enterEmail("rgrgtgtgtgtgtrg");
        registrationPage.enterPassword("drgergrgergrg");
        registrationPage.clickSignUpButton();


        String expected = "There were problems creating your account.";
        String actual = registrationPage.getErrorMessageText();
        Assert.assertEquals(expected, actual);
    }
}
