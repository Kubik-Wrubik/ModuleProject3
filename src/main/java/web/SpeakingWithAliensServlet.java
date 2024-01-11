package web;

import javax.servlet.annotation.WebServlet;

@WebServlet("/speakingWithAliens")
public class SpeakingWithAliensServlet extends UfoChallengeServlet {
    public SpeakingWithAliensServlet() {
        super(3);
    }
}

