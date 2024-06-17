package Ejercicios;

public class Ejercicio29 {
    private int horas;
    private int horasExtras;
    private double horaBase;
    private TipoEmpleado tipo;

    class TipoEmpleado {
        public String toString() {
            return "supervisor";
        }
    } 
    
    public static void main(String[] args) {
        try {
            Ejercicio29 ejercicio29 = new Ejercicio29(); // Crear una instancia de Ejercicio29
            ejercicio29.titulo(); // Imprimir el banner
            ejercicio29.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }



    // Métodos de funcionalidad principal
    void codigo() {
        horas = 7;
        horasExtras = 2;
        horaBase = 35; 
        tipo = new TipoEmpleado();
        System.out.println(tipo.toString());

        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        System.out.println(toString());
        System.out.println();
        Ref();
        System.out.println(toString());
        System.out.println(); 
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 29:\n\nVisibilidad de atributos:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ29");
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

    public String toString() {
        return "Ejercicio29" + "\n" +
                "horas: " + horas + "\n" +
                "horasExtras: " + horasExtras + "\n" +
                "horaBase: " + horaBase + "\n" +
                "tipo: " + tipo + "\n";
    }
}



