
package model.facebookCompanyProfile;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class Entry {

    private String _id;
    @JsonProperty("BIID")
    private String bIID;
    private String configType;

}
