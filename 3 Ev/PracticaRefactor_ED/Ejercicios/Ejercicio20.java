package Ejercicios;
public class Ejercicio20 {
    private int numeroDeCanas;

    public Ejercicio20(int numeroDeCanas) {
        this.numeroDeCanas = numeroDeCanas;
    }

    public static void main(String[] args) {
        try {
            Ejercicio20 Ejercicio20 = new Ejercicio20(7); // Crear una instancia de Ejercicio20
            Ejercicio20.titulo(); // Imprimir el banner
            Ejercicio20.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        System.out.println("Número de rondas gratis (antes de refactorizar): " + SuprimirMetodo());
        System.out.println();
        Ref();
        System.out.println("Número de rondas gratis (después de refactorizar): " + SuprimirMetodoRefactor());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 20:\n\nSuprimir método:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ20");
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
    int SuprimirMetodo() {
        return (masDe5Canas()) ? 22 : 1;
    }

    boolean masDe5Canas() {
        return numeroDeCanas > 5;
    }

    // Método después de refactorizar
    int SuprimirMetodoRefactor() {
        return (numeroDeCanas > 5) ? 22 : 1;
    }
}
