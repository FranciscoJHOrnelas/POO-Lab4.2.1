public class CelulaEucariota extends Celula {

    private String nombre;
    private int size;
    private boolean nucleo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean getNucleo() {
        return nucleo;
    }

    public void setNucleo(boolean nucleo) {
        this.nucleo = nucleo;
    }

    public String toString() {
        String s = "";
        s += "\nNombre: " + nombre + "\nTamano: " + size + " micrometros\nNucleo: " + nucleo + reproducirse();
        return s;
    }

    public String reproducirse() {
        return "\nReproduciendose por Meiosis";
    }

}