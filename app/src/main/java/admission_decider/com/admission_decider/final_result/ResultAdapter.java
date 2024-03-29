package admission_decider.com.admission_decider.final_result;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import admission_decider.com.admission_decider.R;
import admission_decider.com.admission_decider.engineering_university.EngineeringUniversity;
import admission_decider.com.admission_decider.university.University;

public class ResultAdapter extends AbstractorAdapter  {
    private Context mCtx;

    public ResultAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }


    @Override
    public AbstractorAdapter.ResultAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_available_cardview, null);
        return new ResultAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResultAdapterViewHolder holder, final int position) {
        //getting the product of the specified position
         final EngineeringUniversity product = (EngineeringUniversity) ResultObject.universityList.get(position);

         holder.universityName.setText(product.getUniversityName());

         if(product.calculate()) {
             holder.availability.setText("Available");
         }
         else {
             holder.availability.setTextColor(Color.parseColor("#ff0000"));
             holder.availability.setText("Unavailable");
         }

    }




    @Override
    public int getItemCount() {
        return ResultObject.universityList.size();
    }


}
