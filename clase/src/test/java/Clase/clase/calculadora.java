package Clase.clase;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// All of your code goes here
		Scanner reader = new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		int num1 = reader.nextInt();
		System.out.println("Escribe el segundo");
		int num2 = reader.nextInt();
		System.out.println(num1 + num2);

	}
}
