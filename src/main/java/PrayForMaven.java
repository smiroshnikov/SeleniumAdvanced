import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Iidwuurliik on 26.07.2017.
 */
public class PrayForMaven {

    static WebDriver driver;

    public static void main(String[] args) {

        String chromeDriverPath = "/Users/smiroshn/IdeaProjects/SeleniumAdvanced/src/main/resources/chromedriver";
        String firefoxDriverPath = "/Users/smiroshn/IdeaProjects/SeleniumAdvanced/src/main/resources/geckodriver";
        String safariDriverPath = "/Users/smiroshn/IdeaProjects/SeleniumAdvanced/src/main/resources/";

        Browsers browser;

        String chosenBrowser = Browsers.pickBrowser().toString();

        if (chosenBrowser.equals("Firefox")) {
            System.out.println("///---------DEBUG::Firefox!---------///");
            System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
            driver = new FirefoxDriver();
            driver.get("http://google.com");
            driver.close();

        } else if (chosenBrowser.equals("Safari")) {
            System.out.println("///---------DEBUG::Safari!---------///");
            driver = new SafariDriver();
            driver.get("http://google.com");
            driver.close();

        } else if (chosenBrowser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            System.out.println("///---------DEBUG::Chrome!---------///");
            driver = new ChromeDriver();


        }

//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//
//        System.setProperty("webdriver.chrome.driver", chrome_driver_path);
//        System.setProperty("webdriver.gecko.driver", firefox_driver_path);
//
//        //driver = new ChromeDriver();
//        driver = new FirefoxDriver();
//
//        driver.navigate().to("http://google.com");
//        driver.close();


    }

}
