package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/step3")
public class StepThreeServlet extends UfoChallengeServlet {
    public StepThreeServlet() {
        super(3);
    }
}
