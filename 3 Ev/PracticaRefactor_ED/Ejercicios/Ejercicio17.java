package Ejercicios;

public class Ejercicio17 {

    // Clase no refactorizada
    class Trabajo {
        String empleado;
        double precioTotal;
        double precioUnidad;

        String getEmpleado() {
            return empleado;
        }

        double getPrecioTotal() {
            return precioTotal;
        }

        double getPrecioUnidad() {
            return precioUnidad;
        }
    }

    // Clase refactorizada
    class TrabajoRefactor {
        double precioTotal;
        double precioUnidad;

        double getPrecioTotal() {
            return precioTotal;
        }

        double getPrecioUnidad() {
            return precioUnidad;
        }
    }

    class Labor extends TrabajoRefactor {
        String empleado;

        String getEmpleado() {
            return empleado;
        }

        public Labor() {
            this.getPrecioUnidad();
        }
    }

    public static void main(String[] args) {
        try {
            Ejercicio17 ejercicio17 = new Ejercicio17(); // Crear una instancia de Ejercicio17
            ejercicio17.titulo(); // Imprimir el banner
            ejercicio17.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        Trabajo trabajo = new Trabajo();
        System.out.println("Empleado: " + trabajo.getEmpleado());
        System.out.println("Precio Total: " + trabajo.getPrecioTotal());
        System.out.println("Precio por Unidad: " + trabajo.getPrecioUnidad());
        System.out.println();
        Ref();
        Labor labor = new Labor();
        System.out.println("Empleado: " + labor.getEmpleado());
        System.out.println("Precio Total: " + labor.getPrecioTotal());
        System.out.println("Precio por Unidad: " + labor.getPrecioUnidad());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 17:\n\nEncapsulación de comportamiento:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ17");
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
}
