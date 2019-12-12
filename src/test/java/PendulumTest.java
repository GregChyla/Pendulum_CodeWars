import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

class PendulumTest {

    Pendulum pendulum = new Pendulum();


    @Test
    @DisplayName("Should return pendulum'ed array")
    void pendulum() {

        int[] testArray = new int[]{11, -16, -18, 13, -11, -12, 3, 18};
        org.junit.jupiter.api.Assertions.assertArrayEquals(new int[]{13, 3, -12, -18, -16, -11, 11, 18}, pendulum.pendulum(testArray));
        org.junit.jupiter.api.Assertions.assertArrayEquals(new int[]{3,1,2}, pendulum.pendulum(new int[]{1,2,3}));
    }
}