package Ejercicios;
public class Ejercicio14 {

    public static void main(String[] args) {
        try {
            Ejercicio14 Ejercicio14 = new Ejercicio14("Ejemplo"); // Crear una instancia de Ejercicio14
            Ejercicio14.titulo(); // Imprimir el banner
            Ejercicio14.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Atributo antes de refactorizar
    public String _nombre;

    // Constructor
    public Ejercicio14(String nombre) {
        this._nombre = nombre;
    }

    // Métodos de funcionalidad principal
    void codigo() {
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        EncapsularAtributocomoPropiedad();
        System.out.println();
        Ref();
        EncapsularAtributocomoPropiedadRefactor();
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 14:\n\nEncapsular atributo como propiedad:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ14");
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
    void EncapsularAtributocomoPropiedad() {
        System.out.println("Nombre (antes de refactorizar): " + _nombre);
    }

    // Método después de refactorizar
    void EncapsularAtributocomoPropiedadRefactor() {
        System.out.println("Nombre (después de refactorizar): " + getNombre());
    }

    // Propiedad después de refactorizar
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }
}
