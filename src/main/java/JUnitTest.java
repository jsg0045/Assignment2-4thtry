// Joshua Gatlin
// 8/26/19
// jUnit testing for the finder class

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {


    //test findMax with a valid list
    @Test
    public void test_findMax() {
        Finder find = new Finder();
        int[] numArray = new int[]{ 7, 9, 13, 1, 5 };
        int expectedResult = 13;
        int actualResult = find.findMax(numArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    // Test findMax with a null list.
    @Test
    public void test_findMax2() {
        Finder find = new Finder();
        int[] numArray = null;
        int expectedResult = 0;
        int actualResult = find.findMax(numArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    // Test findMin with a valid array.
    @Test
    public void test_findMin() {
        Finder find = new Finder();
        int[] numArray = new int[]{7, 9, 13, 1, 5};
        int expectedResult = 1;
        int actualResult = find.findMin(numArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    // Test findMin with a null array
    @Test
    public void test_findMin2() {
        Finder find = new Finder();
        int[] numArray = null;
        int expectedResult = 0;
        int actualResult = find.findMin(numArray);
        // test
        assertEquals(actualResult,expectedResult);
    }
}
