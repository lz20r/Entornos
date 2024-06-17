package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    // Variables para almacenar el nombre y la cantidad de cargo pendiente
    String _nombre = "";
    int cargoPendiente = 0;

    // Método para obtener el valor de cargoPendiente
    int getCargoPendiente() {
        return cargoPendiente;
    }

    public static void main(String[] args) {
        Ejercicio1 Ejercicio1 = new Ejercicio1(); // Crear una instancia de Ejercicio1
        Scanner scanner = new Scanner(System.in); // Crear un Scanner para leer la entrada del usuario
        try {
            Ejercicio1.titulo(); // Imprimir el banner
            // Leer datos del usuario una sola vez
            Ejercicio1.leerDatos(scanner);
            System.out.println();
            // Ejecutar el método de prueba para comparar resultados
            System.out.println("       " + "---------------------------------------------------------");
            System.out.println("       " + "  Prueba de métodos refactorizados y no refactorizados: ");
            System.out.println("       " + "---------------------------------------------------------");
            Ejercicio1.test();
        } catch (Exception e) {
            System.out.println();
            System.out.println("                         " + "-------------------------");
            System.out.println("                         " + "      Salida forzada  ");
            System.out.println("                         " + "-------------------------");
            System.out.println();
        } finally {
            scanner.close(); // Cerrar el Scanner al final del uso
        }
    }

    // Método para imprimir el título
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 1:\n\nExtraer método:\n Tienes un fragmento de código que puede agruparse.\n RE --> Convierte el fragmento en un metodo cuyo nombre explique el propósito del método. \n");
        System.out.println("RESOLUCIÓN DEL EJ1"); 
    }

    // Método estático para imprimir el banner
    static void imprimirBanner(String nombre) {
        System.out.println("          " + " Hola " + nombre + ", bienvenid@ al sistema.");
        System.out.println("          " + " Tu información es la siguiente:");
    }

    // Método no refactorizado para imprimir todo
    void imprimirTodo() {
        imprimirBanner(_nombre); // Imprimir el banner

        System.out.println("            " + "- Nombre: " + _nombre); // Imprimir el nombre
        System.out.println("            " + "- Cantidad de cargo pendiente: " + cargoPendiente); // Imprimir la cantidad de cargo pendiente
    }

    // Método refactorizado para imprimir todo
    void refactorImprimirTodo() {
        imprimirBanner(_nombre); // Imprimir el banner
        imprimirDetalles(); // Imprimir los detalles del nombre y cargo pendiente
    }

    // Método para leer los datos del usuario
    void leerDatos(Scanner scanner) {
        System.out.println("                         " + "-----------------------");
        System.out.println("                         " + "    Entrada de datos");
        System.out.println("                         " + "-----------------------");
        System.out.print("Ingrese su nombre: ");
        _nombre = scanner.nextLine(); // Leer el nombre del usuario
        System.out.print("Ingrese la cantidad de cargo pendiente: ");
        if (scanner.hasNextInt()) {
            cargoPendiente = scanner.nextInt(); // Leer la cantidad de cargo pendiente
            scanner.nextLine(); // Consumir el salto de línea después de nextInt
        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("Por favor, ingrese un número entero válido.");
            scanner.nextLine(); // Consumir la entrada no válida
            System.out.println("-------------------------------------------------");
        }
    }

    // Método para imprimir los detalles del nombre y cargo pendiente
    void imprimirDetalles() {
        System.out.println("            " + "- Nombre: " + _nombre);
        System.out.println("            " + "- Cargo pendiente: " + cargoPendiente);
    }

    // Método para probar y comparar resultados de los métodos refactorizados y no refactorizados
    void test() {
        System.out.println();
        // Usando el método no refactorizado
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "   Método no refactorizado  ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
        imprimirTodo();  

        System.out.println();

        // Usando el método refactorizado
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "     Método refactorizado  ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
        refactorImprimirTodo();
        System.out.println();
    }
}
