package ru.netology.test;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.LoginPageV1;

import static com.codeborne.selenide.Selenide.open;

public class MoneyTransferTest {



    @Test
    void shouldTransferMoneyBetweenOwnCardsV1() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "800x800";
        open("http://localhost:9999");
        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = verificationPage.validVerify(verifyInfo);



        }

}