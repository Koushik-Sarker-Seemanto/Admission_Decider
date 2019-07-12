package admission_decider.com.admission_decider.final_result;

import android.content.Context;

public class AdapterFactory {
    public static AbstractorAdapter get(Context context,int type){
        if(type==1)
            return new ResultAdapter(context);
        return null;
    }
}
