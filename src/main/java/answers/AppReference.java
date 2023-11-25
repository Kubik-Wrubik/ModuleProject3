package answers;

import java.util.HashMap;
import java.util.Map;

import static answers.AppContent.*;

public class AppReference {
    private final static Map<String, String> refs = new HashMap<>();

    static {
        refs.put(STEP_0_ACCEPTED, "jsp/step1.jsp");
        refs.put(STEP_1_ACCEPTED, "jsp/step2.jsp");
        refs.put(STEP_2_ACCEPTED, "jsp/step3.jsp");
        refs.put(STEP_3_ACCEPTED, "jsp/victory.jsp");
        refs.put(STEP_1_NOT_ACCEPTED, "jsp/fail.jsp");
        refs.put(STEP_2_NOT_ACCEPTED, "jsp/fail.jsp");
        refs.put(STEP_3_NOT_ACCEPTED, "jsp/fail.jsp");
    }

    public static String getRef(String ref){
        return refs.get(ref);
    }
}
