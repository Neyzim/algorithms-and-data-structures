package arrays;

import java.util.HashSet;

public class RepeatedNumber {
    /*
    Check if contains duplicate in a array
     */

    public static void main(String[] args){

        int[] arr= {1,9,4,4,8};
        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i < arr.length; i ++) {
            if (set.contains(arr[i])) {
                System.out.println("true");
            }
            set.add(arr[i]);
        }


    }
}
