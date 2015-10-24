package za.ac.cput.hms.domain;

import java.io.Serializable;

/**
 * Created by student on 2015/10/23.
 */
public class Assign implements Serializable, Comparable<Assign>{

    private String id;
    private String roomNumber;
    private String studentNumber;

    public Assign(){

    }

    public Assign(Builder builder){
        this.id = builder.id;
        this.roomNumber = builder.roomNumber;
        this.studentNumber = builder.studentNumber;
    }

    public String getId(){ return id;}

    public String getRoomNumber(){ return roomNumber;}

    public String getStudentNumber(){ return studentNumber;}

    @Override
    public int compareTo(Assign assign){return id.compareTo(assign.id);}

    public static class Builder{
        private String id;
        private String roomNumber;
        private String studentNumber;

        public Builder(String studentNumber){this.studentNumber = studentNumber;}

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder roomNumber(String roomNumber){
            this.roomNumber = roomNumber;
            return this;
        }

        public Assign build(){ return new Assign(this);}
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
