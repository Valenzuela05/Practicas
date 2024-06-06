public class App {
    public static void main(String[] args) {
        Terrestre terrestre = new Terrestre();
        Maritimo maritimo = new Maritimo();
        Aereo aereo = new Aereo();
        Espacial espacial = new Espacial();

        terrestre.conduccion();
        terrestre.cargarCombustible();
        
        maritimo.conduccion();
        maritimo.cargarCombustible();
        
        aereo.conduccion();
        aereo.cargarCombustible(); 
        
        espacial.conduccion();
        espacial.cargarCombustible();

    }

    }

