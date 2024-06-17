package Ejercicios;
public class Ejercicio38 {
    // Instancia única de la clase Singleton
    private static Ejercicio38 instancia = null;

    // Constructor privado para evitar la instanciación directa
    private Ejercicio38() {
        // Este método existe solamente para evitar la instanciación directa.
    }

    // Método estático para obtener la instancia de la clase
    public static Ejercicio38 getInstance() {
        // Si la instancia es nula, creamos una nueva instancia
        if (instancia == null) {
            instancia = new Ejercicio38();
        }
        // Devolvemos la instancia única
        return instancia;
    }

    public static void main(String[] args) {
        try {
            Ejercicio38 ejercicio38 = new Ejercicio38(); // Crear una instancia de Ejercicio38
            ejercicio38.titulo(); // Imprimir el banner
            ejercicio38.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        antesRefactorizar();
        System.out.println();
        Ref();
        despuesRefactorizar();
        System.out.println();
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 38:\n\nUso de Singleton:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ38");
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

    public static void antesRefactorizar() {
        System.out.println("Método antes de refactorizar de la clase Singleton");
    }

    public static void despuesRefactorizar() {
        System.out.println("Método después de refactorizar de la clase Singleton");
    }
}
