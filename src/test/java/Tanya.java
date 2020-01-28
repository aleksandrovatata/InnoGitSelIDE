import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class Tanya extends WebDriverSettings{

    @Test
    public void Tanya() {
        String URL = "https://accounts.zoho.eu/signin?servicename=ZohoHome&signupurl=https://www.zoho.com/signup.html";
        driver.findElement(By.xpath("//a[@class='zh-login']")).click();
        String NewURL = driver.getCurrentUrl();
        Assert.assertEquals(URL, NewURL);
    }

}
