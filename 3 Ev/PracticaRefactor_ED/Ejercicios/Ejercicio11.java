package Ejercicios;    

public class Ejercicio11 {
    public static void main(String[] args) {
        try {
            Ejercicio11 ejercicio11 = new Ejercicio11(); // Crear una instancia de Ejercicio11
            ejercicio11.titulo(); // Imprimir el banner
            ejercicio11.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        Pedido pedido = new Pedido();
        pedido.operaciones();
        System.out.println();
        Ref();
        Cliente cliente = new Cliente(); 
        cliente.operaciones();
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 11:\n\nSimplificación del método:\n Refactoriza métodos que tienen un comportamiento similar para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ11");
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
}

// Clases originales y refactorizadas
class Pedido {
    String cliente = "Naiara";

    void operaciones() {
        System.out.println(cliente);
        System.out.println("Todas las operaciones de la clase");
    }
}

// Código refactorizado
class RefactorPedido {
    public void operaciones() {
        System.out.println("Todas las operaciones de la clase.");
    }
}

class Cliente extends RefactorPedido {
    String nombre = "Naiara";

    public Cliente() {
        System.out.println(nombre); 
    }
}
