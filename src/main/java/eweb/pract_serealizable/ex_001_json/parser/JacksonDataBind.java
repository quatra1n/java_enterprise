package eweb.pract_serealizable.ex_001_json.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static <T> void parseJson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();

        T person = null;

        try {
            person = objectMapper.readValue(new File(path), new TypeReference<T>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(person);
    }
}
