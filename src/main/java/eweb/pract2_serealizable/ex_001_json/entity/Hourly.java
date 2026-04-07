package eweb.pract2_serealizable.ex_001_json.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hourly {
    private List<String> time;
    @JsonProperty("temperature_2m")
    private List<Double> temperature;
    @JsonProperty("relative_humidity_2m")
    private List<Integer> humidity;
    @JsonProperty("wind_speed_10m")
    private List<Double> windSpeed;
}
