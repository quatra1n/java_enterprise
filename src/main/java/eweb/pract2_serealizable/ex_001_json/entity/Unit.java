package eweb.pract2_serealizable.ex_001_json.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Unit<A,B,C,D,E> {
    private A time;
    private B interval;
    @JsonProperty("temperature_2m")
    private C temperature;
    @JsonProperty("relative_humidity_2m")
    private D humidity;
    @JsonProperty("wind_speed_10m")
    private E windSpeed;

}
