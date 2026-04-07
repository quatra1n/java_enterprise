package eweb.pract2_serealizable.ex_003_jackson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

//
// Monobank
// [
//  {
//    "currencyCodeA": 840,
//    "currencyCodeB": 980,
//    "date": 1552392228,
//    "rateSell": 27,
//    "rateBuy": 27.2,
//    "rateCross": 27.1
//  }
//]

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyRate {

    private Integer currencyCodeA;
    private Integer currencyCodeB;
    private Long date;
    private BigDecimal rateSell;
    private BigDecimal rateBuy;
    private BigDecimal rateCross;

}
