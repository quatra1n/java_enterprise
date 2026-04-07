package eweb.pract2_serealizable.ex_001_json.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String productId;
    private String name;
    private String brand;
    private BigDecimal price;
    private Boolean inStock;
    private Specifications specifications;
    private List<Review> reviews;

}
