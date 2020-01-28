import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashaTest extends WebDriverSettings {

    @Test
    public void Dasha(){
        WebElement button = driver.findElement(By.xpath("//a[@class='zh-customers']"));
        button.click();
        String actualUrl = "https://www.zoho.com/customers.html";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
