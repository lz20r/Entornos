package Ejercicios;
public class Ejercicio13 {
    public static void main(String[] args) {
        try {
            Ejercicio13 ejercicio13 = new Ejercicio13(); // Crear una instancia de Ejercicio13
            ejercicio13.titulo(); // Imprimir el banner
            ejercicio13.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        Ejercicio13_NoRefactor objeto13NO = new Ejercicio13_NoRefactor();
        objeto13NO.imprimirAtributo();
        System.out.println();
        Ref();
        Ejercicio13 objeto13 = new Ejercicio13();
        objeto13.setNombre("Naiara Zhiyao");
        System.out.println(objeto13.getNombre());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 13:\n\nEncapsulación de atributo:\n Refactoriza métodos que acceden a atributos directamente para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ13");
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

    // Métodos getter y setter para el nombre
    private String nombre;

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

// Clase no refactorizada
class Ejercicio13_NoRefactor {
    String nombre = "Naiara Zhiyao";

    void imprimirAtributo() {
        System.out.println(nombre);
    }
}
