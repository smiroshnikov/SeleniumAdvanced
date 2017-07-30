import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Iidwuurliik on 26.07.2017.
 */
public class PrayForMaven {

    static WebDriver driver;
    static String chosenBrowser = Browsers.pickBrowser().toString();


    public static void main(String[] args) {


        boolean macOsFlag = false;
        System.out.println(System.getProperty("os.name"));


        if (System.getProperty("os.name").equals("Windows 10")) {
            macOsFlag = false;

        } else if (System.getProperty("os.name").equals("OSX")) {
            macOsFlag = true;
        } else if (System.getProperty("os.name") == null || !System.getProperty("os.name").equals("Windows 10")
                || !System.getProperty("os.name").equals("OSX")) {
            macOsFlag = false;
            System.out.println("Unsupported operating system !...Aborting");
            System.exit(1);
        }

        if (macOsFlag) {
            // set mac webdriver path

        } else {

            System.out.println("window2z");
            switch (chosenBrowser) {
                case ("Firefox"): {
//                    Find the path by yourself!

                    System.setProperty("webdriver.gecko.driver", DriversPath.WIN_CHROME.getDriverPath());
                    driver = new FirefoxDriver();
                    driver.get("http://google.com");
                    driver.close();
                    break;
                }
                case ("Chrome"): {

                    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                    System.setProperty("webdriver.chrome.driver", DriversPath.WIN_FIREFOX.getDriverPath());
                    System.out.println("///---------DEBUG::Chrome!---------///");
                    driver = new ChromeDriver();
                    driver.close();
                    break;
                }
                case ("Edge"): {

                }
            }

        }


        if (chosenBrowser.equals("Firefox")) {
            System.out.println("///---------DEBUG::Firefox!---------///");

            System.out.println(DriversPath.MAC_CHROME.toString());

//            System.setProperty("webdriver.gecko.driver", DriversPath.MAC_CHROME.toString());
//            driver = new FirefoxDriver();
//            driver.get("http://google.com");
//            driver.close();

        } else if (chosenBrowser.equals("Safari")) {
            System.out.println("///---------DEBUG::Safari!---------///");
            driver = new SafariDriver();
            driver.get("http://google.com");
            driver.close();

        } else if (chosenBrowser.equals("Chrome")) {



        }
    }
}
