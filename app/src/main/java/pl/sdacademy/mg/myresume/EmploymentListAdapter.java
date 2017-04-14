package pl.sdacademy.mg.myresume;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.sdacademy.mg.myresume.Model.Employment;

/**
 * Created by Michał on 14-04-2017.
 */

public class EmploymentListAdapter extends RecyclerView.Adapter<EmploymentListAdapter.EmploymentHolder> {

    private List<Employment> employmentsList;

    public class EmploymentHolder extends RecyclerView.ViewHolder {

        public TextView mPosition;
        public TextView mCompany;
        public TextView mCompanyLocation;

        public EmploymentHolder(View itemView) {
            super(itemView);
            mPosition = (TextView) itemView.findViewById(R.id.career_event_position);
            mCompany = (TextView) itemView.findViewById(R.id.career_event_company);
            mCompanyLocation = (TextView) itemView.findViewById(R.id.career_event_company_location);
        }


    }

    public EmploymentListAdapter(List<Employment> employmentsList) {
        this.employmentsList = employmentsList;
    }

    @Override
    public EmploymentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_career_row, parent, false);
        return new EmploymentHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EmploymentHolder holder, int position) {
        Employment employment = employmentsList.get(position);
        holder.mPosition.setText(employment.getPosition());
        holder.mCompany.setText(employment.getEmployerName());
        holder.mCompanyLocation.setText(employment.getEmployerLocation());
    }

    @Override
    public int getItemCount() {
        return employmentsList.size();
    }
}



