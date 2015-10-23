package za.ac.cput.hms.services;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.hms.domain.Residence;
import za.ac.cput.hms.services.residence.ResidenceService;
import za.ac.cput.hms.services.residence.impl.ResidenceServiceImpl;

import java.util.List;

/**
 * Created by Andies on 2015-10-23.
 */
public class ResidenceTest extends TestCase {

    ResidenceService residenceService = new ResidenceServiceImpl();

    @Test
    public void testReadAll() throws Exception{
        List<Residence> residences = residenceService.findAll();
        System.out.println(residences.get(0).getName());
        Assert.assertNotNull(residences);
    }

    @Test
    public void testFindOne() throws Exception{
        Residence residence = residenceService.find("2");
        System.out.println(residence.getName());
        Assert.assertEquals(residence.getName(), "Sandton Res");
    }

    @Test
    public void testUpdate() throws Exception {
        Residence residence = residenceService.find("1");
        Residence residenceUpdate = new  Residence.Builder(getName())
                .copy(residence).town("Athlone").build();
        residenceService.merge(residenceUpdate);
        Residence checkUpdated = residenceService.find("1");
        Assert.assertEquals(residenceUpdate.getTown(), checkUpdated.getTown());
    }
}
