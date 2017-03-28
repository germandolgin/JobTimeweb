import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by g.dolgin on 15.03.17.
 */
public class CreateNewHosting {

    private final String UserName;
    private final String Pass;

    public CreateNewHosting(String UserName, String Pass) {
        this.UserName = UserName;
        this.Pass= Pass;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPass() {
        return Pass;
    }





   public static CreateNewHosting Credentials(){
        System.setProperty("webdriver.chrome.driver", "/home/g.dolgin/chromedriver");
        String inquiry = ("{\n" +
                "  \"plan_id\": 911,\n" +
                "  \"payment_period\": 1,\n" +
                "  \"customer_type\": \"person\",\n" +
                "  \"full_name\": \"Lev Prostoy\",\n" +
                "  /*\"username\": \"ssitetmweb\",*/\n" +
                "  \"email\": \"pesnprostoi@yandex.ru\",\n" +
                "  \"newsletter\": true,\n" +
                "  \"referer\": {\n" +
                "    \"firstVisit\":\n" +
                "    {\n" +
                "      \"date\": \"2015-06-03 09:53:00\",\n" +
                "      \"UTM_Medium\": \"cpc\",\n" +
                "      \"UTM_Source\": \"yandex\",\n" +
                "      \"UTM_Campaign\": \"swagger\",\n" +
                "      \"HTTP_Referer\": \"https://timeweb.ru\",\n" +
                "      \"UTM_Content\": \"content\",\n" +
                "      \"UTM_Term\": \"term\"\n" +
                "    },\n" +
                "    \"lastVisit\":\n" +
                "    {\n" +
                "      \"date\": \"2015-06-03 09:53:00\",\n" +
                "      \"UTM_Medium\": \"cpc\",\n" +
                "      \"UTM_Source\": \"yandex\",\n" +
                "      \"UTM_Campaign\": \"swagger\",\n" +
                "      \"HTTP_Referer\": \"https://timeweb.ru\",\n" +
                "      \"UTM_Content\": \"content\",\n" +
                "      \"UTM_Term\": \"term\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"agree_terms\": true,\n" +
                "  \"partner_code\": 1099,\n" +
                "  \"partner_type\": \"webmaster\",\n" +
                "  \"tags\": [\"show_hello\"]\n" +
                "}");

        WebDriver driver = new ChromeDriver();
        driver.get("http://dev.api.timeweb.ru/rc/?appkey=538ebdb14f437#!/services/orderHosting");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Посылаю комбинацию клавиш через sendkeys
        driver.findElement(By.xpath("//*[@id=\"services_orderHosting_content\"]/form/table[1]/tbody/tr[3]/td[2]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SHIFT, Keys.HOME));
        driver.findElement(By.xpath("//*[@id=\"services_orderHosting_content\"]/form/table[1]/tbody/tr[3]/td[2]/textarea")).sendKeys(Keys.chord(Keys.DELETE));
        //выплевываю нужный запрос в сваггер
        driver.findElement(By.xpath("//*[@id=\"services_orderHosting_content\"]/form/table[1]/tbody/tr[3]/td[2]/textarea")).sendKeys(inquiry);


        //жму кнопку подтвердить
        driver.findElement(By.xpath("//*[@id=\"services_orderHosting_content\"]/form/div[3]/input")).submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String UserN = driver.findElement(By.xpath("//*[@id=\"services_orderHosting_content\"]/div[2]/div[3]/pre/code/span[20]/span")).getText();

        String Password = driver.findElement(By.xpath("//*[@id=\"services_orderHosting_content\"]/div[2]/div[3]/pre/code/span[6]/span")).getText();
       driver.close();
        //System.out.println("Id = " + username);
        //System.out.println("Pass = " + pass);

        return new CreateNewHosting(UserN,Password);
        //return pass;



}}