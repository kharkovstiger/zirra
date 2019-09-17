import com.jayway.jsonpath.*;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import model.CompanyInformation;
import model.facebookCompanyProfile.FacebookCompanyProfile;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, enter company name");
            return;
        }
        CompanyInformation companyInformation = new CompanyInformation();
        String companyName = args[0];
        getFacebookCompany(companyName, companyInformation);
        System.out.println(companyInformation);
    }

    private static void getFacebookCompany(String companyName, CompanyInformation companyInformation) {
        try {
            Configuration conf = Configuration
                    .builder()
                    .mappingProvider(new JacksonMappingProvider())
                    .build();

            TypeRef<List<FacebookCompanyProfile>> type = new TypeRef<List<FacebookCompanyProfile>>(){};

            String json = new String(Files.readAllBytes(Paths.get(Main.class.getResource("data/FacebookCompanyProfile1000.json").toURI())));
            Filter companyNameFilter = Filter.filter(Criteria.where("data.names").contains(companyName));
            List<FacebookCompanyProfile> facebookCompanyProfiles = JsonPath.using(conf).parse(json).read("$[?]", List.class, companyNameFilter);
//            List<FacebookCompanyProfile> facebookCompanyProfiles = JsonPath.using(conf).parse(json).read("$[?]", type);
            companyInformation.setCompanyName(facebookCompanyProfiles.get(0).get("data").get("names").get(0));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
