package Ömer.Mentoring3_Array_2DArray.kahoot;

import java.util.Arrays;

public class deneme5 {
    public static void main(String[] args) {


        int[] array = {5, 3, 8, 1, 22, 88, 2, 12};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 2));
    }
}
