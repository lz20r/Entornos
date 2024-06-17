package Ejercicios;

public class Ejercicio16 {

    // Clase base Persona
    class Persona {
        private String codigo;

        // Constructor
        public Persona(String codigo) {
            this.codigo = codigo;
        }

        // Método para obtener el código
        public String getCodigo() {
            return codigo;
        }
    }

    // Subclase Macho
    class Macho extends Persona {
        // Constructor
        public Macho(String codigo) {
            super(codigo); // Llamada al constructor de la clase base
        }

        // Método para obtener el código específico para Macho
        public String obtenerCodigo() {
            return "M";
        }
    }

    // Subclase Hembra
    class Hembra extends Persona {
        // Constructor
        public Hembra(String codigo) {
            super(codigo); // Llamada al constructor de la clase base
        }

        // Método para obtener el código específico para Hembra
        @Override
        public String getCodigo() {
            return super.getCodigo(); // Devuelve el código real
        }
    }

    // Clase Persona refactorizada
    class PersonaRefactor {
        private String codigo;
        private String genero; // Nuevo atributo para representar el género

        // Constructor
        public PersonaRefactor(String codigo, String genero) {
            this.codigo = codigo;
            this.genero = genero;
        }

        // Método para obtener el código
        public String getCodigo() {
            return codigo;
        }

        // Método para obtener el género
        public String getGenero() {
            return genero;
        }
    }

    public static void main(String[] args) {
        try {
            Ejercicio16 ejercicio = new Ejercicio16(); // Crear una instancia de Ejercicio16
            ejercicio.titulo(); // Imprimir el banner
            ejercicio.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Throwable e) {
            printError(); // Imprimir mensaje de error si ocurre una excepción
        }
    }

    // Método principal que contiene la lógica de comparación
    void codigo() {
        titulo1();
        System.out.println("Comparación de resultados:");
        System.out.println();
        NoRef();

        // Creación de objetos no refactorizados
        Macho macho = new Macho("123");
        Hembra hembra = new Hembra("456");

        // Imprimir resultados de objetos no refactorizados
        System.out.println("Código del macho: " + macho.getCodigo()); // Devuelve "123"
        System.out.println("Código específico del macho: " + macho.obtenerCodigo()); // Devuelve "M"
        System.out.println("Código de la hembra: " + hembra.getCodigo()); // Devuelve "456"
        System.out.println();

        Ref();

        // Creación de objetos refactorizados
        PersonaRefactor machoRefactor = new PersonaRefactor("123", "M");
        PersonaRefactor hembraRefactor = new PersonaRefactor("456", "H");

        // Imprimir resultados de objetos refactorizados
        System.out.println("Código del macho: " + machoRefactor.getCodigo()); // Devuelve "123"
        System.out.println("Género del macho: " + machoRefactor.getGenero()); // Devuelve "M"
        System.out.println("Código de la hembra: " + hembraRefactor.getCodigo()); // Devuelve "456"
        System.out.println("Género de la hembra: " + hembraRefactor.getGenero()); // Devuelve "H"
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 16:\n\nEncapsular campo con subclase:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ16");
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
