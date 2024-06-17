package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    int entradaValor;
    int cantidad;
    int año;

    public static void main(String[] args) {
        try {
            Ejercicio3 ejercicio3 = new Ejercicio3(); // Crear una instancia de Ejercicio3
            ejercicio3.titulo(); // Imprimir el banner
            Scanner scanner = new Scanner(System.in); // Crear un Scanner para leer la entrada del usuario
            ejercicio3.leerDatos(scanner);
            System.out.println(); 
            ejercicio3.titulo1();
            ejercicio3.codigo();
        } catch (Exception e) {
            printError();
        }
    }

    void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 3:\n\nElimina asignaciones de parámetros:\n Un parámetro es usado para recibir una asignación\n RE --> Usamos una variable temporal en su lugar.\n");
        System.out.println("RESOLUCIÓN DEL EJ3");
    }

    void leerDatos(Scanner scanner) {
        System.out.println("                         " + "-----------------------");
        System.out.println("                         " + "    Entrada de datos     ");
        System.out.println("                         " + "-----------------------");
        System.out.println();
        System.out.print("Introduzca la entrada de valor: ");
        entradaValor = scanner.nextInt(); // Leer la entrada de valor del usuario
        System.out.print("Introduzca el descuento de la cantidad: ");
        cantidad = scanner.nextInt(); // Leer la cantidad de descuento del usuario
        System.out.print("Introduzca el año: ");
        año = scanner.nextInt(); // Leer el año del usuario
    }

    int descuento(int entradaValor, int cantidad, int año) {
        if (entradaValor > cantidad) {
            return entradaValor -= 2;
        } else {
            return entradaValor;
        }
    }

    int discount(int entradaValor, int cantidad, int año) {
        int resultado = entradaValor;
        if (entradaValor > cantidad) {
            resultado -= 2;
        }
        return resultado;
    }


    void SVT() {
        int temp = descuento(entradaValor, cantidad, año);
        System.out.println("                         " + "- Precio con descuento: " + temp);
    }

    
    void SVTR() {
        int resultado = discount(entradaValor, cantidad, año);
        System.out.println("                         " + "- Precio con descuento: " + resultado);
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

    void codigo() {
        NoRef(); // Ejecutar el método no refactorizado
        SVT(); // Ejecutar el método no refactorizado
        Ref(); // Ejecutar el método refactorizado
        SVTR(); // Ejecutar el método refactorizado
    }
}
