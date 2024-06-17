package Ejercicios;
public class Ejercicio37 {
    public static void main(String[] args) {
        try {
            Ejercicio37 ejercicio37 = new Ejercicio37(); // Crear una instancia de Ejercicio37
            ejercicio37.titulo(); // Imprimir el banner
            ejercicio37.codigo(); // Ejecutar el método de prueba para comparar resultados
        } catch (Exception e) {
            printError();
        }
    }

    // Métodos de funcionalidad principal
    void codigo() {
        refactorTenista objeto37 = new refactorTenista();
        titulo1();
        System.out.println("Demostración de resultados:");
        System.out.println();
        Ref();
        objeto37.create(1);
        objeto37.create(2); 
        NoRef();
        objeto37.create(3); 
        System.out.println("");
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println(
                "Patrón de refactorización usual 37:\n\nUso de clases específicas para diferentes tipos:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ37");
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

    void Ref() {
        System.out.println();
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "     Método refactorizado   ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    }

    void NoRef() {
        System.out.println();
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "   Método no refactorizado  ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    } 

    // Definición de clases
    class tenista {
        public final int AMATEUR = 1;
        public final int SEMIPROFESIONAL = 2;
        public final int PROFESIONAL = 3;
        public final int _sexo = 2;

        public int getSexo() {
            return _sexo;
        }
    }

    class refactorTenista {
        private final int AMATEUR = 1;
        private final int SEMIPROFESIONAL = 2;
        private final int PROFESIONAL = 3;
        private final int _tipo = 2;

        public int getTipo() {
            return _tipo;
        }

        public refactorTenista create(int tipo) {
            switch (tipo) {
                case AMATEUR:
                    System.out.println("Se crea objeto amateur");
                    return new amateur();
                case SEMIPROFESIONAL:
                    System.out.println("Se crea objeto semiprofesional");
                    return new semiprofesional();
                case PROFESIONAL:
                    System.out.println("Se crea objeto profesional");
                    return new profesional();
                default:
                    throw new IllegalArgumentException("tipo incorrecto");
            }
        }

        class amateur extends refactorTenista {
            public amateur() {
            }
        }

        class semiprofesional extends refactorTenista {
            public semiprofesional() {
            }
        }

        class profesional extends refactorTenista {
            public profesional() {
            }
        }
    }
}
