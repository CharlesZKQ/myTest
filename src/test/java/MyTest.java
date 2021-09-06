import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * created by Charles Zhang
 *
 * @date 2021/9/6
 */
public class MyTest {
    static int x;

    @Test
    public void t1() {
        assertEquals(0, x);
    }

    @Test
    public void t2() {
        x = 1;
    }
}
