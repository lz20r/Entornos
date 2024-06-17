package Ejercicios;
public class Ejercicio8 {
    // Enumeración para los tipos de ave
    enum TipoAve {
        EUROPEA,
        AFRICANA,
        NORUEGO_AZUL
    }

    // Variables de instancia necesarias para el ejemplo sin refactorizar
    static TipoAve _tipo = TipoAve.EUROPEA;  // Ejemplo de tipo de ave
    static int _numeroCocos = 3;  // Ejemplo de número de cocos para AFRICANA
    static boolean _esMoteado = false;  // Ejemplo para NORUEGO_AZUL
    static int _voltaje = 120;  // Ejemplo de voltaje para NORUEGO_AZUL

    public static void main(String[] args) {
        try {
            Ejercicio8 Ejercicio8 = new Ejercicio8(); // Crear una instancia de Ejercicio8
            Ejercicio8.titulo(); // Imprimir el banner
            Ejercicio8.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        double velocidadSinRefactorizar = ReemplazarCondicionalporPolimorfismo();
        System.out.println("Velocidad sin refactorizar: " + velocidadSinRefactorizar);
        System.out.println();
        Ref();
        Ave europea = new AveEuropea();
        Ave africana = new AveAfricana(3);  // Ejemplo con 3 cocos
        Ave noruegoAzul = new AveNoruegoAzul(false, 120);  // Ejemplo de voltaje y moteado

        System.out.println("Velocidad del ave europea refactorizada: " + europea.getVelocidad());
        System.out.println("Velocidad del ave africana refactorizada: " + africana.getVelocidad());
        System.out.println("Velocidad del ave noruego azul refactorizada: " + noruegoAzul.getVelocidad());
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 8:\n\nReemplazar condicional por polimorfismo:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ8");
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

    private static double ReemplazarCondicionalporPolimorfismo() {
        switch (_tipo) {
            case EUROPEA:
                return getVelocidadBase();
            case AFRICANA:
                return getVelocidadBase() - getFactorCarga() * _numeroCocos;
            case NORUEGO_AZUL:
                return (_esMoteado) ? 0 : getVelocidadBase(_voltaje);
            default:
                throw new RuntimeException("Debería ser inalcanzable");
        }
    }

    private static double getVelocidadBase() {
        // Implementación ficticia para la velocidad base
        return 12.0;
    }

    private static double getVelocidadBase(int voltaje) {
        // Implementación ficticia para la velocidad base con voltaje
        return voltaje / 10.0;
    }

    private static double getFactorCarga() {
        // Implementación ficticia para el factor de carga
        return 1.5;
    }
}

// Clase base abstracta para la versión refactorizada
abstract class Ave {
    abstract double getVelocidad();
}

// Subclase para aves europeas
class AveEuropea extends Ave {
    @Override
    double getVelocidad() {
        return getVelocidadBase();
    }

    private double getVelocidadBase() {
        // Implementación ficticia para la velocidad base
        return 12.0;
    }
}

// Subclase para aves africanas
class AveAfricana extends Ave {
    private int numeroCocos;

    AveAfricana(int numeroCocos) {
        this.numeroCocos = numeroCocos;
    }

    @Override
    double getVelocidad() {
        return getVelocidadBase() - getFactorCarga() * numeroCocos;
    }

    private double getVelocidadBase() {
        // Implementación ficticia para la velocidad base
        return 12.0;
    }

    private double getFactorCarga() {
        // Implementación ficticia para el factor de carga
        return 1.5;
    }
}

// Subclase para aves noruegas azules
class AveNoruegoAzul extends Ave {
    private boolean esMoteado;
    private int voltaje;

    AveNoruegoAzul(boolean esMoteado, int voltaje) {
        this.esMoteado = esMoteado;
        this.voltaje = voltaje;
    }

    @Override
    double getVelocidad() {
        return esMoteado ? 0 : getVelocidadBase(voltaje);
    }

    private double getVelocidadBase(int voltaje) {
        // Implementación ficticia para la velocidad base con voltaje
        return voltaje / 10.0;
    }
}
