package eweb.pract2_serealizable.ex_003_jackson;

import eweb.pract2_serealizable.JacksonDataBind;
import eweb.pract2_serealizable.ex_001_json.entity.Weather;
import eweb.pract2_serealizable.ex_003_jackson.entity.CurrencyRate;
import eweb.pract2_serealizable.ex_003_jackson.entity.SenseCurrency;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        JacksonDataBind.parseJsonListFromURL("https://api.monobank.ua/bank/currency", CurrencyRate.class)
                .forEach(System.out::println);

        System.out.println(JacksonDataBind.parseJsonFromURL("https://sensebank.ua/api/currency/archive",
                SenseCurrency.class));

        System.out.println(JacksonDataBind.parseJsonFromURL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m",
                Weather.class));

    }
}
