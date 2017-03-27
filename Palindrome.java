
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class Palindrome {
    
      public static void main( String[] args ) 
{ String T="";
int i=0;
int j=T.length() - 1;
//affichage de la suite de caractères saisie
System.out.println(T);
Scanner sc=new Scanner(System.in);
T= sc.nextLine();
//test palindrome
while ( (i<j) && (T.charAt(i)==T.charAt(j))) {
i=i+1; j=j-1; 
}
if (T.charAt(i)!=T.charAt(j))
System.out.println(" n'est pas un palindrome");
else 
System.out.println(" est un palindrome");
}
}
