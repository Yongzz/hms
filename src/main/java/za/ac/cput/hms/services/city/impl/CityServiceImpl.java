package za.ac.cput.hms.services.city.impl;

import com.vaadin.spring.annotation.SpringComponent;
import org.springframework.stereotype.Service;
import za.ac.cput.hms.domain.City;
import za.ac.cput.hms.services.city.CityService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andies on 2015-10-22.
 */
@Service
@SpringComponent
public class CityServiceImpl implements CityService{

    static Map<String, City> cityMap = null;
    public CityServiceImpl() {
        if(cityMap == null){
            cityMap = new HashMap<>();
            City city = new City.Builder("Cape Town")
                    .code("8001")
                    .id("1").build();

            City city2 = new City.Builder("Johannesburg")
                    .code("2000")
                    .id("2").build();

            City city3 = new City.Builder("Port Elizabeth")
                    .code("6000")
                    .id("3").build();

            cityMap.put(city.getId(), city);
            cityMap.put(city2.getId(), city2);
            cityMap.put(city3.getId(), city3);
        }
    }
    @Override
    public City find(String s){ return cityMap.get(s);}

    @Override
    public City save(City entity){
        cityMap.put(entity.getId(), entity);
        return cityMap.get(entity.getId());
    }

    @Override
    public City merge(City entity){
        cityMap.put(entity.getId(), entity);
        return cityMap.get(entity.getId());
    }

    @Override
    public void remove(City entity){ cityMap.remove(entity.getId());}

    @Override
    public List<City> findAll(){ return new ArrayList<>(cityMap.values());}
}
