package pl.sdacademy.mg.myresume;

/**
 * Created by RENT on 2017-04-13.
 */
public class Duty {
    private boolean itRelated;
    private String dutyDescription;


    public Duty(boolean itRelated, String dutyDescription) {
        this.itRelated = itRelated;
        this.dutyDescription = dutyDescription;
    }

    public boolean isItRelated() {
        return itRelated;
    }

    public String getDutyDescription() {
        return dutyDescription;
    }
}
