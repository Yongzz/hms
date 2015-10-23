package za.ac.cput.hms.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-10-20.
 */
public class Room implements Serializable, Comparable<Room> {
    private String id;
    private String type;
    private List<Residence> residence = new ArrayList<>();

    public Room(){

    }

    public Room(Builder builder){
        this.id = builder.id;
        this.type = builder.type;
        this.residence = builder.residence;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public List<Residence> getResidence() {
        return residence;
    }

    @Override
    public int compareTo(Room room){return id.compareTo(room.id);}

    public static class Builder{
        private String id;
        private String type;
        private List<Residence> residence = new ArrayList<>();

        public Builder(String type){this.type = type;}

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder residence(List<Residence> residence){
            this.residence = residence;
            return this;
        }

        public Room build(){return new Room(this);}
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
