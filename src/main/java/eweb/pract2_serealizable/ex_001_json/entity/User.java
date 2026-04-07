package eweb.pract2_serealizable.ex_001_json.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    @JsonProperty("username")
    private String userName;
    private String email;
    private Boolean isActive;
    private List<String> roles;
    private Preferences preferences;
}
