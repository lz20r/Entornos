package Ejercicios;
public class Ejercicio15 {
    public static void main(String[] args) {
        try {
            Ejercicio15 ejercicio15 = new Ejercicio15(); // Crear una instancia de Ejercicio15
            ejercicio15.titulo(); // Imprimir el banner
            ejercicio15.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        Persona objeto15A = new Persona();
        System.out.println(objeto15A.getCurso());
        System.out.println();
        Ref();
        PersonaRefactor objeto15B = new PersonaRefactor();
        System.out.println(objeto15B.getCurso());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 15:\n\nEncapsulación de comportamiento:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ15");
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

// Clase no refactorizada
class Persona {
    String curso = "Programación NO Refactorizado";

    String getCurso() {
        return curso;
    }

    void setCurso(String curso) {
        this.curso = curso;
    }
}

// Clase refactorizada
class PersonaRefactor {
    String curso = "Programación Refactorizado";

    void addCurso(String curso) {
        System.out.println("Agregar un curso");
    }

    String getCurso() {
        return curso;
    }

    void removeCurso(String curso) {
        System.out.println("Eliminando curso");
    }
}
