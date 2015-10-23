package za.ac.cput.hms.client.content.setup.models;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Andies on 2015-10-23.
 */
public class ResidenceModel implements Serializable {

    @NotNull
    private String name;

    @NotNull
    private String town;

    @NotNull
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
