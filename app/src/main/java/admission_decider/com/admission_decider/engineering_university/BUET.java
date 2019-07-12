package admission_decider.com.admission_decider.engineering_university;

import admission_decider.com.admission_decider.converter.Converter_gpa;
import admission_decider.com.admission_decider.university.University;

public class BUET extends EngineeringUniversity implements University {
    private static BUET buet;
    public Converter_gpa converter_gpa = Converter_gpa.getInstance();
    public final String uni_name = "Bangladesh University of Engineering & Technology";

    private BUET() {

    }

    public static BUET getInstance(){
        if(buet == null)
            buet = new BUET();
        return buet;
    }

    public boolean minimum_gpa_english(){
        return true;
    }

    public boolean minimum_gpa_hsc_ssc(){
        if((converter_gpa.getSsc_gpa()>=5.0)
                && (converter_gpa.getHsc_gpa()>=4.0)){
            return true;
        }
        else return false;
    }

    public boolean minimum_gpa_in_20(){
        if((converter_gpa.getEnglish()+converter_gpa.getPhysics()
                +converter_gpa.getChemistry()+converter_gpa.getHigerMath()+
                converter_gpa.getBangla())>=22.5){
            return true;
        }
        else return false;
    }

    public boolean minimum_gpa_physics_chemistry_math(){
        return true;
    }


    @Override
    public String getUniversityName() {
        return uni_name;
    }
}
