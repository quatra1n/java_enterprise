package eweb.pract_serealizable.ex_002_gson.entity;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyRate {

    @SerializedName("r030")
    private Integer id;

    @SerializedName("txt")
    private String name;
    private BigDecimal rate;
    private String cc;

    @SerializedName("exchangedate")
    private String exchangeDate;
    private String special;

}
