package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/step2")
public class StepTwoServlet extends UfoChallengeServlet {
    public StepTwoServlet() {
        super(2);
    }
}
