
package model.SimilarWebMetric;

import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@lombok.Data
@SuppressWarnings("unused")
public class Data {

    private CategoryRank categoryRank;
    private List<Competitor> competitors;
    private String dailyDesktopVisitsPathID;
    private List<SimilarSite> similarSites;

}
