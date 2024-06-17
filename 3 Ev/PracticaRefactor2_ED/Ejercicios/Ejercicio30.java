package Ejercicios;
public class Ejercicio30 {
    private String tipo; // Variable de instancia tipo String

    public static void main(String[] args) {
        try {
            Ejercicio30 ejercicio30 = new Ejercicio30(); // Crear una instancia de Ejercicio30
            ejercicio30.titulo(); // Imprimir el banner
            ejercicio30.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        setTipo("Ejemplo");

        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        antesRefactorizar();
        System.out.println();
        Ref();
        despuesRefactorizar();
        System.out.println(""); 
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 30:\n\nEncapsulamiento de campos:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ30");
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

    void antesRefactorizar() {
        // Antes de refactorizar
        System.out.println("Antes de refactorizar:");
        System.out.println("Tipo: " + tipo); // Acceso directo al campo tipo
    }

    void despuesRefactorizar() {
        // Después de refactorizar
        System.out.println("Después de refactorizar:");
        System.out.println("Tipo: " + getTipo()); // Con getter accedemos al campo tipo
    }

    // Getter para tipo
    public String getTipo() {
        return this.tipo;
    }

    // Setter para tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    void test() {
        System.out.println("Comparación de resultados:");
        System.out.println();
        antesRefactorizar();
        despuesRefactorizar();
    }
}
