package tests;

import Utils.DriverManager;
import WebElements.LoginTestElements;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class logintestfaladdin extends DriverManager {
//I extend DriverManager class because the Before Method and After Method comes from there. I made different class for it to change
    //or add driver maybe for cross test.
  /*In here I don't use these lines between 17- 25.
  These lines come from LoginTest Elements class of WebElements package
  I juts want to show the different way to find locator.

    By languageChoosing = By.id("com.faladdin.app:id/tvLanguageCode");
    By turkishButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    By exploreButton = By.id("com.faladdin.app:id/getStartedButton");
    By userIconButton = By.id("com.faladdin.app:id/imageBtnAccount");
    By emailChoosingButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    By selectExistingEmailButton = By.id("com.faladdin.app:id/btnAccountSelect");
    By understandButton = By.id("com.faladdin.app:id/md_button_positive");
    By loginWithGoogleButton = By.id("com.faladdin.app:id/tvGoogle");
    By choosingGoogleAccount = By.id("com.google.android.gms:id/account_name"); */

    LoginTestElements loginTestElements;

    @Test
    public void loginTest() {
        loginTestElements = new LoginTestElements(driver);
        //In here I can use the locators thanks to OOP with creating new loginTestElements

        loginTestElements.languageChoosingStep.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Needed to add waits for each steps because of the emulator's speed performance
        loginTestElements.turkishButton.click();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginTestElements.exploreButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginTestElements.userIconButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        loginTestElements.loginWithGoogleButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginTestElements.understandButton.click();

        //If there is any account on device(emulator) which is created before, this account shows up automaticly and
        //the automation should be directed to this way.
        if (loginTestElements.displayAccountName.isDisplayed()) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginTestElements.displayAccountName.click();

            //but there is no account created before on the device new account should be created and the automation
            //need to direct to this way
        } else {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginTestElements.addAnotherAccountButton.click();
            loginTestElements.addingAccountField.sendKeys("blabla@gmail.com");
            loginTestElements.nextButtonForAddingAcount.click();
            loginTestElements.passwordEntry.sendKeys("password");

        }
        // In here Assert class is needed for verification but because of the emulator this verification cannot be wrote

    }


}



