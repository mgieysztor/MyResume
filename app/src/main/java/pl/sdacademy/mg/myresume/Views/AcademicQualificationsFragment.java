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
public class AcademicQualificationsFragment extends Fragment {


    public AcademicQualificationsFragment() {
        // Required empty public constructor
    }

    public static AcademicQualificationsFragment    newInstance() {
        AcademicQualificationsFragment fragment = new AcademicQualificationsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_academic_qualifications, container, false);
    }

}
