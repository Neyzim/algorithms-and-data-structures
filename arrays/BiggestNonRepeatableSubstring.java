package arrays;

import java.util.HashSet;
import java.util.Set;

public class BiggestNonRepeatableSubstring {
    /*
    Dado uma String, retorne a maior substring cuja não tenha letras repetidas
     */

    public static void main(String[] args){
       String palavra = "adbertyu";
       int inicio = 0;
       Set<Character> set = new HashSet<>();
       int result = 0;

       for(int i =0; i < palavra.length(); i ++){
           while(set.contains(palavra.charAt(i))){
               set.remove(palavra.charAt(inicio));
               inicio++;
           }
           set.add(palavra.charAt(i));
           int size = (i - inicio + 1);
           if (result < size){
               result = size;
           }
       }
       System.out.println(result);
    }
}
