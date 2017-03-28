import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by g.dolgin on 13.03.17.
 */
public class kanat {
    public static void main(String args[]) {

        //http://kanatoxodez.ru/
        System.setProperty("webdriver.chrome.driver", "/home/g.dolgin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://kanatoxodez.ru/");
        for (int x = 0;x<4000;x++) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.navigate().refresh();
System.out.println(x);
        }
        driver.close();
    }
}
