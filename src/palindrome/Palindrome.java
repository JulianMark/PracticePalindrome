/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;

/**
 *
 * @author Julian Markowskyj <julian.markowskyj at gmail.com>
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra para saber si es palíndromo: ");
        String word = s.next();
        
        boolean result = isPalindrome(word);   
        String response;
        if (result){
            response = "La palabra "+word+" es palíndromo";
        }else{
            response = "La palabra "+word+" no es palíndromo";
        }
        System.out.println(response);

//        //solucion orientada a java
//        boolean result = javaPalindrome(word);
//        System.out.println((result)
//                ?
//                "La palabra" +word+" es palíndromo"
//                :
//                "La palabra "+word+" no es palíndromo");


//        char [] palabra = {'m','a','r','l','a'};
//        for (int i = 0; i < palabra.length; i++) {
//            System.out.println(palabra[i]);
//        }
        
//        char [] palabra = {'m','a','r','l','a'};
//        for (int i = palabra.length -1; i >= 0; i--) {
//            System.out.println(palabra[i]);
//        }
//     

        
//        Scanner s = new Scanner(System.in);
//        String palabra = s.nextLine();
//        StringBuilder p2 = new StringBuilder();
//        for (int i = palabra.length() -1; i >= 0; i--) {
//            p2.append(palabra.charAt(i));  
//        }
//        if (palabra.equals(p2.toString())){
//            System.out.println("Es palíndromo");
//        }else {
//            System.out.println("No es palíndromo");
//            
//        }  
    }
    
    static boolean isPalindrome (String word){
        int minorIndex = 0;
        int majorIndex = word.length() - 1;
        while (majorIndex > minorIndex){
            char a = word.charAt(minorIndex);
            char b = word.charAt(majorIndex);
            if (a != b){
                return false;
            }
            minorIndex++;
            majorIndex--;
        }
        return true;
    }  
    
    static boolean javaPalindrome(String word){
        String reverse = new StringBuffer(word).reverse().toString();
        return word.equals(reverse);
    }
}
