package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/step1")
public class StepOneServlet extends UfoChallengeServlet {
    public StepOneServlet() {
        super(1);
    }
}
