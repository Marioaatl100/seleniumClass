package classPackage;

public class Perro extends Animal {
	private String especie;
	private Ojos ojos;

	public Perro(int numPatas, String nombre, int edad, String especie, Ojos ojos) {
		this.setNombre(nombre);
		this.setNumPatas(numPatas);
		this.setEdad(edad);
		this.setEspecie(especie);
		this.setOjos(ojos);
	}

	public Perro() {

	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Ojos getOjos() {
		return ojos;
	}

	public void setOjos(Ojos ojos) {
		this.ojos = ojos;
	}

	@Override
	public String toString() {
		return "Perro [nombre = " + this.getNombre() + ", numPatas = " + this.getNumPatas() + ", especie = "
				+ this.getEspecie() + ", " + " ojos = " + ojos.toString() + "]";
	}

	public void ladrar() {
		System.out.println("Guau");
	}

}
