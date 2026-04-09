package arrays;

public class ExistsSubArraySumEqualsTarget {
    /*
    Dado um array de inteiro, retorne se existe um subarray cuja soma seja igual a target
     */

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 9, 5};
        int target = 7;
        int inicio = 0;
        int soma = 0;
        boolean result = false;

        for (int i = 0; i < arr.length; i++){
            soma = soma + arr[i];
            while(soma > target){
                soma = soma - arr[inicio];
                inicio++;
                System.out.println(soma);
            }

            if(soma == target){
                result = true;
            }
        }
        System.out.println(result);

    }
}
