package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

@Epic("Авторизация")
@Feature("Логин")
public class LoginTests {

    @Story("Логин с валидными кредами")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("qa-team")
    @TmsLink("TMS-101")
    @Description("Проверяем успешный логин с корректным логином и паролем")
    @Test
    void successfulLoginTest() {
        Allure.step("Открыть страницу логина");
        Allure.step("Ввести логин и пароль");
        Allure.step("Нажать кнопку Войти");
        Allure.step("Проверить, что пользователь авторизован");
    }
}
