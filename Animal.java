public class Animal extends Organismo {

	private String especie;
	private float peso;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String toString() {
		String s = "";
		s += "\nEspecie: " + especie + "\nPeso: " + peso + super.toString();
		return s;
	}

}