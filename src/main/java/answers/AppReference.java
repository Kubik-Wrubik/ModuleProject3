package answers;

import java.util.HashMap;
import java.util.Map;

import static answers.AppConstants.*;

public class AppReference {
    private final static Map<String, String> refs = new HashMap<>();

    static {
        refs.put(START_CHELLENGE_ACCEPTED, ACCEPTING_UFO_CHALLENGE_PAGE);
        refs.put(UFO_CHALLENGE_ACCEPTED, GOING_TO_NEGOTIATIONS_PAGE);
        refs.put(GOING_TO_NEGOTIATIONS_ACCEPTED, SPEAKING_WITH_ALIENS_PAGE);
        refs.put(SPEAKING_WITH_ALIENS_ACCEPTED, VICTORY_PAGE);
        refs.put(UFO_CHALLENGE_NOT_ACCEPTED, FAIL_PAGE);
        refs.put(GOING_TO_NEGOTIATIONS_NOT_ACCEPTED, FAIL_PAGE);
        refs.put(SPEAKING_WITH_ALIENS_NOT_ACCEPTED, FAIL_PAGE);
    }

    public static String getRef(String ref){
        return refs.get(ref);
    }
}
