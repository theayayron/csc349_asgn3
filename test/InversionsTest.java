import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InversionsTest {

    @Test
    public void invCounter1() {
        int[] arr = {6, 4, 3, 1};
        Assert.assertEquals(6, Inversions.invCounter(arr));
    }

    @Test
    public void invCounter2() {
        int[] arr = {2, 3, 8, 6, 1};
        Assert.assertEquals(5, Inversions.invCounter(arr));
    }
}