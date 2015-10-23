package za.ac.cput.hms.services;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.hms.domain.City;
import za.ac.cput.hms.services.city.CityService;
import za.ac.cput.hms.services.city.impl.CityServiceImpl;

import java.util.List;

/**
 * Created by Andies on 2015-10-23.
 */
public class CityTest extends TestCase {

    private CityService cityService = new CityServiceImpl();

    @Test
    public void testReadAll() throws Exception{
        List<City> cities = cityService.findAll();
        System.out.println(cities.get(0).getName());
        Assert.assertNotNull(cities);
    }

    @Test
    public void testFindOne() throws Exception{
        City city = cityService.find("2");
        System.out.println(city.getName());
        Assert.assertEquals(city.getName(), "Johannesburg");
    }
}
