package Ejercicios;
public class Ejercicio7 {
    int antiguedad = 1;
    int mesesDiscapacitado = 16;
    boolean esTiempoParcial = true;

    public static void main(String[] args) {
        try {
            Ejercicio7 ejercicio7 = new Ejercicio7(); // Crear una instancia de Ejercicio7
            ejercicio7.titulo(); // Imprimir el banner
            ejercicio7.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    double cuantiaPorDiscapacidad() {
        if (antiguedad < 2) {
            return 0;
        } else if (mesesDiscapacitado > 12) {
            return 0;
        } else if (esTiempoParcial) {
            return 0;
        }
        // Calculamos la cantidad por discapacidad
        return 0;
    }

    // Código Refactorizado
    double refactorCuantiaPorDiscapacidad() {
        if (esNoElegibleParaDiscapacidad()) {
            return 0;
        }
        return 0;
    }

    private boolean esNoElegibleParaDiscapacidad() {
        if (antiguedad < 2) {
            return true;
        } else if (mesesDiscapacitado > 12) {
            return true;
        } else if (esTiempoParcial) {
            return true;
        }
        return false;
    }

    // Método para probar resultados iguales de los métodos refactorizados y NO refactorizados.
    void codigo() {
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        System.out.println("Por discapacidad te corresponden: €" + cuantiaPorDiscapacidad());
        System.out.println();
        Ref();
        System.out.println("Por discapacidad te corresponden: €" + refactorCuantiaPorDiscapacidad());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 7:\n\nSimplificación del método:\n Refactoriza métodos que tienen un comportamiento similar para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ7");
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
