package eweb.pract2_serealizable;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import eweb.pract2_serealizable.ex_001_json.entity.SiteInfo;
import eweb.pract2_serealizable.ex_003_jackson.entity.CurrencyRate;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class JacksonDataBind {
    public static <T> T parseJson(String path, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();

        T object = null;

        try {
            object = objectMapper.readValue(new File(path), clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return object;
    }

    public static void parse2Json(String path) {
        ObjectMapper objectMapper = new ObjectMapper();

        SiteInfo sf = null;

        try {
            sf = objectMapper.readValue(new File(path), SiteInfo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sf);
    }

    public static <T> List<T> parseJsonListFromURL(String url, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        CollectionType collectionType = objectMapper.getTypeFactory().constructCollectionType(List.class, clazz);

        List<T> objects = objectMapper.readValue(new URL(url), collectionType);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(objects);

        Files.write(Paths.get("D:\\JAVA\\java_enterprise\\src\\main\\resources\\json_pract\\jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);

        return objects;
    }

    public static <T> T parseJsonFromURL(String url, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        T object = objectMapper.readValue(new URL(url), clazz);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(object);

        Files.write(Paths.get("D:\\JAVA\\java_enterprise\\src\\main\\resources\\json_pract\\jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);

        return object;
    }


}
