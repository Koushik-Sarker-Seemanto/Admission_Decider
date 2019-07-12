package admission_decider.com.admission_decider.final_result;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import admission_decider.com.admission_decider.R;
import admission_decider.com.admission_decider.engineering_university.CUET;
import admission_decider.com.admission_decider.engineering_university.RUET;

public class ResultPage extends AppCompatActivity {
    RecyclerView recyclerView;
    ResultAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //creating recyclerview adapter
        adapter = (ResultAdapter) AdapterFactory.get(this,1);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }
}
