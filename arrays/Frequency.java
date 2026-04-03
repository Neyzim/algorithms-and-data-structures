package arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    /*
    Dado um array, retorne o número que mais aparece
     */
    public static void main(String[] args) {
        int[] numberList = {1, 2, 2, 6, 6, 6, 4};
        Map<Integer, Integer> numberMap = new HashMap<>();
        int mostShownNumber = 0;
        int biggestNumber = 0;

        for (int number : numberList) {
            if (numberMap.containsKey(number)) {
                int currentCount = numberMap.get(number);
                numberMap.put(number, currentCount + 1);
            }else{
                int initialCount = 1;
                numberMap.put(number, initialCount);
            }
        }
        for(Map.Entry<Integer, Integer> entry : numberMap.entrySet()){
            if (entry.getValue() > biggestNumber){
                biggestNumber = entry.getValue();
                mostShownNumber = entry.getKey();
            }


        }
        System.out.print("Numero mais frequente: " + mostShownNumber);
    }
}