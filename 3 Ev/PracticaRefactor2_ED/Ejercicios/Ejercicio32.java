package Ejercicios;
public class Ejercicio32 {
    public static void main(String[] args) {
        try {
            Ejercicio32 ejercicio32 = new Ejercicio32(); // Crear una instancia de Ejercicio32
            ejercicio32.titulo(); // Imprimir el banner
            ejercicio32.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        Equipo equipo = new Equipo("Los Guerreros", "Carlos Perez");
        Jugador jugador = new Jugador(equipo);

        titulo1();
        System.out.println("Demostración de resultados:");
        System.out.println();
        NoRef();
        System.out.println("El equipo del jugador es: " + jugador.getEquipo().getNombreEquipo());
        System.out.println("El capitán del equipo es: " + jugador.getCapitanDeMiEquipo());
        System.out.println();
        Ref();
        System.out.println("El equipo del jugador es: " + jugador.getEquipo().getNombreEquipo());
        System.out.println("El capitán del equipo es: " + jugador.getCapitanDeMiEquipo());
        System.out.println("");
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 32:\n\nEncapsulamiento de la relación Equipo-Jugador:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ32");
        System.out.println();
    }

    private void titulo1() {
        System.out.println("       " + "---------------------------------------------------------");
        System.out.println("       " + "  Prueba de métodos refactorizados y no refactorizados: ");
        System.out.println("       " + "---------------------------------------------------------");
    }

    static void printError() {
        System.out.println();
        System.out.println("                         " + "-------------------------");
        System.out.println("                         " + "      Salida forzada     ");
        System.out.println("                         " + "-------------------------");
        System.out.println();
    }

    void NoRef() {
        System.out.println();
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "   Método no refactorizado  ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    }

    void Ref() {
        System.out.println();
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "     Método refactorizado   ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    }

    // Define the Equipo (Team) class
    static class Equipo {
        private final String nombreEquipo;
        private final String capitan;

        public Equipo(String nombreEquipo, String capitan) {
            this.nombreEquipo = nombreEquipo;
            this.capitan = capitan;
        }

        public String getCapitan() {
            return capitan;
        }

        public String getNombreEquipo() {
            return nombreEquipo;
        }
    }

    // Define the Jugador (Player) class
    static class Jugador {
        private Equipo miEquipo;

        public Jugador(Equipo equipo) {
            this.miEquipo = equipo;
        }

        public Equipo getEquipo() {
            return miEquipo;
        }

        public void setEquipo(Equipo equipo) {
            this.miEquipo = equipo;
        }

        public String getCapitanDeMiEquipo() {
            return miEquipo.getCapitan();
        }
    }
}
