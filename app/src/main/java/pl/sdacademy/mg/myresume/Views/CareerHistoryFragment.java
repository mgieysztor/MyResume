package pl.sdacademy.mg.myresume.Views;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.sdacademy.mg.myresume.EmploymentListAdapter;
import pl.sdacademy.mg.myresume.EmploymentRepository;
import pl.sdacademy.mg.myresume.MainActivity;
import pl.sdacademy.mg.myresume.Model.Employment;
import pl.sdacademy.mg.myresume.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CareerHistoryFragment extends Fragment {

    private RecyclerView mRecyclerView;

    private EmploymentRepository mEmploymentRepository= new EmploymentRepository();
    private List<Employment> mEmploymentsList = mEmploymentRepository.getEmploymentList();
//    private LinearLayoutManager mLinearLayoutManager;
    private EmploymentListAdapter mEmploymentListAdapter;




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

        View view  = inflater.inflate(R.layout.fragment_career_history, container, false);

        Log.i("container.getParent", "" + container.getParent());

        mRecyclerView = (RecyclerView) view.findViewById(R.id.career_history_fragment_recyclerView);
        RecyclerView.LayoutManager mLinearLayoutManager = new LinearLayoutManager(getContext().getApplicationContext());

//        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mEmploymentListAdapter = new EmploymentListAdapter(mEmploymentsList);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mEmploymentListAdapter);

        return view;
    }

}
