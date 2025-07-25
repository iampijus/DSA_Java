package arrays;

import java.util.Arrays;

public class LearArraysClass {
    public static void main(String[] args) {
//        Integer[] arr={1,2,3,4,5,9,10};
//
//        System.out.println(Arrays.binarySearch(arr,5));

        Integer[] arr={12,25,3,6,4,9,22,54,10};
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
