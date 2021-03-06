import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class MovesInfoUITest {

    @Test
    public void t0() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/moves/pound");
        Thread.sleep(10000);
        WebElement we = wd.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)"));
        we.click();
        String url = wd.getCurrentUrl();
        assertEquals("https://togepedia.appspot.com/pokemon/35", url);
        wd.quit();
    }

    @Test
    public void t1() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/moves/pound");
        Thread.sleep(10000);
        WebElement we = wd.findElement(By.cssSelector("li.list-group-item:nth-child(1) > a:nth-child(1)"));
        we.click();
        String url = wd.getCurrentUrl();
        assertEquals("https://togepedia.appspot.com/types/normal", url);
        wd.quit();
    }

    //Test Dropmenu for Menus in Abilities Info Page
    @Test
    public void t2() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver(); // launch the browser
        wd.get("https://togepedia.appspot.com/moves/pound");
        Actions action = new Actions(wd);
        Thread.sleep(10000);
        WebElement we = wd.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > button:nth-child(1)"));
        action.moveToElement(we).moveToElement(wd.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)"))).click().build().perform();
        Thread.sleep(10000);
        String url = wd.getCurrentUrl();
        assertEquals("https://togepedia.appspot.com/abilities/132/", url);
        wd.quit();
    }
}
