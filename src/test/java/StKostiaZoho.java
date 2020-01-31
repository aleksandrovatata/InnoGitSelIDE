import org.junit.Assert;
import org.junit.Test;

public class StKostiaZoho extends WebDriverSettings {

        @Test
        public void firstTest() {

            driver.get("https://www.zoho.com/");
            String title = driver.getTitle();
            Assert.assertTrue(title.equals("Zoho - Cloud Software Suite and SaaS Applications for Businesses"));
            Assert.assertTrue(title.equals("Zoho - Cloud Software Suite and SaaS Applications for Person"));
        }



}
