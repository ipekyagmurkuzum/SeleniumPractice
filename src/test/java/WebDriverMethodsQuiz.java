import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class WebDriverMethodsQuiz {
    WebDriver driver;
    WebElement element;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void herokuDropdown() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        WebElement optionOne = dropdown.findElement(By.xpath("//*[contains(text(), 'Option 1')]"));
        WebElement optionTwo = dropdown.findElement(By.xpath("//*[contains(text(), 'Option 2')]"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dropdown,optionOne);
        optionOne.click();
        //assertTrue(optionOne.getAttribute("selected").equals("selected"));
        assertTrue(optionOne.isSelected());
        assertFalse(optionTwo.isSelected());
    }

    @Test
    public void herokuHovers() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        element = driver.findElement(By.className("figure"));
        action.moveToElement(element).build().perform();
        assertTrue(driver.findElement(By.xpath("//*[contains(text(),'name: user1')]")).isDisplayed());
    }

    @Test
    public void herokuContextMenu() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        element = driver.findElement(By.id("hot-spot"));
        Actions action = new Actions(driver);
        action.contextClick(element).build().perform();
        driver.switchTo().alert().accept();
    }

    @Test
    public void herokuKeyPresses() {
        driver.get("https://the-internet.herokuapp.com/key_presses");
        element = driver.findElement(By.id("target"));
        Actions action = new Actions(driver);
        action.sendKeys(element,Keys.ARROW_RIGHT).perform();
        //assertEquals(true, driver.findElement(By.xpath("//*[@id='result'][contains(text(), 'You entered: RIGHT')]")).isDisplayed());
        assertEquals("You entered: RIGHT", driver.findElement(By.id("result")).getText());
    }

    @Test
    public void ultimateQAHtml() {
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation");
        element = driver.findElement(By.linkText("Clickable Icon"));
        assertEquals("https://ultimateqa.com/link-success/", element.getAttribute("href"));
        assertEquals("padding-box", element.getCssValue("background-origin"));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
