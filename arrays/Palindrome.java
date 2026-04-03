package arrays;

public class Palindrome {
    /*
    Descobrir se uma palavra é um palindromo
     - percorrer a String
     - salvar a primeira letra da palavra
        - primeira letra esta na posição i
     - salvar a segunda letra da palavra
     - comparar para ver se são iguais
     - loop repete para metade do tamanho das palavras
     */

    public static void main(String[] args){
        String isPalindrome = "arara";
        boolean result = true;


        for (int i = 0; i < isPalindrome.length() / 2; i ++) {
            char firstLetter = isPalindrome.charAt(i);
            char lastLetter = isPalindrome.charAt(isPalindrome.length() -  i - 1);
            if (firstLetter != lastLetter) {
                result = false;
                break;
            }




        }
        System.out.println("A palavra é um palíndromo? " + result);


    }
}
