
package model.facebookCompanyProfile;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class Address {

    private String locality;
    private String postalCode;
    private String region;
    private String streetAddress;

}
