package za.ac.cput.hms.services.residence.impl;

import com.vaadin.spring.annotation.SpringComponent;
import org.springframework.stereotype.Service;
import za.ac.cput.hms.domain.City;
import za.ac.cput.hms.domain.Residence;
import za.ac.cput.hms.services.residence.ResidenceService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andies on 2015-10-22.
 */
@Service
@SpringComponent
public class ResidenceServiceImpl implements ResidenceService{
    static Map<String, Residence> residenceMap = null;
    public ResidenceServiceImpl(){
        if(residenceMap == null){
            residenceMap = new HashMap<>();
            List<City> cities = new ArrayList<>();
            City city = new City.Builder("Cape Town")
                    .code("8000")
                    .id("1").build();

            cities.add(city);
            Residence residence = new Residence.Builder("Plein")
                    .town("Cape Town")
                    .city(cities)
                    .id("1").build();

            List<City> cities2 = new ArrayList<>();
            City city2 = new City.Builder("Johannesburg")
                    .code("2000")
                    .id("2").build();

            cities.add(city2);
            Residence residence2 = new Residence.Builder("Sandton Res")
                    .town("Sandton")
                    .city(cities2)
                    .id("2").build();

            List<City> cities3 = new ArrayList<>();
            City city3 = new City.Builder("Port Elizabeth")
                    .code("6000")
                    .id("3").build();

            cities.add(city3);
            Residence residence3 = new Residence.Builder("New Briton Res")
                    .town("Port Elizabeth")
                    .city(cities3)
                    .id("3").build();
        }
    }
    @Override
    public Residence find(String s) {
        return residenceMap.get(s);
    }

    @Override
    public Residence save(Residence entity) {
        residenceMap.put(entity.getId(),entity);
        return residenceMap.get(entity.getId());
    }

    @Override
    public Residence merge(Residence entity) {
        residenceMap.put(entity.getId(),entity);
        return residenceMap.get(entity.getId());
    }

    @Override
    public void remove(Residence entity) {
        residenceMap.remove(entity.getId());
    }

    @Override
    public List<Residence> findAll() {
        return new ArrayList<>(residenceMap.values());
    }
}
