package admission_decider.com.admission_decider.input;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import admission_decider.com.admission_decider.R;
import admission_decider.com.admission_decider.final_result.ResultObject;
import admission_decider.com.admission_decider.home.HomeActivity;

public class InputGroup extends AppCompatActivity {
    private Button scienceBtn,artsBtn,commerceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_group);

        scienceBtn = (Button)findViewById(R.id.scienceBtn);
        artsBtn = (Button) findViewById(R.id.artBtn);
        commerceBtn = (Button) findViewById(R.id.commerceBtn);

        scienceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ScienceInput.class));
            }
        });

        artsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ArtsInput.class));
            }
        });
        commerceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),CommerceInput.class));
            }
        });

    }
}
