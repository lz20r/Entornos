package Ejercicios;
public class Ejercicio24 {
    public static void main(String[] args) {
        try {
            Ejercicio24 ejercicio24 = new Ejercicio24(); // Crear una instancia de Ejercicio24
            ejercicio24.titulo(); // Imprimir el banner
            ejercicio24.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        String idioma1 = "RUS";
        String idioma2 = "ALE";
        int nivelingles = 1;

        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();
        antesRefactorizar(idioma1, idioma2, nivelingles);
        System.out.println();
        Ref();
        despuesRefactorizar(idioma1, idioma2, nivelingles);
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 24:\n\nUso de variables autoexplicativas:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ24");
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

    public static void antesRefactorizar(String idioma1, String idioma2, int nivelingles) {
        if ((idioma1.toUpperCase().indexOf("RUS") > -1) &&
            (idioma2.toUpperCase().indexOf("ALE") > -1) &&
            (nivelingles > 0)) {
            System.out.println("MENSAJES EN INGLES");
        } else {
            System.out.println("MENSAJES EN OTRO IDIOMA");
        }
    }

    public static void despuesRefactorizar(String idioma1, String idioma2, int nivelingles) {
        final boolean esRuso = idioma1.toUpperCase().indexOf("RUS") > -1;
        final boolean esAleman = idioma2.toUpperCase().indexOf("ALE") > -1;
        final boolean ingles = nivelingles > 0;
        
        if (esRuso && esAleman && ingles) {
            System.out.println("MENSAJES EN INGLES");
        } else {
            System.out.println("MENSAJES EN OTRO IDIOMA");
        }
    }
}
