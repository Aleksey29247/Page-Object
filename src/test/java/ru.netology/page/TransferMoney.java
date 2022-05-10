
package ru.netology.page;

import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TransferMoney {

        private final String card1 = "5559 0000 0000 0001";
        private final String card2 = "5559 0000 0000 0002";


    public DashboardPage transferMoney (String amount){
        $$ (withText("Пополнить")).first().click();
        $ ("[data-test-id='amount'] input").setValue(amount);
        $ ("[data-test-id='from'] input").setValue(card2);
        $ ("[data-test-id='action-transfer'] input").click();
        return new DashboardPage();
    }


}


