/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrrays;

import java.util.Scanner;

/**
 *
 * @author 9149m
 */

public class Arrrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for (int i=0; i<myLetters.length; i++) {
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
        for (int i=myLetters.length-1; i>=0; i--) {
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
    }
    
}
