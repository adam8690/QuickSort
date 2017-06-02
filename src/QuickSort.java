/**
 * Created by Adam on 02/06/2017.
 */

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {

    public static ArrayList<Integer> generateRandomArrayList(int size, int maxValue){

        System.out.println("Array Size: " + size + " Range of values: 0 - " + maxValue);

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            int random = rand.nextInt(maxValue);
            array.add(random);
        }
        return array;
    }

    public static void swapElements(ArrayList<Integer> array, int firstIndex, int secondIndex){
        int valueFirstIndex = array.get(firstIndex);
        array.set(firstIndex, array.get(secondIndex));
        array.set(secondIndex, valueFirstIndex);
    }

    public static int partition(ArrayList<Integer> array, int start, int end) {
//      this should rearrange the array so that the selected pivot point is returned and the numbers
//      greater than are to the right and the numbers less than or equal to are on the left of it.

        int pivot = array.get(end);
        int indexToCheck = start;
        int pivotIndex = end;

        while (indexToCheck <= pivotIndex ) {
            int startValue = array.get(indexToCheck);
            if (startValue > pivot) {

//                need to move elements right until they are on the right of the pivot. Must be a quicker way of doing this.
                for(int i = indexToCheck; i < pivotIndex; i++){
                    swapElements(array, i, i + 1);
                }
                pivotIndex --;
            }
            else {
                indexToCheck++;
            }
        }
        return pivotIndex;
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> array, int start, int end){

        if(end - start > 1){
            int pivotIndex = partition(array, start, end);
//            quicksort the left hand side
            quickSort(array, start, pivotIndex - 1);
//            quicksort on the right side
            quickSort(array, pivotIndex, end);
        }
        return array;
    }
}
