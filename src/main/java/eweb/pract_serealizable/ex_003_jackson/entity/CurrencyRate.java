package eweb.pract_serealizable.ex_003_jackson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyRate {

    @JsonProperty("r030")
    private Integer id;

    @JsonProperty("txt")
    private String name;
    private BigDecimal rate;
    private String cc;

    @JsonProperty("exchangedate")
    private String exchangeDate;
    private String special;

}
