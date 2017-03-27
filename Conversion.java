
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
public class Conversion {
    
    public static void main(String args[])
	{

		

		int n = 0;
		int nb1 = 0;
		int nb0 = 0;
		int reste = 0;
		String rep = "\0";
		rep = " ";
                int premier_nombre;

		System.out.print("Entrez un nombre positif  : ");
                Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		premier_nombre=n;

		while(n > 1)
		{
			reste = n % 2;
			n = n / 2;

			if (reste == 1)
			{
				nb1++;
				rep = rep + '1';
			}
			else
			{
				nb0++;
				rep = rep + '0';
			}
		}

		if (n == 1)
		{
			nb1++;
			rep = rep + '1';
		}

		if (n == 0)
		{
			nb0++;
			rep = rep + '0';
		}


		int longueur = rep.length();
		int j;
		char inv = ' ';
		System.out.print("Valeur binaire de " + premier_nombre + " : ");
		for(j=(longueur-1) ; j>=0 ; j--)
		{
			inv = rep.charAt(j);
			System.out.print(inv);
		}

        }
}
