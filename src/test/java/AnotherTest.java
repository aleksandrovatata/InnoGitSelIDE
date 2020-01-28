import org.junit.Test;
import org.openqa.selenium.By;


public class AnotherTest extends WebDriverSettings{


    @Test
    public void supportButton(){
        driver.findElement(By.className("zh-support")).click();
    }
}
