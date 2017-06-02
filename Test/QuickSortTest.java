import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam on 02/06/2017.
 */
public class QuickSortTest {
    ArrayList<Integer> array;
    ArrayList<Integer> expectedArray;
    QuickSort qs;

    @Before
    public void before(){

        qs = new QuickSort();
        array = new ArrayList<Integer>();
        array.add(8);
        array.add(4);
        array.add(1);
        array.add(6);
        array.add(2);
        expectedArray = new ArrayList<Integer>();
        expectedArray.add(1);
        expectedArray.add(2);
        expectedArray.add(4);
        expectedArray.add(6);
        expectedArray.add(8);
    }

    @Test
    public void canGenerateArrayOfCorrectLength(){
        ArrayList<Integer> randArray = qs.generateRandomArrayList(5, 10);
        assertEquals(5, randArray.size());
        System.out.println(randArray);
    }

    @Test
    public void swapTest(){
        Integer indexZero = 4;
        Integer indexOne = 8;
        qs.swapElements(array, 0, 1);
        assertEquals(indexZero, array.get(0));
        assertEquals(indexOne, array.get(1));
    }

    @Test
    public void partitionTest(){
        assertEquals(1, qs.partition(array, 0, array.size() -1));
    }

    @Test
    public void canSortPredeterminedArray(){
        assertEquals(expectedArray, qs.quickSort(array, 0, array.size() - 1));
    }
}
