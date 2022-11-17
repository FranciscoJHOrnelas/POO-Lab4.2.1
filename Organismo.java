public class Organismo {

	private int longevidad;

	public int getLongevidad() {
		return longevidad;
	}

	public void setLongevidad(int longevidad) {
		this.longevidad = longevidad;
	}

	public String toString() {
		String s = "";
		s += "\nLongevidad: " + longevidad;
		return s;
	}

}