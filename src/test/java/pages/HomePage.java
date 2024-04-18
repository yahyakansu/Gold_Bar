package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="left_0")
    private WebElement left1;
    public void sendNumToLeft1(String s){left1.sendKeys(s);}

    @FindBy(id="left_1")
    private WebElement left2;
    public void sendNumToLeft2(String s){left2.sendKeys(s);}

    @FindBy(id="left_2")
    private WebElement left3;
    public void sendNumToLeft3(String s){left3.sendKeys(s);}

    @FindBy(id="left_3")
    private WebElement left4;
    public void sendNumToLeft4(String s){left4.sendKeys(s);}

    @FindBy(id="right_0")
    private WebElement right1;
    public void sendNumToRight1(String s){right1.sendKeys(s);}

    @FindBy(id="right_1")
    private WebElement right2;
    public void sendNumToRight2(String s){right2.sendKeys(s);}

    @FindBy(id="right_2")
    private WebElement right3;
    public void sendNumToRight3(String s){right3.sendKeys(s);}

    @FindBy(id="right_3")
    private WebElement right4;
    public void sendNumToRight4(String s){right4.sendKeys(s);}

    @FindBy(id = "weigh")
    private WebElement weigh;
    public WebElement weighButton(){return weigh;};

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
    private WebElement reset;
    public WebElement resetButton(){return reset;}

    @FindBy(id = "coin_0")
    public WebElement bar0;

    @FindBy(id = "coin_1")
    public WebElement bar1;

    @FindBy(id = "coin_2")
    public WebElement bar2;

    @FindBy(id = "coin_3")
    public WebElement bar3;

    @FindBy(id = "coin_4")
    public WebElement bar4;

    @FindBy(id = "coin_5")
    public WebElement bar5;

    @FindBy(id = "coin_6")
    public WebElement bar6;

    @FindBy(id = "coin_7")
    public WebElement bar7;

    @FindBy(id = "coin_8")
    public WebElement bar8;

    @FindBy(xpath = "//*[@id='root']/div/div[1]/div[5]/ol/li")
    private WebElement res1;
    public WebElement result1(){return res1;}

    @FindBy(xpath = "/html/body/div/div/div[1]/div[5]/ol/li[2]")
    private WebElement res2;
    public WebElement result2(){return res2;}

    @FindBy(xpath = "/html/body/div/div/div[1]/div[5]/ol/li[3]")
    private WebElement res3;
    public WebElement result3(){return res3;}
}
