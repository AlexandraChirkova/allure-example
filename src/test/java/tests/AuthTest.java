package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class AuthTest {

    @Story("Логин с валидными кредами в google")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("allure8")
    @AllureId("42074")
    @Description("Проверяем успешный логин с корректным логином и паролем")
    @Test
    void googleLoginTest() {
        Allure.step("Открываем главную страницу");
        Allure.step("Авторизуемся как пользователь");
        Allure.step("Проверяем");
        Allure.step("Проверить данные пользователя");
    }
}
