package Tests;

import Pages.MainPage;
import io.qameta.allure.Step;
import junitExtensions.BaseConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(BaseConfig.class)
public class TestOfMailBox {
    MainPage mainPage = new MainPage();
    @Test
        @Step("Вход в почту")
    public void Test() {
        mainPage.signInMail("EvgeniyFilippov8@yandex.ru","examplePassword");
        mainPage.checkAddMail();
        System.out.println();
    }


}
