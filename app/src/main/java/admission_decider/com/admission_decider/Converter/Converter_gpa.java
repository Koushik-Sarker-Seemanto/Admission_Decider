package admission_decider.com.admission_decider.Converter;

public class Converter_gpa {
    String bangla_first,bangala_second,english_first,english_second,ict,physics_first,
    physics_second,chemistry_first,chemistry_second,higerMath_first,higherMath_second,
            biology_first,biology_second;

    public Converter_gpa(String bangla_first, String bangala_second, String english_first,
                         String english_second, String ict, String physics_first,
                         String physics_second, String chemistry_first, String chemistry_second,
                         String higerMath_first, String higherMath_second, String biology_first,
                         String biology_second) {
        this.bangla_first = bangla_first;
        this.bangala_second = bangala_second;
        this.english_first = english_first;
        this.english_second = english_second;
        this.ict = ict;
        this.physics_first = physics_first;
        this.physics_second = physics_second;
        this.chemistry_first = chemistry_first;
        this.chemistry_second = chemistry_second;
        this.higerMath_first = higerMath_first;
        this.higherMath_second = higherMath_second;
        this.biology_first = biology_first;
        this.biology_second = biology_second;
    }

    public double getBangla_first() {
        return Double.parseDouble(bangla_first);
    }

    public double getBangala_second() {
        return Double.parseDouble(bangala_second);
    }

    public double getEnglish_first() {
        return Double.parseDouble(english_first);
    }

    public double getEnglish_second() {
        return Double.parseDouble(english_second);
    }

    public double getIct() {
        return Double.parseDouble(ict);
    }

    public double getPhysics_first() {
        return Double.parseDouble(physics_first);
    }

    public double getPhysics_second() {
        return Double.parseDouble(physics_second);
    }

    public double getChemistry_first() {
        return Double.parseDouble(chemistry_first);
    }

    public double getChemistry_second() {
        return Double.parseDouble(chemistry_second);
    }

    public double getHigerMath_first() {
        return Double.parseDouble(higerMath_first);
    }

    public double getHigherMath_second() {
        return Double.parseDouble(higherMath_second);
    }

    public double getBiology_first() {
        return Double.parseDouble(biology_first);
    }

    public double getBiology_second() {
        return Double.parseDouble(biology_second);
    }
    public double getSSC_gpa(){
        return 0;
    }

    public double getHSC_gpa(){
        return 0;
    }

    public double getEnglish(){
        return (getEnglish_first()+getEnglish_second())/2.0;
    }

    public double getPhysics(){
        return (getPhysics_first()+getPhysics_second())/2.0;
    }
    public double getChemistry(){
        return (getChemistry_first()+getChemistry_second())/2.0;
    }
    public double getHigherMath(){
        return (getHigerMath_first()+getHigherMath_second())/2.0;
    }
}
