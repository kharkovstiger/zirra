
package model.facebookCompanyProfile;

import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@lombok.Data
@SuppressWarnings("unused")
public class Data {

    private List<Address> addresses;
    private FacebookStat facebookStat;
    private List<String> names;
    private String telephone;
    private String website;

}
