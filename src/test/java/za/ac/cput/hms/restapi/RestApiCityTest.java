package za.ac.cput.hms.restapi;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.hms.client.content.setup.models.CityModel;

/**
 * Created by Andies on 2015-10-23.
 */
public class RestApiCityTest extends TestCase{

    @Test
    public void testPost() throws Exception {

        CityModel cityModel = new CityModel();
        cityModel.setName("Cape Town");
        cityModel.setCode("8001");
        RestApiConnector.create(UrlPath.CityLinks.POST, cityModel,CityModel.class);
    }
}
