package eweb.pract2_serealizable.ex_001_json.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//getters, setters, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Preferences {
    private String theme;
    private Boolean notifications;
    private String language;
}
