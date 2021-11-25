import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import javax.jws.WebResult;

public class TestSuite extends BaseTest{
    String baseUrl= "https://www.amazon.co.uk";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void amazonSearchFunction(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
        driver.findElement(By.className("")).click();
        driver.findElement(By.id("sp-cc-accept")).click();







    }



}
