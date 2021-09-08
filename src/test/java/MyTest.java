import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
