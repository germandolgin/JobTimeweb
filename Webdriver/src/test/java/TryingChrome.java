import Webdriver.RandomName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by g.dolgin on 17.02.17.
 */
public class TryingChrome {
    @Test
    public void openpage() {


        RandomName name1 = new RandomName();

        //System.out.print(name1.GetName());


        System.setProperty("webdriver.chrome.driver", "/home/g.dolgin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://timeweb.com/ru/");
        driver.findElement(By.xpath("*//div/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"hosting-table\"]/tbody/tr[5]/td[2]/div/a")).click();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("*//form/div[2]/div[1]/div[2]/div[2]/input")).sendKeys(name1.GetName());
        driver.findElement(By.xpath("*//form/div[2]/div[1]/div[3]/div[1]/div/div[2]/input")).sendKeys("pesnprostoi@yandex.ru");
        driver.findElement(By.xpath("*//form/div[2]/div[2]/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("*//form/div[2]/div[2]/div[2]/div[3]/a")).click();


        //////////////////
//String a = driver.findElement(By.xpath("//*[@id=\"w15-14-58a7303a\"]/div[1]/div/div[1]/p[1]")).getAttribute("acc-name js-acc-name");
        // String a = driver.getCurrentUrl();
        //System.out.print(a);
        //driver.findElement(By.id("slide2007")).click();

        // /driver.findElement(By.id("slide2007"));

          //  Connection Mycon = DriverManager.getConnection("jdbc:odbc:192.168.0.131", "sotskiy", "sotskiy");

           // String SQL1 = ("SELECT id FROM billing.vds_status where vds_id = \"72326\";");



    }
}