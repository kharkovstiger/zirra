
package model.facebookCompanyProfile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@lombok.Data
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookCompanyProfile {

    private model._id _id;
    private model.facebookCompanyProfile.Data data;
    private Entry entry;
    private model._id groupID;
    private model._id jobID;
    private Timestamp timestamp;
    private String type;

}
