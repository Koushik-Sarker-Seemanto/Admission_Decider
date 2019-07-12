package admission_decider.com.admission_decider.final_result;

import java.util.ArrayList;
import java.util.List;

import admission_decider.com.admission_decider.engineering_university.CUET;
import admission_decider.com.admission_decider.engineering_university.EngineeringUniversity;
import admission_decider.com.admission_decider.engineering_university.RUET;
import admission_decider.com.admission_decider.university.University;

public class ResultObject {
    public static List<EngineeringUniversity>universityList = new ArrayList<>();

    public static void addUniversity(){
        universityList.add(new RUET());
        universityList.add(new CUET());
    }

}
