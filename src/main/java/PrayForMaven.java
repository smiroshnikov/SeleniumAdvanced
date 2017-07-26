import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Iidwuurliik on 26.07.2017.
 */
public class PrayForMaven {

    static WebDriver driver;

    public static void main(String[] args) {

        System.out.println("Fuck mvn!");
        String chrome_driver_path = "C:\\Webdrivers\\chromedriver.exe";
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        System.setProperty("webdriver.chrome.driver", chrome_driver_path);
        driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        driver.close();


    }

}
