package za.ac.cput.hms.services.room.impl;

import com.vaadin.spring.annotation.SpringComponent;
import org.springframework.stereotype.Service;
import za.ac.cput.hms.domain.City;
import za.ac.cput.hms.domain.Residence;
import za.ac.cput.hms.domain.Room;
import za.ac.cput.hms.services.room.RoomService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andies on 2015-10-22.
 */
@Service
@SpringComponent
public class RoomServiceImpl implements RoomService {

    static Map<String, Room> roomMap = null;
    public RoomServiceImpl(){
        if(roomMap == null){
            roomMap = new HashMap<>();
            List<City> cities = new ArrayList<>();
            City city = new City.Builder("Cape Town")
                    .code("8000")
                    .id("1").build();

            cities.add(city);
            List<Residence> residences = new ArrayList<>();
            Residence residence = new Residence.Builder("Plein")
                    .town("Cape Town")
                    .city(cities)
                    .id("1").build();

            residences.add(residence);
            Room room = new Room.Builder("Single")
                    .residence(residences)
                    .id("1").build();

            List<City> cities2 = new ArrayList<>();
            City city2 = new City.Builder("Johannesburg")
                    .code("2000")
                    .id("2").build();

            cities.add(city2);
            List<Residence> residences2 = new ArrayList<>();
            Residence residence2 = new Residence.Builder("Sandton Res")
                    .town("Sandton")
                    .city(cities2)
                    .id("2").build();

            residences2.add(residence);
            Room room2 = new Room.Builder("Double")
                    .residence(residences2)
                    .id("2").build();
        }
    }
    @Override
    public Room find(String s) {
        return roomMap.get(s);
    }

    @Override
    public Room save(Room entity) {
        roomMap.put(entity.getId(), entity);
        return roomMap.get(entity.getId());
    }

    @Override
    public Room merge(Room entity) {
        roomMap.put(entity.getId(),entity);
        return roomMap.get(entity.getId());
    }

    @Override
    public void remove(Room entity) {
        roomMap.remove(entity.getId());
    }

    @Override
    public List<Room> findAll() {
        return new ArrayList<>(roomMap.values());
    }
}
