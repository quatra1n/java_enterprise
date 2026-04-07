package eweb.pract2_serealizable.ex_001_json.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SiteInfo {
    private String status;
    private Meta meta;
    @JsonProperty("data")
    private List<ArticleData> articleData;
}
