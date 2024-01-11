package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/goingToNegotiations")
public class GoingToNegotiationsServlet extends UfoChallengeServlet {
    public GoingToNegotiationsServlet() {
        super(2);
    }
}
