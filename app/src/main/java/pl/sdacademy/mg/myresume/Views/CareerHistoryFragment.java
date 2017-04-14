package pl.sdacademy.mg.myresume.Views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import pl.sdacademy.mg.myresume.MainActivity;
import pl.sdacademy.mg.myresume.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CareerHistoryFragment extends Fragment {

    @BindView(R.id.career_history_fragment_recyclerView)
    RecyclerView mRecyclerView;

    private LinearLayoutManager mLinearLayoutManager;




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
        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        View view  = inflater.inflate(R.layout.fragment_career_history, container, false);
        return view;
    }

}
