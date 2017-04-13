package pl.sdacademy.mg.myresume;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by RENT on 2017-04-13.
 */

public class AboutRaw extends LinearLayout{



    public AboutRaw(final Context context, final AboutItem aboutItem) {
        super(context);
        setupLayout(context);
        TextView labelTextView = setupLabelText (context, aboutItem);
        TextView valueTextView = setupValueText (context, aboutItem);
        addViews(labelTextView, valueTextView);
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutItem.performActionOnClick(context);
            }
        });
    }

    private void addViews(TextView labelTextView, TextView valueTextView) {
        this.addView(labelTextView);
        this.addView(valueTextView);
    }

    private TextView setupLabelText(Context context, AboutItem aboutItem) {
        TextView labelText = new TextView(context);
        labelText.setText(aboutItem.getLabel());
        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMarginStart((int) getResources().getDimension(R.dimen.fragment_about_label_left_margin));
        layoutParams.weight = 1;
        labelText.setLayoutParams(layoutParams);
        return labelText;
    }

    private TextView setupValueText(Context context, AboutItem aboutItem) {
        TextView valueText = new TextView(context);
        valueText.setGravity(Gravity.START);
        valueText.setLines(2);
        valueText.setText(aboutItem.getValue());
//        valueText.setGravity(Gravity.LEFT);
        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        layoutParams.weight=3;
        valueText.setLayoutParams(layoutParams);
        return valueText;
    }

    private void setupLayout(Context context) {
        this.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 60));
        this.setOrientation(HORIZONTAL);
    }
}
