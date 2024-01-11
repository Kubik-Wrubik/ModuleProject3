package service;

import answers.NegativeUFOAnswer;
import answers.PositiveUFOAnswer;
import answers.UFOAnswer;

import static answers.AppConstants.*;
import static answers.AppReference.getRef;

public class AcceptUfoChallengeService {

    public UFOAnswer call(boolean isAccepted, int step) {
        UFOAnswer answer;
        if (isAccepted) {
            switch (step) {
                case 0:
                    answer = new PositiveUFOAnswer(START_CHELLENGE_ACCEPTED, getRef(START_CHELLENGE_ACCEPTED));
                    break;
                case 1:
                    answer = new PositiveUFOAnswer(UFO_CHALLENGE_ACCEPTED, getRef(UFO_CHALLENGE_ACCEPTED));
                    break;
                case 2:
                    answer = new PositiveUFOAnswer(GOING_TO_NEGOTIATIONS_ACCEPTED, getRef(GOING_TO_NEGOTIATIONS_ACCEPTED));
                    break;
                case 3:
                    answer = new PositiveUFOAnswer(SPEAKING_WITH_ALIENS_ACCEPTED, getRef(SPEAKING_WITH_ALIENS_ACCEPTED));
                    break;
                default:
                    answer = new NegativeUFOAnswer(UFO_CHALLENGE_NOT_ACCEPTED, getRef(UFO_CHALLENGE_NOT_ACCEPTED));
            }
        } else {
            switch (step) {
                case 2:
                    answer = new NegativeUFOAnswer(GOING_TO_NEGOTIATIONS_NOT_ACCEPTED, getRef(GOING_TO_NEGOTIATIONS_NOT_ACCEPTED));
                    break;
                case 3:
                    answer = new NegativeUFOAnswer(SPEAKING_WITH_ALIENS_NOT_ACCEPTED, getRef(SPEAKING_WITH_ALIENS_NOT_ACCEPTED));
                    break;
                default:
                    answer = new NegativeUFOAnswer(UFO_CHALLENGE_NOT_ACCEPTED, getRef(UFO_CHALLENGE_NOT_ACCEPTED));
            }
        }
        return answer;
    }
}
