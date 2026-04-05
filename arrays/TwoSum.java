package arrays;

import java.util.*;

public class TwoSum {

    /*
       iterar sobre o array
       checar se o valor da posição é maior que o targer
       salvar as posições e valores em um hashmap
       checar se existe uma soma que resulte no target
     */
    public static void main(String[] args) {
        int[] nums = {12, 7, 12, 2};
        int target = 9;
        HashMap<Integer, Integer> setNumbers = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){

            int falta = target - nums[i];
            if (setNumbers.containsKey(falta)){
                result[0] = (setNumbers.get(falta));
                result[1] = (i);
                break;
            }
            setNumbers.put(nums[i] ,i);
        }
        System.out.println(Arrays.toString(result));
    }

    }



