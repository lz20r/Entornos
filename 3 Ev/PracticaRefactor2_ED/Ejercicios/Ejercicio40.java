package Ejercicios;
public class Ejercicio40 {
    public static void main(String[] args) {
        try {
            Ejercicio40 ejercicio40 = new Ejercicio40(); // Crear una instancia de Ejercicio40
            ejercicio40.titulo(); // Imprimir el banner
            ejercicio40.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        System.out.println("Patrón de refactorización usual 40:\n\nUso del patrón Decorator:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ40");
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

    // Método antesRefactorizar - sin usar el patrón Decorator
    public static void antesRefactorizar() {
        // Crear instancias de diferentes paquetes
        Pack pack1 = new PackBasico();
        Pack pack2 = new PackCuero();
        Pack pack3 = new PackLujo();
        // Imprimir descripciones y precios de los paquetes
        System.out.println(pack1.getDescripcion() + " cuesta " + pack1.getPrecio());
        System.out.println(pack2.getDescripcion() + " cuesta " + pack2.getPrecio());
        System.out.println(pack3.getDescripcion() + " cuesta " + pack3.getPrecio());
    }

    // Método despuesRefactorizar - usando el patrón Decorator
    public static void despuesRefactorizar() {
        // Crear instancias de paquetes y decorarlas
        Pack pack1 = new PackBasico();
        Pack pack2 = new CueroDecorator(new PackBasico());
        Pack pack3 = new XenonDecorator(new LunasDecorator(new CueroDecorator(new PackLujo())));
        // Imprimir descripciones y precios de los paquetes decorados
        System.out.println(pack1.getDescripcion() + " cuesta " + pack1.getPrecio());
        System.out.println(pack2.getDescripcion() + " cuesta " + pack2.getPrecio());
        System.out.println(pack3.getDescripcion() + " cuesta " + pack3.getPrecio());
    }

    // Definición de clases
    abstract static class Pack {
        protected String descripcion = "Paquete desconocido";

        public String getDescripcion() {
            return descripcion;
        }

        public abstract double getPrecio();
    }

    // Implementaciones concretas del Pack
    static class PackBasico extends Pack {
        public PackBasico() {
            descripcion = "Paquete básico";
        }

        @Override
        public double getPrecio() {
            return 100.0;
        }
    }

    static class PackCuero extends Pack {
        public PackCuero() {
            descripcion = "Paquete con cuero";
        }

        @Override
        public double getPrecio() {
            return 150.0;
        }
    }

    static class PackLujo extends Pack {
        public PackLujo() {
            descripcion = "Paquete de lujo";
        }

        @Override
        public double getPrecio() {
            return 200.0;
        }
    }

    // Decorator abstracto
    abstract static class PackDecorator extends Pack {
        public abstract String getDescripcion();
    }

    // Decoradores concretos
    static class FantasDecorator extends PackDecorator {
        Pack pack;

        public FantasDecorator(Pack pack) {
            this.pack = pack;
        }

        @Override
        public String getDescripcion() {
            return pack.getDescripcion() + ", con llantas de fantasía";
        }

        @Override
        public double getPrecio() {
            return pack.getPrecio() + 50.0;
        }
    }

    static class LunasDecorator extends PackDecorator {
        Pack pack;

        public LunasDecorator(Pack pack) {
            this.pack = pack;
        }

        @Override
        public String getDescripcion() {
            return pack.getDescripcion() + ", con lunas polarizadas";
        }

        @Override
        public double getPrecio() {
            return pack.getPrecio() + 30.0;
        }
    }

    static class CueroDecorator extends PackDecorator {
        Pack pack;

        public CueroDecorator(Pack pack) {
            this.pack = pack;
        }

        @Override
        public String getDescripcion() {
            return pack.getDescripcion() + ", con tapizado de cuero";
        }

        @Override
        public double getPrecio() {
            return pack.getPrecio() + 70.0;
        }
    }

    static class XenonDecorator extends PackDecorator {
        Pack pack;

        public XenonDecorator(Pack pack) {
            this.pack = pack;
        }

        @Override
        public String getDescripcion() {
            return pack.getDescripcion() + ", con luces de xenon";
        }

        @Override
        public double getPrecio() {
            return pack.getPrecio() + 40.0;
        }
    }
}