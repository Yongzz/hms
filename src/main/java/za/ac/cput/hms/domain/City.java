package za.ac.cput.hms.domain;

import java.io.Serializable;

/**
 * Created by Andies on 2015-10-20.
 */
public class City implements Serializable, Comparable<City>{
    private String id;
    private String code;
    private String name;

    public City(){

    }

    public City(Builder builder){
        this.id = builder.id;
        this.code = builder.code;
        this.name = builder.name;
    }

    public String getId(){ return id;}

    public String getCode(){ return code;}

    public String name(){ return name;}

    @Override
    public int compareTo(City city){return id.compareTo(city.id);}

    public static class Builder{
        private String id;
        private String code;
        private String name;

        public Builder(String name){this.name = name;}

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder code(String code){
            this.code = code;
            return this;
        }

        public City build(){ return new City(this);}
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
