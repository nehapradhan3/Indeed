
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 
public class indeed {
	public static void main(String[] args) {
        // System.setProperty("webdriver.firefox.marionette","../home/pundarika/Downloads/geckodriver.exe");
            
            WebDriver driver = new HtmlUnitDriver(true);

            driver.get("http://www.indeed.com/q-*-jobs.html");
            String path="//div[@class='  row  result']";  //  "//tagName[@class='classname']//innertag"
         
            List<WebElement> ds = driver.findElements(By.xpath(path));
            System.out.println(ds);
            for(WebElement e:ds){
                System.out.println("---->>>"+e);
                String title= e.findElements(By.className("turnstileLink")).get(0).getAttribute("title");
                System.out.println("+++++++++" + title);
            }
            driver.close();
    }
}

