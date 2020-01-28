import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {


    public ChromeDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\aleks\\Downloads\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.zoho.com/");
        System.out.println("New test running");
    }

    @After
    public void close(){
        System.out.println("test ended");
        driver.quit();

    }
}
