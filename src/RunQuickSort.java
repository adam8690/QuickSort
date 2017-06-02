import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.ArrayList;

/**
 * Created by Adam on 02/06/2017.
 */
public class RunQuickSort {

    public static void main(String[] args) {

        ArrayList<Integer> arrayToSort = QuickSort.generateRandomArrayList(10000, 10000);
        System.out.println("Array to sort" + arrayToSort);

        ArrayList<Integer> sortedArray = QuickSort.quickSort(arrayToSort, 0, arrayToSort.size() - 1);
        System.out.println("Sorted Array" + sortedArray);

    }

}
