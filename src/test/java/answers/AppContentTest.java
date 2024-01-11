package answers;

import org.junit.jupiter.api.Test;

import static answers.AppContent.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppContentTest {
    @Test
    public void checkAcceptedStep0(){
        assertEquals(STEP_0_ACCEPTED, "Ви втрачаєте пам'ять");
    }

    @Test
    public void checkAcceptedStep1(){
        assertEquals(STEP_1_ACCEPTED, "Ви прийняли виклик");
    }

    @Test
    public void checkNotAcceptedStep1(){
        assertEquals(STEP_1_NOT_ACCEPTED, "Ви відхили виклик");
    }

    @Test
    public void checkAcceptedStep2(){
        assertEquals(STEP_2_ACCEPTED, "Ви піднялись на місток");
    }

    @Test
    public void checkNotAcceptedStep2(){
        assertEquals(STEP_2_NOT_ACCEPTED, "Ви не пішли на переговори");
    }

    @Test
    public void checkAcceptedStep3(){
        assertEquals(STEP_3_ACCEPTED, "Вас повернули додому");
    }

    @Test
    public void checkNotAcceptedStep3(){
        assertEquals(STEP_3_NOT_ACCEPTED, "Ваша брехня була розкрита");
    }
}
