package eweb.pract_serealizable.ex_002_gson;

import eweb.pract_serealizable.ex_002_gson.parser.GsonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}
