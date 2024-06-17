package Ejercicios;
public class Ejercicio22 {
    // Variables de instancia para cantidad y precio
    private double cantidad;
    private double precioUnitario;

    public static void main(String[] args) {
        try {
            Ejercicio22 ejercicio22 = new Ejercicio22(); // Crear una instancia de Ejercicio22
            ejercicio22.titulo(); // Imprimir el banner
            ejercicio22.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        cantidad = 150;
        precioUnitario = 10;

        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        double resultadoAntes = antesRefactorizar(cantidad, precioUnitario);
        System.out.println("Resultado sin refactorizar: " + resultadoAntes);
        System.out.println();
        Ref();
        double resultadoDespues = despuesRefactorizar();
        System.out.println("Resultado refactorizado: " + resultadoDespues);
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 22:\n\nSeparación de lógica de cálculo:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ22");
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

    // Método antesRefactorizar que calcula el precio final de la cantidad y el precio
    public double antesRefactorizar(double cantidad, double precioUnitario) {
        // Calcular el precio base
        double preciobase = cantidad * precioUnitario;
        // Aplicar el descuento basado en el precio base
        if (preciobase > 1000) {
            // Descuento del 10% si el precio base es mayor a 1000
            return preciobase * 0.90;
        } else {
            // Descuento del 5% si el precio base es menor o igual a 1000
            return preciobase * 0.95;
        }
    }

    // Método despuesRefactorizar que también calcula el precio final pero usando el método precioBase()
    public double despuesRefactorizar() {
        // Aplicar el descuento basado en el precio base calculado por precioBase()
        if (precioBase() > 1000) {
            // Descuento del 10% si el precio base es mayor a 1000
            return precioBase() * 0.90;
        } else {
            // Descuento del 5% si el precio base es menor o igual a 1000
            return precioBase() * 0.95;
        }
    }

    // Método precioBase que calcula el precio base multiplicando la cantidad por el precio unitario
    public double precioBase() {
        return cantidad * precioUnitario;
    }
}
