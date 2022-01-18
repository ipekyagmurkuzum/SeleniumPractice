import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElementsQuiz {


    WebDriver driver;
    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver","resouces/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void elementsQuiz1() throws InterruptedException {
        //Navigate to the url
        driver.get("https://www.saucedemo.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(5000);

        assertTrue(driver.findElement(By.xpath("//*[@class='title'][contains(text(),'Products')]")).isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(5000);

        assertTrue(driver.findElement(By.id("cart_contents_container")).isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("first-name")).sendKeys("Yagmur");
        driver.findElement(By.id("last-name")).sendKeys("Kuzum");
        driver.findElement(By.id("postal-code")).sendKeys("35390");
        driver.findElement(By.id("continue")).click();

        Thread.sleep(5000);
        assertTrue(driver.findElement(By.id("checkout_summary_container")).isDisplayed());

        driver.findElement(By.id("finish")).click();
        Thread.sleep(5000);
        assertTrue(driver.findElement(By.xpath("//*[@class='complete-header'][contains(text(),'THANK YOU FOR YOUR ORDER')]")).isDisplayed());
    }

//    @Test
//    public void elementsQuiz2() {
//        driver.get("https://www.ultimateqa.com/automation");
//        WebElement element3 = driver.findElement(By.linkText("Terms and conditions"));
//        assertTrue(element3.isDisplayed());
//        WebElement element4 = driver.findElement(By.partialLinkText("conditions"));
//        assertTrue(element4.isDisplayed());


    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
