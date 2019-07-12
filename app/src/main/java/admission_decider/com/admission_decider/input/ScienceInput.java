package admission_decider.com.admission_decider.input;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import admission_decider.com.admission_decider.R;
import admission_decider.com.admission_decider.converter.Converter_gpa;

public class ScienceInput extends AppCompatActivity {
    private EditText ssc_gpa,hsc_gpa, bangla,english,ict,physics,chemistry,highermath,biology;
    private Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_input);
        ssc_gpa = (EditText) findViewById(R.id.ssc_gpa);
        bangla = (EditText) findViewById(R.id.bangla);
        english = (EditText) findViewById(R.id.english);
        ict = (EditText) findViewById(R.id.ict);
        physics = (EditText) findViewById(R.id.physics);
        chemistry = (EditText) findViewById(R.id.chemistry);
        highermath = (EditText) findViewById(R.id.highermath);
        biology = (EditText) findViewById(R.id.biology);
        hsc_gpa = (EditText) findViewById(R.id.hsc_gpa);


        String sscGpa = ssc_gpa.toString().trim();
        String banglaGpa = bangla.toString().trim();
        String englishGpa = english.toString().trim();
        String ictGpa = ict.toString().trim();
        String physicsGpa = physics.toString().trim();
        String chemistryGpa = chemistry.toString().trim();
        String highermathGpa = highermath.toString().trim();
        String biologyGpa = biology.toString().trim();
        String hscGpa = hsc_gpa.toString().trim();

        Converter_gpa converter_gpa = new Converter_gpa(banglaGpa,englishGpa,ictGpa,physicsGpa,chemistryGpa,highermathGpa,biologyGpa,sscGpa,hscGpa);


    }
}
