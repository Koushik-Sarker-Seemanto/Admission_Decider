package admission_decider.com.admission_decider.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import admission_decider.com.admission_decider.R;
import admission_decider.com.admission_decider.input.InputGroup;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        startActivity(new Intent(getApplicationContext(),InputGroup.class));
    }
}
