package za.ac.cput.hms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2015/10/23.
 */
public class Student implements Serializable, Comparable<Student> {

    private String id;
    private String studentNumber;
    private String name;
    private String surname;
    private String gender;


    public Student(){

    }

    public Student(Builder builder){
        this.id = builder.id;
        this.studentNumber = builder.studentNumber;
        this.name = builder.name;
        this.surname = builder.surname;
        this.gender =  builder.gender;
    }

    public String getId(){ return id;}

    public String getStudentNumber(){ return studentNumber;}

    public String getName(){ return name;}

    public String getSurname(){return surname;}

    public String getGender(){return gender;}

    @Override
    public int compareTo(Student student){return id.compareTo(student.id);}

    public static class Builder{
        private String id;
        private String studentNumber;
        private String name;
        private String surname;
        private String gender;

        public Builder(String name){this.name = name;}

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder studentNumber(String studentNumber){
            this.studentNumber = studentNumber;
            return this;
        }

        public Student build(){ return new Student(this);}
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
