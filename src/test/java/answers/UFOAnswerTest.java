package answers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UFOAnswerTest {
    @Test
    public void getMsgTest(){
        String msg = "ok";
        UFOAnswer ufoAnswer = new UFOAnswer(msg, "https://ex.com");
        assertEquals(ufoAnswer.getMessage(), msg);
    }

    @Test
    public void getPageTest(){
        String page = "https://ex.com";
        UFOAnswer ufoAnswer = new UFOAnswer("ok", page);
        assertEquals(ufoAnswer.getPage(), page);
    }
}
