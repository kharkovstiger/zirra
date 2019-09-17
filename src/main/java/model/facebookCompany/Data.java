
package model.facebookCompany;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@lombok.Data
@SuppressWarnings("unused")
public class Data {

    private String descriptions;
    private String foundedYear;
    @JsonProperty("Milestones")
    private Milestones milestones;
    @JsonProperty("TeamMembers")
    private TeamMembers teamMembers;
    private String website;

}
