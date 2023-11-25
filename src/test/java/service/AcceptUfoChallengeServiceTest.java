package service;

import answers.AppReference;
import answers.UFOAnswer;
import org.junit.jupiter.api.Test;

import static answers.AppContent.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptUfoChallengeServiceTest {
    AcceptUfoChallengeService acceptUfoChallengeService = new AcceptUfoChallengeService();
    @Test
    public void callAcceptedStep0Page(){
        UFOAnswer ufoAnswer = acceptUfoChallengeService.call(true, 0);
        assertEquals(ufoAnswer.getPage(), AppReference.getRef(STEP_0_ACCEPTED));
    }

    @Test
    public void callAcceptedStep1Page(){
        UFOAnswer ufoAnswer = acceptUfoChallengeService.call(true, 1);
        assertEquals(ufoAnswer.getPage(), AppReference.getRef(STEP_1_ACCEPTED));
    }

    @Test
    public void callAcceptedStep2Page(){
        UFOAnswer ufoAnswer = acceptUfoChallengeService.call(true, 2);
        assertEquals(ufoAnswer.getPage(), AppReference.getRef(STEP_2_ACCEPTED));
    }

    @Test
    public void callAcceptedStep3Page(){
        UFOAnswer ufoAnswer = acceptUfoChallengeService.call(true, 3);
        assertEquals(ufoAnswer.getPage(), AppReference.getRef(STEP_3_ACCEPTED));
    }

    @Test
    public void callNotAcceptedStep1Page(){
        UFOAnswer ufoAnswer = acceptUfoChallengeService.call(false, 1);
        assertEquals(ufoAnswer.getPage(), AppReference.getRef(STEP_1_NOT_ACCEPTED));
    }

    @Test
    public void callNotAcceptedStep2Page(){
        UFOAnswer ufoAnswer = acceptUfoChallengeService.call(false, 2);
        assertEquals(ufoAnswer.getPage(), AppReference.getRef(STEP_2_NOT_ACCEPTED));
    }

    @Test
    public void callNotAcceptedStep3Page(){
        UFOAnswer ufoAnswer = acceptUfoChallengeService.call(false, 3);
        assertEquals(ufoAnswer.getPage(), AppReference.getRef(STEP_3_NOT_ACCEPTED));
    }

}
