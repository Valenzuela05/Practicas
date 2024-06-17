public class App {
    public static void main(String[] args) throws Exception {
    
        Atletismo atletismo = new Atletismo( "Atletismo", "Varonil", "Juvenil", "Estadio Olimpico",
         "Final", "12/12/2021", "10:00", "Juan", "Pedro", 
         "Luis", "100 metros planos", "10.00", "10.10", "10.20", "9.90", "9.80", "3", "Oficial Mayor", new String[]{"Juez juan", "Juez pedro"}, new String[]{"Juez 1", "Juez 2", "Juez 3"}, new String[]{"Inspector 1", "Inspector 2"} );	
       
         Natacion n1 = new Natacion("Natacion", "Varonil", "Juvenil", "Alberca Olimpica", "Final", "12/12/2021", "10:00", "Juan", "Pedro", "Luis", "100 metros libres", "50.00", "50.10", "50.20", "49.90", "49.80", "3", "Juez Arbitro", 
        "Juez Arbitro Salida", new String[]{"Juez 1", "Juez 2", "Juez 3"}, new String[]{"Juez 1", "Juez 2"}, new String[]{"Cronometrador 1", "Cronometrador 2"});

        Gymnacia g1 = new Gymnacia( "Gymnacia", "Varonil", "Juvenil", "Gimnasio Olimpico", "Final", "12/12/2021", "10:00", "Juan", "Pedro", "Luis", "Salto de caballo", "9.00", "9.10", "9.20", "8.90", "8.80", "3"); 


        System.out.println(atletismo.juecesSalida[0]);
        System.out.println("La pueba es: " + atletismo.getPrueba());
        System.out.println("El ganador de la prueba es " + atletismo.getGanador());
        System.out.println("El tiempo del ganador de la prueba es " + atletismo.getTiempoGanador());
        System.out.println("El segundo lugar de la prueba es " + atletismo.getSegundoLugar());
        System.out.println("El tiempo del segundo lugar de la prueba es " + atletismo.getTiempo2doLugar());
        System.out.println("El ganador del tercer lugar de la prueba es " + atletismo.getTercerLugar());
        System.out.println("El tiempo del tercer lugar de la prueba es " + atletismo.getTiempo3erLugar());
        System.out.println("El nuevo record panamericano es de:" + atletismo.getTiempoGanador());
    }
}