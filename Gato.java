public class Gato extends Animal {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		String s = "";
		s += "\nNombre: " + nombre + super.toString();
		return s;
	}
}