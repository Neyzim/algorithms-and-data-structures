package arrays;

public class SmallestSubArraySumGreaterEqualTarget {
    /*
        Dado um array de inteiros, retorne o MENOR subarray cuja soma seja MAIOR ou IGUAL a target

     */

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 28;
        int inicio = 0;
        int soma = 0;
        int result = 0;


        for (int i =0; i < arr.length; i++){
            soma = soma + arr[i];
            while(soma >= target){

                result = (i - inicio + 1);
                soma = soma - arr[inicio];
                inicio++;
            }

        }

    System.out.println(result);
    }
}
