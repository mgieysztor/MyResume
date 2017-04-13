package pl.sdacademy.mg.myresume;

import java.util.List;

/**
 * Created by RENT on 2017-04-13.
 */

public class Employment {

    private String position;
    private String employerName;
    private String employerLocation;
    private String employmentDuration;
    private String employerDescription;
    private List<Duty> employerDuties;

    public Employment(String position, String employerName, String employerLocation,
                      String employmentDuration, String employerDescription, List<Duty> employerDuties) {
        this.position = position;
        this.employerName = employerName;
        this.employerLocation = employerLocation;
        this.employmentDuration = employmentDuration;
        this.employerDescription = employerDescription;
        this.employerDuties = employerDuties;
    }

    public String getPosition() {
        return position;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerLocation() {
        return employerLocation;
    }

    public String getEmploymentDuration() {
        return employmentDuration;
    }

    public String getEmployerDescription() {
        return employerDescription;
    }

    public List<Duty> getEmployerDuties() {
        return employerDuties;
    }
}
