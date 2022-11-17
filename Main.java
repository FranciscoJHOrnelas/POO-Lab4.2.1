public class Main {
    public static void main(String[] args) {
        CelulaEucariota eucariota = new CelulaEucariota();
        eucariota.setNombre("Eucariota");
        eucariota.setSize(10);
        eucariota.setNucleo(true);
        CelulaProcariota procariota = new CelulaProcariota();
        procariota.setNombre("Procariota");
        procariota.setSize(5);
        procariota.setNucleo(false);

        Gato g = new Gato();
        g.setNombre("Garfield");
        g.setEspecie("Felis catus");
        g.setPeso(5);
        g.setLongevidad(15);;
        System.out.println(g.toString() + "\n" + eucariota.toString() + "\n" + procariota.toString()); 
    }
}