package step_defs;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import pages.HomePage;
import utilities.*;

public class FindBar {
    WebDriver driver;
    HomePage homePage = new HomePage();
    String fakeBar;

    @Given("User is on the the website")
    public void user_is_on_the_the_website() {
        driver = Driver.getDriver();
        driver.get(Config.getProperties("URL"));
    }
    @And("User tries to find correct number")
    public void user_tries_to_find_correct_number() {
        homePage.sendNumToLeft1("0");
        homePage.sendNumToLeft2("1");
        homePage.sendNumToLeft3("2");
        homePage.sendNumToLeft4("3");
        homePage.sendNumToRight1("4");
        homePage.sendNumToRight2("5");
        homePage.sendNumToRight3("6");
        homePage.sendNumToRight4("7");
        homePage.weighButton().click();

        SeleniumUtils.waitElementForVisibility(homePage.result1(),5);
        String result = homePage.result1().getText();
        if(result.contains("=")){
            fakeBar = "8";
            homePage.bar8.click();
        }else if (result.contains("<")){
            homePage.resetButton().click();
            homePage.sendNumToLeft1("0");
            homePage.sendNumToLeft2("1");
            homePage.sendNumToRight1("2");
            homePage.sendNumToRight2("3");
            homePage.weighButton().click();

            SeleniumUtils.waitElementForVisibility(homePage.result2(),5);
            String result2 = homePage.result2().getText();
            if (result2.contains("<")){
                homePage.resetButton().click();
                homePage.sendNumToLeft1("0");
                homePage.sendNumToRight1("1");
                homePage.weighButton().click();

                SeleniumUtils.waitElementForVisibility(homePage.result3(),5);
                String result3 = homePage.result3().getText();
                if (result3.contains("<")){
                    fakeBar = "0";
                    homePage.bar0.click();
                }else {
                    fakeBar = "1";
                    homePage.bar1.click();
                }
            }else {
                homePage.resetButton().click();
                homePage.sendNumToLeft1("2");
                homePage.sendNumToRight1("3");
                homePage.weighButton().click();

                SeleniumUtils.waitElementForVisibility(homePage.result3(), 5);
                String result3 = homePage.result3().getText();
                if (result3.contains("<")) {
                    fakeBar = "2";
                    homePage.bar2.click();
                } else {
                    fakeBar = "3";
                    homePage.bar3.click();
                }
            }
        }else {
            homePage.resetButton().click();
            homePage.sendNumToLeft1("4");
            homePage.sendNumToLeft2("5");
            homePage.sendNumToRight1("6");
            homePage.sendNumToRight2("7");
            homePage.weighButton().click();

            SeleniumUtils.waitElementForVisibility(homePage.result2(),5);
            String result2 = homePage.result2().getText();
            if (result2.contains("<")){
                homePage.resetButton().click();
                homePage.sendNumToLeft1("4");
                homePage.sendNumToRight1("5");
                homePage.weighButton().click();

                SeleniumUtils.waitElementForVisibility(homePage.result3(),5);
                String result3 = homePage.result3().getText();
                if (result3.contains("<")){
                    fakeBar = "4";
                    homePage.bar4.click();
                }else {
                    fakeBar = "5";
                    homePage.bar5.click();
                }
            }else {
                homePage.resetButton().click();
                homePage.sendNumToLeft1("6");
                homePage.sendNumToRight1("7");
                homePage.weighButton().click();

                SeleniumUtils.waitElementForVisibility(homePage.result3(), 5);
                String result3 = homePage.result3().getText();
                if (result3.contains("<")) {
                    fakeBar = "6";
                    homePage.bar6.click();
                } else {
                    fakeBar = "7";
                    homePage.bar7.click();
                }
            }
        }
    }

    @When("User find the bar")
    public void user_find_the_bar() {
        System.out.println("Fake bar is: "+fakeBar);
    }

    @Then("Alert page open")
    public void alert_page_open() throws InterruptedException {
        SeleniumUtils.waitSecond(2000);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
