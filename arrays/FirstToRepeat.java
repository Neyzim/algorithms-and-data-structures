package arrays;

import java.util.HashSet;

public class FirstToRepeat {
    /*
        Dado um array de inteiros, retorne o PRIMEIRO numero que se repete
        1 = iterar sobre o array
        2 = salvar o numero
        3 = comparar com o restante do array se ele se repete
        4 = retornar numero que se repete
     */

    public static void main(String[] args) {
        int[] numberList = {9, 1, 4, 1, 5, 3, 5};
        int numberResult = 0;
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < numberList.length; i++){
          if (numberSet.contains(numberList[i])){
              numberResult = (numberList[i]);
                break;
          }
          numberSet.add((numberList[i]));
        }
        System.out.println("Result: " + numberResult);

    }
}