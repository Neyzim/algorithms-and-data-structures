package arrays;

import java.util.Arrays;

public class BiggestSequence {
    /*
    dado um array de int, retornar qual a maior sequência cujos valores somam em um target
     */

    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,3};
        int target = 5;
        int somaAtual = 0;
        int inicio = 0;
        int size = 0;


        for (int i = 0; i < arr.length; i ++){
            somaAtual = somaAtual + arr[i];
            while (somaAtual > target){
                somaAtual = somaAtual - arr[inicio];
                inicio ++;
            }
            if (somaAtual == target){
                size = (i - inicio +1);
            }


        }
    System.out.println(size);
    }
}
