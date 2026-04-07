package eweb.pract2_serealizable.ex_003_jackson.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SenseItem {
    private String currency;
    private String date;
    private String time;
    private String buy;
    private String sell;
}
