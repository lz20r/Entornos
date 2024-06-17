package Ejercicios;
public class Ejercicio9 {
    static final double CONSTANTE_GRAVITACIONAL = 9.81;
    static double masa = 21.5;
    static double altura = 31.8;

    public Ejercicio9(double masa, double altura) {
        Ejercicio9.masa = masa;
        Ejercicio9.altura = altura;
    }

    public static void main(String[] args) {
        try {
            Ejercicio9 ejercicio9 = new Ejercicio9(masa, altura); // Crear una instancia de Ejercicio9
            ejercicio9.titulo(); // Imprimir el banner
            ejercicio9.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    double energiaPotencial(double masa, double altura) {
        return masa * altura * 9.81;
    }

    // Código refactorizado
    double refactorEnergiaPotencial(double masa, double altura) {
        double resultado = masa * altura * CONSTANTE_GRAVITACIONAL;
        return resultado;
    }

    // Método para probar resultados iguales de los métodos refactorizados y NO refactorizados.
    void codigo() {
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        System.out.println("Energía Potencial: " + energiaPotencial(masa, altura));
        System.out.println();
        Ref();
        System.out.println("Energía Potencial: " + refactorEnergiaPotencial(masa, altura));
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 9:\n\nSimplificación del método:\n Refactoriza métodos que tienen un comportamiento similar para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ9");
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
        // Usando el método refactorizado
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "     Método refactorizado   ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    }
}
