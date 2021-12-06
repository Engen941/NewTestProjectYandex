package Pages;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


@Log4j2
public class MainPage {
    SelenideElement addAdditionalMail = $(By.xpath("//*[@class='passp-button']"));
    SelenideElement entrance = $(By.xpath("//*[text()='Войти']"));
    SelenideElement login = $(By.name("login"));
    SelenideElement password = $(By.name("passwd"));
@Step("Предложение добавить почту для доп. безопасности")
    public void checkAddMail() {
        if (addAdditionalMail.exists()) {
            log.info("Обнаружен ввод дополнительной почты");
            addAdditionalMail.click();
        }
    }
    @Step("Ввод данных")
    public void signInMail(String login,String password){
        entrance.click();
        this.login.setValue(login).pressEnter();
        this.password.setValue(password).pressEnter();

    }
}
