package admission_decider.com.admission_decider.engineering_university;

import admission_decider.com.admission_decider.converter.Converter_gpa;
import admission_decider.com.admission_decider.final_result.ResultObject;
import admission_decider.com.admission_decider.university.University;

public class RUET extends EngineeringUniversity {

    public Converter_gpa converter_gpa = Converter_gpa.getInstance();
    public final String uni_name = "RUET: Rajshahi University of Engineering & Technology";

    public RUET() {
    }

    public boolean minimum_gpa_english(){

        if (converter_gpa.getEnglish()>=3.5){
            return true;
        }
        return false;
    }

    public boolean minimum_gpa_hsc_ssc(){
        if((converter_gpa.getSsc_gpa()>=4.0)
                && (converter_gpa.getHsc_gpa()>=4.0)){
            return true;
        }
        else return false;
    }

    public boolean minimum_gpa_in_20(){
        if((converter_gpa.getEnglish()+converter_gpa.getPhysics()
                +converter_gpa.getChemistry()+converter_gpa.getHigerMath())>=18){
            return true;
        }
        else return false;
    }

    public boolean minimum_gpa_physics_chemistry_math(){
        if((converter_gpa.getPhysics()>=4.0) && (converter_gpa.getChemistry()>=4.0)
                && (converter_gpa.getHigerMath()>=4.0) && (converter_gpa.getEnglish()>=3.5)){
            return true;

        }
        return false;
    }

    @Override
    public String getUniversityName() {
        return "Rajshahi University of Engineering & Technology";
    }
}
