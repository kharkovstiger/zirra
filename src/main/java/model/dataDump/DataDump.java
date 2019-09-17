
package model.dataDump;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@SuppressWarnings("unused")
public class DataDump {

    private String content;
    private String date;
    private List<Object> images;
    private String language;
    private String title;

}
