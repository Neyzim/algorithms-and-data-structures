package arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    /*
    Check if 2 string are anagrams
    - separa a primeira palavra e coloca em um map
    - checa se a letra da segunda palavra contem no map e se contem, adiciona como value

     */
    public static void main(String[] args) {

        String wordOne = "alma";
        String wordTwo = "mala";
        HashMap<Character, Integer> resultMap = new HashMap<>();

        boolean result = true;

        if (wordOne.length() != wordTwo.length()) {
            result =  false;
            System.out.println(result);
        }

        for (char x : wordOne.toCharArray()) {
            int count = 0;
            count = resultMap.getOrDefault(x, 0) + 1;
            resultMap.put(x, count);
        }

        for (char y : wordTwo.toCharArray()) {
            int count = 0;
            if (!resultMap.containsKey(y) || resultMap.get(y) < 0) {
                result =  false;
            }
            count = resultMap.get(y) - 1;
            resultMap.put(y, count);

        }

        System.out.println(result);
    }
}