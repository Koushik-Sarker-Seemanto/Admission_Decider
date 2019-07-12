package admission_decider.com.admission_decider.engineering_university;

public abstract class EngineeringUniversity {
    public abstract boolean calculate();


    public final void execute(){
        calculate();
    }
}
