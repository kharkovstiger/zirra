
package model.financialStats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class Technicals {

    private Double beta;
    @JsonProperty("DayMA200")
    private Double dayMA200;
    @JsonProperty("DayMA50")
    private Double dayMA50;
    private Long sharesShort;
    private Long sharesShortPriorMonth;
    private Double shortPercent;
    private Double shortRatio;
    @JsonProperty("WeekHigh52")
    private Double weekHigh52;
    @JsonProperty("WeekLow52")
    private Double weekLow52;

}
