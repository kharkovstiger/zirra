
package model.financialStats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class Highlights {

    private Double bookValue;
    private Double dilutedEpsTTM;
    private Double dividendShare;
    private Double dividendYield;
    @JsonProperty("EBITDA")
    private Long eBITDA;
    private Double ePSEstimateCurrentYear;
    private Double ePSEstimateNextQuarter;
    private Double ePSEstimateNextYear;
    private Double earningsShare;
    private Long grossProfitTTM;
    private Long marketCapitalization;
    private Double operatingMarginTTM;
    @JsonProperty("PEGRatio")
    private Double pEGRatio;
    @JsonProperty("PERatio")
    private Double pERatio;
    private Double profitMargin;
    private Double quarterlyEarningsGrowthYOY;
    private Double quarterlyRevenueGrowthYOY;
    private Double returnOnAssetsTTM;
    private Double returnOnEquityTTM;
    private Double revenuePerShareTTM;
    private Long revenueTTM;
    private Double wallStreetTargetPrice;

}
