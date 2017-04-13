package pl.sdacademy.mg.myresume;

import android.content.Context;

/**
 * Created by RENT on 2017-04-13.
 */

public abstract class AboutItem {
    private String label;
    private String value;

    public AboutItem(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    public abstract void performActionOnClick(Context context);

}
