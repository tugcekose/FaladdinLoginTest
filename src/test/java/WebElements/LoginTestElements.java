package WebElements;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestElements {

        public LoginTestElements(AppiumDriver driver){
            PageFactory.initElements(driver,this);
        }

        @FindBy(id= "com.faladdin.app:id/tvLanguageCode")
        public WebElement languageChoosingStep;

        @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
        public WebElement turkishButton;

        @FindBy(id="com.faladdin.app:id/getStartedButton")
        public WebElement exploreButton;

        @FindBy(id="com.faladdin.app:id/imageBtnAccount")
        public WebElement userIconButton;

        @FindBy(id="com.google.android.gms:id/account_display_name")
        public WebElement displayAccountName;

        @FindBy(id="com.faladdin.app:id/btnAccountSelect")
        public WebElement selectExistingEmailButton;

        @FindBy(id="com.faladdin.app:id/md_button_positive")
        public WebElement understandButton;

        @FindBy(id="com.google.android.gms:id/add_account_chip_title")
        public WebElement addAnotherAccountButton;

        @FindBy(id="identifierId")
        public WebElement addingAccountField;

        @FindBy(id="identifierNext")
        public WebElement nextButtonForAddingAcount;

        @FindBy(id="password")
         public WebElement passwordEntry;

        @FindBy(id="passwordNext")
        public WebElement nextButtonForPassword;

        @FindBy(id="com.faladdin.app:id/tvGoogle")
        public WebElement loginWithGoogleButton;

        @FindBy(id="loginWithGoogleButton")
        public WebElement choosingGoogleAccount;




}
