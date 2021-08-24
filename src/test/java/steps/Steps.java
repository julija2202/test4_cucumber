package steps;

import helps.Log;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.ru.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Steps {

    @Допустим("^открыта страница \"([^\"]*)\"$")
    public void openPage(String pageURL) {
        open(pageURL);
        getWebDriver().manage().window().maximize();
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(pageURL, currentPageURL, "Значения ссылок не сопадают");
    }

    @И("^в поле с логином введен логин \"([^\"]*)\"$")
    public void login(String text) {
        $(By.id("user-name")).setValue(text);
    }

    @И("^в поле с паролем введен пароль \"([^\"]*)\"$")
    public void password(String text) {
        $(By.id("password")).setValue(text);
    }

    @Допустим("^нажата кнопка \"([^\"]*)\"$")
    public void click(String text) {
        $("#login-button").click();
    }


    @И("^нажали на кнопку добавления вещи в корзину \"([^\"]*)\"$")
    public void clickOnButton(String text) {
        $(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']")).click();
    }
   /* @И("^открыли корзину \"([^\"]*)\"$")
    public void openLink(String siteURL) {
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(siteURL, currentPageURL, "Значения ссылок не сопадают");
        }*/

    @Тогда("^найденная вещь \"([^\"]*)\" лежит в корзине$")
    public void checkName(String name) {
        String text_name = $(By.cssSelector("#item_4_title_link > div")).getText();
System.out.println(text_name);
    }
    @Тогда("^выполнено нажатие на ссылку \"([^\"]*)\"$")
    public void clickOn(String string) {
        $(By.xpath("//*[contains(text(), \"" + string + "\")]")).click();;
    }
    @Тогда("^цена вещи равна \"([^\"]*)\"$")
    public void thingPrice(String price) {
        String actualPrice = $(By.className("inventory_details_price")).getText();
        assertEquals(actualPrice.contains(price), "Актуальная и ожидаемая цена не совпадают");
    }
}

