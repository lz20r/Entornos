package Ejercicios;

public class Ejercicio18 {
    // Clase Teléfono antes de la refactorización
    class Ejercicio18Teléfono {
        private String códigoAreaOficina;
        private String nombre;
        private String númeroOficina;

        public Ejercicio18Teléfono(String códigoAreaOficina, String nombre, String númeroOficina) {
            this.códigoAreaOficina = códigoAreaOficina;
            this.nombre = nombre;
            this.númeroOficina = númeroOficina;
        }

        public String obtenerNumeroTeléfono() {
            return códigoAreaOficina + númeroOficina;
        }

        public String getNombre() {
            return nombre;
        }
    }

    // Clase Teléfono después de la refactorización
    class Ejercicio18TeléfonoRefactorizado {
        private String códigoArea;
        private String número;

        public Ejercicio18TeléfonoRefactorizado(String códigoArea, String número) {
            this.códigoArea = códigoArea;
            this.número = número;
        }

        public String getNumeroTeléfono() {
            return códigoArea + número;
        }
    }

    // Clase Persona después de la refactorización
    class PersonaTelefono {
        private String nombre;

        public PersonaTelefono(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public static void main(String[] args) {
        try {
            Ejercicio18 Ejercicio18 = new Ejercicio18(); // Crear una instancia de Ejercicio18
            Ejercicio18.titulo(); // Imprimir el banner
            Ejercicio18.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        Ejercicio18Teléfono telefonoAntes = new Ejercicio18Teléfono("+34 ", "Naiara", "638 579 630");
        System.out.println("Nombre: " + telefonoAntes.getNombre());
        System.out.println("Número de Teléfono: " + telefonoAntes.obtenerNumeroTeléfono());
        System.out.println();
        Ref();
        Ejercicio18TeléfonoRefactorizado telefonoRefactorizado = new Ejercicio18TeléfonoRefactorizado("+34 ", "638 579 630");
        PersonaTelefono persona = new PersonaTelefono("Naiara");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Número de Teléfono: " + telefonoRefactorizado.getNumeroTeléfono());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 18:\n\nDescomposición de clase:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ18");
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
