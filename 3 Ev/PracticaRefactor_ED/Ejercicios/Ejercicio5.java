package Ejercicios;
public class Ejercicio5 {
    double total;
    double precio = 90;

    public static void main(String[] args) {
        try {
            Ejercicio5 ejercicio5 = new Ejercicio5(); // Crear una instancia de Ejercicio5
            ejercicio5.titulo(); // Imprimir el banner
            ejercicio5.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void metodo() {
        if (esAcuerdoEspecial()) {
            total = precio * 0.95;
            enviar();
        } else {
            total = precio * 0.98;
            enviar();
        }
    }

    boolean esAcuerdoEspecial() {
        String oferta = "Cumples con requisitos para oferta";
        boolean cumpleOferta = true;
        if (cumpleOferta) {
            System.out.println(oferta);
        }
        return cumpleOferta;
    }

    void enviar() {
        System.out.println("El precio total es: " + total);
    }

    // Código Refactorizado
    void refactorMetodo() {
        if (esAcuerdoEspecial()) {
            total = precio * 0.95;
        } else {
            total = precio * 0.98;
        }
        enviar();
    }

    // Método para probar resultados iguales de los métodos refactorizados y NO
    // refactorizados.
    void codigo() {
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        metodo();
        System.out.println();
        Ref();
        refactorMetodo();
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 5:\n\nSimplificación del método:\n Refactoriza métodos que tienen un comportamiento similar para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ5");
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
