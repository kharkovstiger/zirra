
package model.facebookCompanyProfile;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class FacebookStat {

    private Followers followers;
    private String id;
    private Likes likes;

}
