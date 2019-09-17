
package model.financialStats;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class Valuation {

    private Double enterpriseValueEbitda;
    private Double enterpriseValueRevenue;
    private Double forwardPE;
    private Double priceBookMRQ;

}
