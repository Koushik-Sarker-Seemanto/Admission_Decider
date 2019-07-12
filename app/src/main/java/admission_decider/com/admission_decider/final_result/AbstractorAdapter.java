package admission_decider.com.admission_decider.final_result;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import admission_decider.com.admission_decider.R;

public abstract class AbstractorAdapter extends RecyclerView.Adapter<AbstractorAdapter.ResultAdapterViewHolder> {


    public abstract AbstractorAdapter.ResultAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType);
    public abstract void onBindViewHolder(ResultAdapter.ResultAdapterViewHolder holder, final int position);
    public abstract int getItemCount();

    class ResultAdapterViewHolder extends RecyclerView.ViewHolder{

        TextView universityName, availability;

        public ResultAdapterViewHolder(View itemView) {
            super(itemView);
            universityName = itemView.findViewById(R.id.UniversityNameId);
            availability = itemView.findViewById(R.id.AvailabilityId);
        }



    }
}
