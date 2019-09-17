
package model.LinkedInCompany;

import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@lombok.Data
@SuppressWarnings("unused")
public class Data {

    private String companyType;
    private Headquarters headquarters;
    private List<String> specialties;
    private String website;

}
