package classPackage;

public class Ojos {
	private String color;
	private String tamaño;

	public Ojos(String tamaño, String color) {
		// TODO Auto-generated constructor stub
		this.setTamaño(tamaño);
		this.setColor(color);
	}

	public Ojos(Ojos ojo) {
		this.setTamaño(ojo.getTamaño());
		this.setColor(ojo.getColor());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "color = " + color + ", tamaño = " + tamaño + " ";
	}

}
