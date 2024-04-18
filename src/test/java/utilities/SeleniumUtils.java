package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {
    public static void waitElementForVisibility(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementForClickable(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitSecond(int milisec) throws InterruptedException {
        Thread.sleep(milisec);
    }
}
