package admission_decider.com.admission_decider.input;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import admission_decider.com.admission_decider.R;
import admission_decider.com.admission_decider.converter.Converter_gpa;
import admission_decider.com.admission_decider.engineering_university.CUET;
import admission_decider.com.admission_decider.engineering_university.RUET;
import admission_decider.com.admission_decider.final_result.ResultObject;
import admission_decider.com.admission_decider.final_result.ResultPage;

public class ScienceInput extends AppCompatActivity {
    private EditText ssc_gpa,hsc_gpa, bangla,english,ict,physics,chemistry,highermath,biology;
    private Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_input);

        submitbtn = findViewById(R.id.submitBtn);

        ssc_gpa = (EditText) findViewById(R.id.ssc_gpa);
        bangla = (EditText) findViewById(R.id.bangla);
        english = (EditText) findViewById(R.id.english);
        ict = (EditText) findViewById(R.id.ict);
        physics = (EditText) findViewById(R.id.physics);
        chemistry = (EditText) findViewById(R.id.chemistry);
        highermath = (EditText) findViewById(R.id.highermath);
        biology = (EditText) findViewById(R.id.biology);
        hsc_gpa = (EditText) findViewById(R.id.hsc_gpa);





        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sscGpa = ssc_gpa.getText().toString().trim();
                String banglaGpa = bangla.getText().toString().trim();
                String englishGpa = english.getText().toString().trim();
                String ictGpa = ict.getText().toString().trim();
                String physicsGpa = physics.getText().toString().trim();
                String chemistryGpa = chemistry.getText().toString().trim();
                String highermathGpa = highermath.getText().toString().trim();
                String biologyGpa = biology.getText().toString().trim();
                String hscGpa = hsc_gpa.getText().toString().trim();
                Log.d("TAGG", banglaGpa);

                Converter_gpa converter_gpa = Converter_gpa.getInstance(banglaGpa,englishGpa,ictGpa,physicsGpa,chemistryGpa,highermathGpa,biologyGpa,sscGpa,hscGpa);
                Log.d("HI","B A L");
                ResultObject.universityList.clear();
                ResultObject.universityList.add(RUET.getInstance());
                ResultObject.universityList.add(CUET.getInstance());
                startActivity(new Intent(getApplicationContext(),ResultPage.class));
            }
        });


    }
}
