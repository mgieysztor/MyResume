package pl.sdacademy.mg.myresume;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {

    private LinearLayout aboutRowHolder;


    public AboutFragment() {
        // Required empty public constructor
    }

    public static AboutFragment newInstance() {
        AboutFragment fragment = new AboutFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        aboutRowHolder = (LinearLayout) view.findViewById(R.id.about_fragment_linear_layout);
        aboutRowHolder.setWeightSum(4);
        setupAboutRows();
        return view;
    }

    public void setupAboutRows() {

        aboutRowHolder.addView(new AboutRaw(getContext(), new NoActionItem("e-mail:", "michal.gieysztor@gmail.com")));
        aboutRowHolder.addView(new AboutRaw(getContext(), new NoActionItem("phone:", "+48 791 371 402")));
        aboutRowHolder.addView(new AboutRaw(getContext(), new NoActionItem("github:", "https://github.com/mgieysztor")));
        aboutRowHolder.addView(new AboutRaw(getContext(), new NoActionItem("address:", "ul. Imbirowa 3" + System.lineSeparator() + "55-080 Krzeptów")));

    }

}
