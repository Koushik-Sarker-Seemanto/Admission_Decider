package admission_decider.com.admission_decider.input;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import admission_decider.com.admission_decider.R;

public class ScienceInput extends AppCompatActivity {
    private EditText ssc_gpa,bangla1,bangla2,english1,english2,ict,physics1,physics2,chemistry1,chemistry2,highermath1,highermath2,biology1,biology2;
    private Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_input);
        ssc_gpa = (EditText) findViewById(R.id.ssc_gpa);
        bangla1 = (EditText) findViewById(R.id.bangla1);
        bangla2 = (EditText) findViewById(R.id.bangla2);
        english1 = (EditText) findViewById(R.id.english1);
        english2 = (EditText) findViewById(R.id.english2);
        ict = (EditText) findViewById(R.id.ict);
        physics1 = (EditText) findViewById(R.id.physics1);
        physics2 = (EditText) findViewById(R.id.physics2);
        chemistry1 = (EditText) findViewById(R.id.chemistry1);
        chemistry2 = (EditText) findViewById(R.id.chemistry2);
        highermath1 = (EditText) findViewById(R.id.highermath1);
        highermath2 = (EditText) findViewById(R.id.highermath2);
        biology1 = (EditText) findViewById(R.id.biology1);
        biology2 = (EditText) findViewById(R.id.biology2);


        String sscGpa = ssc_gpa.toString().trim();
        String bangla1Gpa = bangla1.toString().trim();
        String bangla2Gpa = bangla2.toString().trim();
        String english1Gpa = english1.toString().trim();
        String english2Gpa = english2.toString().trim();
        String ictGpa = ict.toString().trim();
        String physics1Gpa = physics1.toString().trim();
        String physics2Gpa = physics2.toString().trim();
        String chemistry1Gpa = chemistry1.toString().trim();
        String chemistry2Gpa = chemistry2.toString().trim();
        String highermath1Gpa = highermath1.toString().trim();
        String highermath2Gpa = highermath2.toString().trim();
        String biology1Gpa = biology1.toString().trim();
        String biology2Gpa = biology2.toString().trim();

    }
}
