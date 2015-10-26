package za.ac.cput.hms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2015/10/23.
 */
public class Report implements Serializable, Comparable<Report>{

    private String id;
    private String referenceCode;
    private String description;
    private Date incidentDate;
    private String studentNumber;


    public Report(){

    }

    public Report(Builder builder){
        this.id = builder.id;
        this.referenceCode = builder.referenceCode;
        this.description = builder.description;
        this.incidentDate = builder.incidentDate;
        this.studentNumber =  builder.studentNumber;
    }

    public String getId(){ return id;}

    public String getReferenceCode(){ return referenceCode;}

    public String getDescription(){ return description;}

    public Date getIncidentDate(){return incidentDate;}

    public String getStudentNumber(){return studentNumber;}

    @Override
    public int compareTo(Report report){return id.compareTo(report.id);}

    public static class Builder{
        private String id;
        private String referenceCode;
        private String description;
        private Date incidentDate;
        private String studentNumber;

        public Builder(String description){this.description = description;}

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder referenceCode(String referenceCode){
            this.referenceCode = referenceCode;
            return this;
        }

        public Report build(){ return new Report(this);}
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
