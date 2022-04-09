package Clase.clase;

import classPackage.Ojos;
import classPackage.Perro;

public class ejemploPOO {
	public static void main(String[] args) {
		// All of your code goes here
		int a = 0;
		Ojos ojo = new Ojos("Grandes", "Cafes");
		Perro perro = new Perro(4, "Rex", 8, "Pastor Aleman", ojo);
		Perro perro2 = new Perro();
		System.out.println(perro.toString());
		perro.setEspecie("");
		System.out.println(perro.toString());
		perro.ladrar();
		System.out.println("Hola");
		System.out.println(3);

	}
}
