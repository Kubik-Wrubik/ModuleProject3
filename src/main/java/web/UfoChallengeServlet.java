package web;

import answers.UFOAnswer;
import service.AcceptUfoChallengeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public abstract class UfoChallengeServlet extends HttpServlet {
    private final int STEP;
    private final AcceptUfoChallengeService acceptUfoChallengeService = new AcceptUfoChallengeService();

    protected UfoChallengeServlet(int step) {
        STEP = step;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UFOAnswer answer = acceptUfoChallengeService.call(Boolean.parseBoolean(req.getParameter("choice")), STEP);
        resp.setStatus(200);

        HttpSession session = req.getSession();
        session.setAttribute("answer", answer);
        req.getRequestDispatcher(answer.getPage()).forward(req, resp);
    }
}
