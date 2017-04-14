package pl.sdacademy.mg.myresume.Views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.sdacademy.mg.myresume.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalSummaryFragment extends Fragment {


    public PersonalSummaryFragment() {
        // Required empty public constructor
    }

    public static PersonalSummaryFragment newInstance() {
        PersonalSummaryFragment fragment = new PersonalSummaryFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal_summary, container, false);
    }

}
