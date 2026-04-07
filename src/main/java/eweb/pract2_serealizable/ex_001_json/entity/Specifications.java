package eweb.pract2_serealizable.ex_001_json.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Specifications {
    private String color;
    private Double weightGrams;
    private String bluetoothVersion;
}
