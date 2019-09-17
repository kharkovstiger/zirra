
package model.financialStats;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class SplitDividends {

    private Double forwardAnnualDividendRate;
    private Double forwardAnnualDividendYield;
    private Double payoutRatio;

}
