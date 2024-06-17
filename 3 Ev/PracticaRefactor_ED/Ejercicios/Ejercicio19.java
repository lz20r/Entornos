package Ejercicios;
public class Ejercicio19 {
    public static void main(String[] args) {
        try {
            Ejercicio19 ejercicio19 = new Ejercicio19(); // Crear una instancia de Ejercicio19
            ejercicio19.titulo(); // Imprimir el banner
            ejercicio19.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        printCuenta("Rafael Angulo", 130.50);
        System.out.println();
        Ref();
        printCuentaRefactor("Rafael Angulo", 130.50);
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 19:\n\nEncapsulación de comportamiento:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ19");
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

    // Métodos de funcionalidad principal
    void printCuenta(String nombre, double cantidad) {
        printLogo();
        System.out.println("nombre: " + nombre);
        System.out.println("cantidad: " + cantidad);
    }

    void printLogo() {
        System.out.println("Imprimiendo logo");
    }

    // Código Refactorizado
    void printCuentaRefactor(String nombre, double cantidad) {
        printLogo();
        printDetalles(nombre, cantidad);
    }

    private void printDetalles(String nombre, double cantidad) {
        System.out.println("nombre: " + nombre);
        System.out.println("cantidad: " + cantidad);
    }
}
