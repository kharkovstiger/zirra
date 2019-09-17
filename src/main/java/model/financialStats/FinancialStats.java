
package model.financialStats;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class FinancialStats {

    private String _id;
    private String exchange;
    private Highlights highlights;
    private SplitDividends splitDividends;
    private String symbol;
    private Technicals technicals;
    private Valuation valuation;

}
