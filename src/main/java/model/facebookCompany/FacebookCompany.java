
package model.facebookCompany;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@lombok.Data
@SuppressWarnings("unused")
public class FacebookCompany {

    private model._id _id;
    private model.facebookCompany.Data data;
    private Entry entry;
    private model._id groupID;
    private model._id jobID;
    private Timestamp timestamp;
    private String type;

}
