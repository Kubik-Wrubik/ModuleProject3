package service;

import answers.UFOAnswer;

import static answers.AppContent.*;
import static answers.AppReference.getRef;

public class AcceptUfoChallengeService {

    public UFOAnswer call(boolean isAccepted, int step) {
        UFOAnswer answer;
        if (isAccepted) {
            switch (step) {
                case 0:
                    answer = new UFOAnswer(STEP_0_ACCEPTED, getRef(STEP_0_ACCEPTED));
                    break;
                case 1:
                    answer = new UFOAnswer(STEP_1_ACCEPTED, getRef(STEP_1_ACCEPTED));
                    break;
                case 2:
                    answer = new UFOAnswer(STEP_2_ACCEPTED, getRef(STEP_2_ACCEPTED));
                    break;
                case 3:
                    answer = new UFOAnswer(STEP_3_ACCEPTED, getRef(STEP_3_ACCEPTED));
                    break;
                default:
                    answer = new UFOAnswer(STEP_1_NOT_ACCEPTED, getRef(STEP_1_NOT_ACCEPTED));
            }
        } else {
            switch (step) {
                case 2:
                    answer = new UFOAnswer(STEP_2_NOT_ACCEPTED, getRef(STEP_2_NOT_ACCEPTED));
                    break;
                case 3:
                    answer = new UFOAnswer(STEP_3_NOT_ACCEPTED, getRef(STEP_3_NOT_ACCEPTED));
                    break;
                default:
                    answer = new UFOAnswer(STEP_1_NOT_ACCEPTED, getRef(STEP_1_NOT_ACCEPTED));
            }
        }
        return answer;
    }
}
