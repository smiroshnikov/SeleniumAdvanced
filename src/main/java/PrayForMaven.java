import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Iidwuurliik on 26.07.2017.
 */
public class PrayForMaven {

    static WebDriver driver;

    public static void main(String[] args) {

        System.out.println("Fuck mvn!");
        String chrome_driver_path = "C:\\Webdrivers\\chromedriver.exe";
        String firefox_driver_path = "C:\\Webdrivers\\geckodriver.exe";

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);
        System.setProperty("webdriver.gecko.driver",firefox_driver_path);

        //driver = new ChromeDriver();
        driver = new FirefoxDriver();

        driver.navigate().to("http://google.com");
        driver.close();


    }

}
