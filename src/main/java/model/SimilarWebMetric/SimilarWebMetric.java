
package model.SimilarWebMetric;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@lombok.Data
@SuppressWarnings("unused")
public class SimilarWebMetric {

    private model._id _id;
    private model.SimilarWebMetric.Data data;
    private Entry entry;
    private Timestamp timestamp;

}
