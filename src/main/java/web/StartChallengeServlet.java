package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/startChallenge")
public class StartChallengeServlet extends UfoChallengeServlet {
    public StartChallengeServlet() {
        super(0);
    }
}
