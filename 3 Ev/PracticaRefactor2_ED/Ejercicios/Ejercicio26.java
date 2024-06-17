package Ejercicios;
public class Ejercicio26 {
    public static void main(String[] args) {
        try {
            Ejercicio26 ejercicio26 = new Ejercicio26(); // Crear una instancia de Ejercicio26
            ejercicio26.titulo(); // Imprimir el banner
            ejercicio26.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        int horas = 40;
        int horasExtra = 10;
        int salarioBase = 20;

        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        int salarioAntes = antesRefactorizar(horas, horasExtra, salarioBase);
        System.out.println("Salario antes de refactorizar: " + salarioAntes);
        System.out.println();
        Ref();
        int salarioDespues = despuesRefactorizar(horas, horasExtra, salarioBase);
        System.out.println("Salario después de refactorizar: " + salarioDespues);
        System.out.println();
        test(horas, horasExtra, salarioBase);
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 26:\n\nUso correcto de parámetros:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ26");
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

    public int antesRefactorizar(int horas, int horasExtra, int salarioBase) {
        // Mal uso de parámetros: 'horas'
        horas = horas + (int) (horasExtra * 1.5);
        return horas * salarioBase;
    }

    public int despuesRefactorizar(int horas, int horasExtra, int salarioBase) {
        // Uso correcto de parámetros: variable final
        final int horasTrabajadas = horas + (int) (horasExtra * 1.5);
        return horasTrabajadas * salarioBase;
    }

    void test(int horas, int horasExtra, int salarioBase) {
        System.out.println("Comparación de resultados:");
        System.out.println();
        int salarioAntes = antesRefactorizar(horas, horasExtra, salarioBase);
        System.out.println("Salario antes de refactorizar: " + salarioAntes);
        int salarioDespues = despuesRefactorizar(horas, horasExtra, salarioBase);
        System.out.println("Salario después de refactorizar: " + salarioDespues);
    }
}
