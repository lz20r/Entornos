package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {

    // Variables para almacenar el nombre y la cantidad de cargo pendiente
    double alto = 0;
    double ancho = 0;
    double _alto = 0;
    double _ancho = 0;
    double perimetro = 0;

    public static void main(String[] args) {
        Ejercicio2 Ejercicio2 = new Ejercicio2(); // Crear una instancia de Ejercicio2
        Scanner scanner = new Scanner(System.in); // Crear un Scanner para leer la entrada del usuario
        try {
            Ejercicio2.titulo(); // Imprimir el banner
            // Leer datos del usuario una sola vez
            Ejercicio2.leerDatos(scanner);
            // Ejecutar el método de prueba para comparar resultados
            Ejercicio2.titulo1();
            Ejercicio2.codigo();
            System.out.println();
        } catch (Exception e) {
            
        } finally {
            scanner.close(); // Cerrar el Scanner al final del uso
        }
    }

    // Método para separar las variables temporales
    private void SVT() {
        double temp = 2 * (_alto + _ancho);
        System.out.println("                         " + "- Perimetro: " + temp + "cm");
        temp = _alto * _ancho;
        System.out.println("                         " + "- Area: " + temp + "cm");
    }

    // Método refactorizado para separar las variables temporales
    private void SVTR() {
        double perimetro = 2 * (alto + ancho);
        System.out.println("                         " + "- Perimetro: " + perimetro + "cm");
        double area = alto * ancho;
        System.out.println("                         " + "- Area: " + area + "cm");
        System.out.println();
    }

    // Método para leer los datos del usuario
    void leerDatos(Scanner scanner) {
        System.out.println("                         " + "-----------------------");
        System.out.println("                         " + "    Entrada de datos     ");
        System.out.println("                         " + "-----------------------");
        System.out.println();
        System.out.print("Introduzca el alto(cm): ");
        alto = scanner.nextDouble(); // Leer el alto del usuario
        System.out.print("Introduzca el _alto(cm): ");
        _alto = scanner.nextDouble(); // Leer el nuevo alto del usuario
        System.out.print("Introduzca el ancho(cm): ");
        ancho = scanner.nextDouble(); // Leer el ancho del usuario
        System.out.print("Introduzca el _ancho(cm): ");
        _ancho = scanner.nextDouble(); // Leer el nuevo ancho del usuario S
    }

    void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 2:\n\nSeparar variables temporales:\n Tienes una variable temporal que usas más de una vez, pero no es una variable de bucle ni una variable temporal de colección.\n RE --> Creamos una variable temporal para cada asignación.\n");
        System.out.println("RESOLUCIÓN DEL EJ2");
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
        // Usando el método no refactorizado
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "   Método no refactorizado  ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    }

    void Ref() {
        System.out.println();
        // Usando el método refactorizado
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "     Método refactorizado   ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    }

    // Método de prueba para comparar los resultados de los métodos refactorizados y
    // no refactorizados
    void codigo() {
        NoRef();
        SVT();
        Ref();
        SVTR();
    }
}