package admission_decider.com.admission_decider.engineering_university;

public abstract class EngineeringUniversity {
    public abstract boolean minimum_gpa_english();
    public abstract boolean minimum_gpa_hsc_ssc();
    public abstract boolean minimum_gpa_in_20();
    public abstract boolean minimum_gpa_physics_chemistry_math();

    public final boolean calculate(){
        if(minimum_gpa_english() && minimum_gpa_hsc_ssc()
                && minimum_gpa_in_20() && minimum_gpa_physics_chemistry_math()){
            return true;
        }
        return false;
    }

}
