package arrays;

public class BiggestSubArraySumMinusEqualTarget {
    /*
    Dado um array de inteiros, retorne o MAIOR subarray cuja soma seja MENOR ou IGUAL a target
     */
    public static void main(String[] args){
       int[] arr = {1, 2, 3, 4, 5, 6};
       int target = 11;
       int sum = 0;
       int inicio = 0;
       int result = 0;

       for(int i =0; i < arr.length; i ++){
           sum = sum + arr[i];
           while (sum > target){
               sum = sum - arr[inicio];
               inicio++;
           }
           int size = (i - inicio + 1);
           if (sum <= target){
               result = size;
           }
       }
       System.out.println(result);
    }
}
