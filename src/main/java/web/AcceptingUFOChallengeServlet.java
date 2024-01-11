package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/acceptingUFOChallenge")
public class AcceptingUFOChallengeServlet extends UfoChallengeServlet {
    public AcceptingUFOChallengeServlet() {
        super(1);
    }
}
