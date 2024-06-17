package Ejercicios;
public class Ejercicio36 {
    private String[] asignaturas;

    public Ejercicio36(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public static void main(String[] args) {
        try {
            Ejercicio36 ejercicio36 = new Ejercicio36(new String[] {"Matemáticas", "Física", "Química"}); // Crear una instancia de Ejercicio36
            ejercicio36.titulo(); // Imprimir el banner
            ejercicio36.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        antesRefactorizar();
        System.out.println();
        Ref();
        despuesRefactorizar();
        System.out.println();
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 36:\n\nUso de copias para evitar modificación de originales:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ36");
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

    // Getters y Setters
    String[] getAsignaturas() {
        return asignaturas;
    }

    void setAsignaturas(String[] var) {
        asignaturas = var;
    }

    void setAsignatura(int donde, String titulo) {
        asignaturas[donde] = titulo;
    }

    void antesRefactorizar() {
        System.out.println("Resultado antes de refactorizar:");
        imprimirAsignaturas(getAsignaturas());
    }

    void despuesRefactorizar() {
        System.out.println("Resultado después de refactorizar:");
        imprimirAsignaturas(getAsignaturasCopia());
    }

    /*
     * Setter a partir de una copia.
     * Preserva el original.
     */
    void setAsignaturasCopia(String[] var) {
        asignaturas = new String[var.length];
        for (int i = 0; i < var.length; i++) {
            setAsignatura(i, var[i]);
        }
    }

    /*
     * En este getter creo una copia del array
     * y lo devuelvo, con lo cual no se modifica
     * el array original
     */
    String[] getAsignaturasCopia() {
        String[] var = new String[asignaturas.length];
        System.arraycopy(asignaturas, 0, var, 0, asignaturas.length);
        return var;
    }

    // Método para imprimir asignaturas
    void imprimirAsignaturas(String[] asignaturas) {
        for (String asignatura : asignaturas) {
            System.out.println(asignatura);
        }
    }
}
