package za.ac.cput.hms.client.content.setup.models;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Andies on 2015-10-23.
 */
public class CityModel implements Serializable{
    @NotNull
    private String name;

    @NotNull
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
