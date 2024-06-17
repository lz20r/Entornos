package Ejercicios;
public class Ejercicio12 {

    public static void main(String[] args) {
        try {
            Ejercicio12 refactor = new Ejercicio12(); // Crear una instancia de Ejercicio12
            refactor.titulo(); // Imprimir el banner
            refactor.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        String[] fila = new String[2];
        fila[0] = "San Martín de la Arena C.D.";
        fila[1] = "15";
        ReemplazarArrayConObjeto(fila);
        System.out.println();
        Ref();
        Rendimiento rendimiento = new Rendimiento();
        rendimiento.setNombre("San Martín de la Arena C.D.");
        rendimiento.setGanados("15");
        ReemplazarArrayConObjetoRefactor(rendimiento);
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 12:\n\nReemplazar array con objeto:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ12");
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
    void ReemplazarArrayConObjeto(String[] fila) {
        System.out.println("Nombre: " + fila[0]);
        System.out.println("Ganados: " + fila[1]);
    }

    // Método después de refactorizar
    void ReemplazarArrayConObjetoRefactor(Rendimiento rendimiento) {
        System.out.println("Nombre: " + rendimiento.getNombre());
        System.out.println("Ganados: " + rendimiento.getGanados());
    }
}

// Clase para reemplazar el array
class Rendimiento {
    private String nombre;
    private String ganados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGanados() {
        return ganados;
    }

    public void setGanados(String ganados) {
        this.ganados = ganados;
    }
}
