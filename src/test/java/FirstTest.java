import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


public class FirstTest extends WebDriverSettings {


    @Test
    public void firstTest() {
        String Title = driver.getTitle();
        Assert.assertNotNull(Title);
        driver.manage().window().setSize(new Dimension(100,100));
    }

    @Test
    public void secondTest() {
        String Title = driver.getTitle();
        Assert.assertTrue(Title.equals("Zoho - Cloud Software Suite and SaaS Applications for Businesses"));
    }

    @Test
    public void thirdTest(){
        driver.findElement(By.className("zh-customers")).click();
    }



}
