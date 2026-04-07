package eweb.pract2_serealizable.ex_001_json.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleData {
    private long articleId;
    private String title;
    private String publishedAt;
    private List<String> tags;
}
