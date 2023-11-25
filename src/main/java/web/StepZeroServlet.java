package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/step0")
public class StepZeroServlet extends UfoChallengeServlet {
    public StepZeroServlet() {
        super(0);
    }
}
