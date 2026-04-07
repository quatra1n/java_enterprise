package eweb.pract2_serealizable.ex_003_jackson;

import eweb.pract2_serealizable.JacksonDataBind;
import eweb.pract2_serealizable.ex_003_jackson.entity.CurrencyRate;
import eweb.pract2_serealizable.ex_003_jackson.entity.SenseCurrency;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        JacksonDataBind.parseJsonListFromURL("https://api.monobank.ua/bank/currency", CurrencyRate.class)
                .forEach(System.out::println);

        System.out.println(JacksonDataBind.parseJsonFromURL("https://sensebank.ua/api/currency/archive",
                SenseCurrency.class));

    }
}
