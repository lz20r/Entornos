package Ejercicios;
public class Ejercicio34 {
    public static void main(String[] args) {
        try {
            Ejercicio34 ejercicio34 = new Ejercicio34(); // Crear una instancia de Ejercicio34
            ejercicio34.titulo(); // Imprimir el banner
            ejercicio34.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        Telefono telefono = new Telefono("+123456789");
        Jugador jugador = new Jugador(telefono);

        titulo1();
        System.out.println("Demostración de resultados:");
        System.out.println();
        NoRef();
        System.out.println("El teléfono del jugador es: " + jugador.getTelefono().getTelefono());
        System.out.println("El prefijo del teléfono es: " + jugador.getTelefono().getPrefijo());
        System.out.println();
        Ref();
        System.out.println("El teléfono del jugador es: " + jugador.getTelefono().getTelefono());
        System.out.println("El prefijo del teléfono es: " + jugador.getTelefono().getPrefijo());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 34:\n\nEncapsulamiento y separación de responsabilidades:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ34");
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

    // Define the Telefono (Phone) class
    static class Telefono {
        private String telefono;

        public Telefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getPrefijo() {
            return telefono.substring(0, 3);  // Example: Assuming prefix is the first 3 characters
        }
    }

    // Define the Jugador (Player) class
    static class Jugador {
        private Telefono telefono;

        public Jugador(Telefono telefono) {
            this.telefono = telefono;
        }

        public Telefono getTelefono() {
            return telefono;
        }

        public void setTelefono(Telefono telefono) {
            this.telefono = telefono;
        }
    }
}
