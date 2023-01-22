package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    protected AppiumDriver driver;

        @BeforeMethod
        public void setUp() {
            try{
                DesiredCapabilities cap;
                cap = new DesiredCapabilities();

                cap.setCapability("deviceName","faladdintestdevice");//emulator name
                cap.setCapability("platformName","android");//platform name
                cap.setCapability("udID","emulator-5554");//special UD ID
                cap.setCapability("platformVersion","13.0");
                cap.setCapability("app","/Users/tugce/Downloads/faladdin.apk");//apk path for my device
                cap.setCapability("skipUnLock","true");
                cap.setCapability("noReset","false");

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }

            catch (MalformedURLException xp){
                System.out.println("URL Error!");
            }

        }


    @AfterMethod
    public void tear(){

        //driver.quit(); for the quit all driver at the end of test
    }
}
