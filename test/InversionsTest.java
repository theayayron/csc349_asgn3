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

    @Test
    public void invCounter3() {
        int[] arr = {0};
        Assert.assertEquals(0, Inversions.invCounter(arr));
    }

    @Test
    public void invCounter4() {
        int[] arr = {1, 0};
        Assert.assertEquals(1, Inversions.invCounter(arr));
    }

    @Test
    public void invCounter5() {
        int[] arr = {4, 3, 2, 1, 0};
        Assert.assertEquals(10, Inversions.invCounter(arr));
    }

    @Test
    public void invCounter6() {
        int[] arr = {8, 2, 3, 4, 5, 1, 6, 9};
        Assert.assertEquals(10, Inversions.invCounter(arr));
    }
}