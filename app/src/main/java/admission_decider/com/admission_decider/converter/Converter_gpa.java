package admission_decider.com.admission_decider.converter;

import android.util.Log;

public class Converter_gpa {
    String bangla,english,ict,physics,chemistry,higerMath,
            biology,ssc_gpa,hsc_gpa;
    private static Converter_gpa converter_gpa;

    private Converter_gpa(String bangla, String english, String ict, String physics, String chemistry, String higerMath, String biology, String ssc_gpa,String hsc_gpa) {
        this.bangla = bangla;
        this.english = english;
        this.ict = ict;
        this.physics = physics;
        this.chemistry = chemistry;
        this.higerMath = higerMath;
        this.biology = biology;
        this.ssc_gpa = ssc_gpa;
        this.hsc_gpa = hsc_gpa;
    }
    public static  Converter_gpa getInstance(String bangla, String english, String ict, String physics, String chemistry, String higerMath, String biology, String ssc_gpa,String hsc_gpa){


            converter_gpa = new Converter_gpa(bangla,english,ict,physics,chemistry,higerMath,biology,ssc_gpa,hsc_gpa);
            Log.d("TAAAG",bangla);

        Log.d("TAAAG",english);
        return converter_gpa;
    }
    public static Converter_gpa getInstance(){
        return converter_gpa;
    }


    public  double getBangla() {
        return Double.parseDouble(bangla);
    }

    public double getEnglish() {
        return Double.parseDouble(english);
    }

    public double getIct() {
        return Double.parseDouble(ict);
    }

    public double getPhysics() {
        return Double.parseDouble(physics);
    }

    public double getChemistry() {
        return Double.parseDouble(chemistry);
    }

    public double getHigerMath() {
        return Double.parseDouble(higerMath);
    }

    public double getBiology() {
        return Double.parseDouble(biology);
    }

    public double getHsc_gpa() {
        return Double.parseDouble(hsc_gpa);
    }

    public double getSsc_gpa() {
        return Double.parseDouble(ssc_gpa);
    }


}
