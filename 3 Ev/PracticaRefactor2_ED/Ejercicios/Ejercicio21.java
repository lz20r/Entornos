package Ejercicios;

public class Ejercicio21 {
    public static void main(String[] args) {
        try {
            Ejercicio21 ejercicio21 = new Ejercicio21(); // Crear una instancia de Ejercicio21
            ejercicio21.titulo(); // Imprimir el banner
            ejercicio21.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        Pedido pedido = new Pedido();
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println("");
        NoRef(); 
        System.out.println(precio(pedido));
        System.out.println();
        Ref();
        System.out.println(refactorPrecio(pedido));
        System.out.println();  
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 21:\n\nUso de refactorización para mejorar la claridad y mantenimiento del código.\n");
        System.out.println("RESOLUCIÓN DEL EJ21");
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

    // Método no refactorizado
    boolean precio(Pedido pedido) {
        double precioBase = pedido.precioBase();
        return (precioBase > 100);
    }

    // Método refactorizado
    boolean refactorPrecio(Pedido pedido) {
        return (pedido.precioBase() > 100);
    }

    // Método de prueba
    void test(Pedido pedido) {
        System.out.println("Comparación de resultados: ");
        System.out.println();
        NoRef();
        System.out.println(precio(pedido));
        Ref();
        System.out.println(refactorPrecio(pedido));
    }

    // Definición de la clase Pedido
    class Pedido {
        private int precioBase = 101;

        int precioBase() {
            return precioBase;
        }
    }
}
