package Ejercicios;
public class Ejercicio10 {

    public static void main(String[] args) {
        try {
            Ejercicio10 refactor = new Ejercicio10(); // Crear una instancia de Ejercicio10
            refactor.titulo(); // Imprimir el banner
            refactor.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        double masa = 10.0;
        double altura = 5.0;
        
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        double energiaAntes = ReemplazarNumeroMagicoConMetodoConstante(masa, altura);
        System.out.println("Energía potencial antes de refactorizar: " + energiaAntes);
        System.out.println();
        Ref();
        double energiaDespues = ReemplazarNumeroMagicoConMetodoConstanteRefactor(masa, altura);
        System.out.println("Energía potencial después de refactorizar: " + energiaDespues);
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 10:\n\nReemplazar número mágico con método constante:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ10");
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
    double ReemplazarNumeroMagicoConMetodoConstante(double masa, double altura) {
        return masa * altura * 9.81;
    }

    // Método después de refactorizar
    double ReemplazarNumeroMagicoConMetodoConstanteRefactor(double masa, double altura) {
        return masa * altura * constanteGravitacional();
    }

    // Método que devuelve la constante gravitacional
    public static double constanteGravitacional() {
        return 9.81;
    }
}
