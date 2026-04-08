package eweb.pract2_serealizable.ex_001_json.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private Double latitude;
    private Double longitude;
    @JsonProperty("generationtime_ms")
    private BigDecimal generationTime;
    @JsonProperty("utc_offset_seconds")
    private Integer UtcOffsetSeconds;
    private String timezone;
    @JsonProperty("timezone_abbreviation")
    private String timezoneAbbr;
    private Integer elevation;
    @JsonProperty("current_units")
    private Unit<String, String, String, ?, String> currentUnits;
    private Unit<String, Integer, Double, ?, Double> current;
    @JsonProperty("hourly_units")
    private Unit<String, ?, String, String, String> hourlyUnits;
    private Hourly hourly;

}
