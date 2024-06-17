package Ejercicios;
public class Ejercicio6 {
    static double cargo = 0;
    static double charge = 0;
    static int cantidad = 7;
    static int _tasaVerano = 5;
    static int _tasaInvierno = 2;
    static int _cargoServicioInvierno = 12;

    public static final String EMPIEZA_VERANO = "2024-06-01";
    public static final String FIN_VERANO = "2024-08-31";

    static String fecha = "2025-07-22";

    public static void main(String[] args) {
        try {
            Ejercicio6 Ejercicio6 = new Ejercicio6(); // Crear una instancia de Ejercicio6
            Ejercicio6.titulo(); // Imprimir el banner
            Ejercicio6.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        DescomponerUnCondicional();
        System.out.println("Cargo calculado: " + cargo);
        System.out.println();
        Ref();
        DescomponerUnCondicionalRefactor();
        System.out.println("Cargo calculado: " + cargo);
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 6:\n\nDescomposición de condicional:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ6");
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

    // Método antes de refactorizar
    void DescomponerUnCondicional() {
        if (fecha.compareTo(EMPIEZA_VERANO) < 0 || fecha.compareTo(FIN_VERANO) > 0) {
            cargo = cantidad * _tasaInvierno + _cargoServicioInvierno;
        } else {
            cargo = cantidad * _tasaVerano;
        }
    }

    // Método después de refactorizar
    void DescomponerUnCondicionalRefactor() {
        if (noEsVerano(fecha)) {
            cargo = cargoInvierno(cantidad);
        } else {
            charge = cargoVerano(cantidad);
        }
    }

    boolean noEsVerano(String fecha) {
        return fecha.compareTo(EMPIEZA_VERANO) < 0 || fecha.compareTo(FIN_VERANO) > 0;
    }

    double cargoInvierno(int cantidad) {
        return cantidad * _tasaInvierno + _cargoServicioInvierno;
    }

    double cargoVerano(int cantidad) {
        return cantidad * _tasaVerano;
    }
}
