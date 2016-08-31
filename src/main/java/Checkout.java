import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

/**
 * Created by yb on 8/30/2016.
 */
public class Checkout {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yb\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://shop.fender.com/en-US/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\'home-slot-1-2016-aug-1\']/div/div/ul/li[1]/div/div[2]/div/div/div/div[2]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'11208819d8680856ae86bd3654\']/div[1]/a[1]/img")).click();
        String guiterprize= (driver.findElement(By.xpath("//*[@id=\'product-content\']/div[2]/div[1]/span/div/span[1]")).getText());
        System.out.println(guiterprize);
        driver.findElement(By.xpath("//*[@id=\'add-to-cart\']/span")).click();
        driver.findElement(By.xpath("//*[@id=\'mini-cart\']/div[1]/a[2]/span[1]")).click();


        String prize=driver.findElement(By.xpath("//*[@id=\'cart-items-form\']/fieldset/div/div/div[2]/div[3]/span[1]")).getText();
        System.out.println(prize);
        if (prize.equals(guiterprize)){
            System.out.println("Valid quantity");
        }
        else {
            System.out.println("false quantity");
        }
        //Secure checkout
        driver.findElement(By.xpath("//span[@class='arrow-circle tablet-small']")).click();


        driver.findElement(By.xpath("//*[@id=\'primary\']/div[2]/div[3]/div/div/form/fieldset/div/button/span")).click();


        //Adding shipping address
        driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_firstName")).sendKeys("John");
        driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_lastName")).sendKeys("Smith");
        driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_address1")).sendKeys("15496 Rodeo drive apt 34");
        //WebElement el=driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_country"));
        //Select select= new Select(el);
        //select.selectByIndex(0);

        WebElement el=driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_states_state"));
        Select select= new Select(el);
        select.selectByIndex(5);

        driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_city")).sendKeys("Los Angeles");
        driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_zip")).sendKeys("90046");
        driver.findElement(By.id("dwfrm_singleshipping_shippingAddress_addressFields_phone")).sendKeys("4232543443");

        driver.findElement(By.xpath("//*[@id=\'main\']/section[2]/div/div[2]/div[2]/div[2]/div[2]/label")).click();

        //Verify that we are in the right page
        System.out.println(driver.findElement(By.id("dwfrm_billing_paymentMethods_creditCard_owner")).isDisplayed());












    }


}
