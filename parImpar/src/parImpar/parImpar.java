package parImpar;

import java.util.Scanner;

public class parImpar {
	public static void main(String[] args){
		int num = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Ingrese un numero entero:");
		num = s.nextInt();
		if(num%2== 0)
			System.out.println("El numero que ingreso es par");
		else
			System.out.println("El numero que ingreso es impar");	
	}

}
