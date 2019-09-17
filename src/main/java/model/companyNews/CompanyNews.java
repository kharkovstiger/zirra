
package model.companyNews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class CompanyNews {

    private model._id _id;
    private List<String> companyIDs;
    private String content;
    private Date date;
    private Boolean deleted;
    private String title;
    @JsonProperty("URL")
    private String uRL;

}
