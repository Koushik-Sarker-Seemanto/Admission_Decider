package admission_decider.com.admission_decider.engineering_university;

import admission_decider.com.admission_decider.converter.Converter_gpa;

public class CUET extends EngineeringUniversity {

    public Converter_gpa converter_gpa;

    @Override
    public boolean calculate() {
        if(minimum_gpa_english() && minimum_gpa_hsc_ssc()
                && minimum_gpa_in_20()){
            return true;
        }
        return false;
    }

    public boolean minimum_gpa_english(){
        if (converter_gpa.getEnglish()>=3.0){
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
        +converter_gpa.getChemistry()+converter_gpa.getHigerMath())>=17.5){
            return true;
        }
        else return false;
    }


}
