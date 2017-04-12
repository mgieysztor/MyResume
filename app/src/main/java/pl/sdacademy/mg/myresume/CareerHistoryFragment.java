package pl.sdacademy.mg.myresume;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CareerHistoryFragment extends Fragment {


    public CareerHistoryFragment() {
        // Required empty public constructor
    }

    public static CareerHistoryFragment newInstance() {
        CareerHistoryFragment fragment = new CareerHistoryFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_career_history, container, false);
    }

}
