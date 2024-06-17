package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
    
    class Proyecto {
        Persona[] participantes;
    } 
    
    class Persona { 
        int id;

        boolean participantes(Proyecto proyecto) {
            for (int i = 0; i < proyecto.participantes.length; i++) {
                if (proyecto.participantes[i].id == id) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public static void main(String[] args) {
        try {
            Ejercicio4 Ejercicio4 = new Ejercicio4(); // Crear una instancia de Ejercicio4
            Ejercicio4.titulo(); // Imprimir el banner
            Scanner scanner = new Scanner(System.in); // Crear un Scanner para leer la entrada del usuario
            Ejercicio4.leerDatos(scanner);
            System.out.println();
            // Ejecutar el método de prueba para comparar resultados
            Ejercicio4.titulo1(); 
            Ejercicio4.codigo();
        } catch (Exception e) { 
            printError();
        }
    }

    // Métodos de funcionalidad principal
    private void leerDatos(Scanner scanner) {
        System.out.println("                         " + "-----------------------");
        System.out.println("                         " + "    Entrada de datos   ");
        System.out.println("                         " + "-----------------------");
        System.out.println();
        System.out.print("Ingrese el número de participantes: "); 
        int numParticipantes = scanner.nextInt(); // Leer el número de participantes del usuario
        Proyecto proyecto = new Proyecto();
        proyecto.participantes = new Persona[numParticipantes];
        for (int i = 0; i < numParticipantes; i++) {
            proyecto.participantes[i] = new Persona();
            System.out.print("Ingrese el ID del participante " + (i + 1) + ": ");
            proyecto.participantes[i].id = scanner.nextInt(); // Leer el ID del participante del usuario
        }
    }

    void Imprimir(Persona persona1, Persona persona2, Proyecto proyecto) {
        if (persona1.participantes(proyecto)) {
            System.out.println("                         " + "- El participante 1 está en el proyecto");
        } else {
            System.out.println("                         " + "- El participante 1 no está en el proyecto");
        }

        if (persona2.participantes(proyecto)) {
            System.out.println("                         " + "- El participante 2 está en el proyecto");
        } else {
            System.out.println("                         " + "- El participante 2 no está en el proyecto");
        }
    }

    private void SVTR() {
        Persona persona1 = new Persona();
        persona1.id = 1;
        Persona persona2 = new Persona();
        persona2.id = 2;

        Proyecto proyecto = new Proyecto();
        proyecto.participantes = new Persona[] { persona1, persona2 };

        Imprimir(persona1, persona2, proyecto);
        System.out.println();
    }

    private void SVT() {
        Persona persona1 = new Persona();
        persona1.id = 1;
        Persona persona2 = new Persona();
        persona2.id = 2;

        Proyecto proyecto = new Proyecto();
        proyecto.participantes = new Persona[] { persona1, persona2 };

        Imprimir(persona1, persona2, proyecto);
    }

    void codigo() {
        NoRef(); // Ejecutar el método no refactorizado
        SVT(); // Ejecutar el método no refactorizado
        Ref();  // Ejecutar el método refactorizado
        SVTR(); // Ejecutar el método refactorizado
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 4:\n\nExtraer método:\n Tienes un fragmento de código que puede agruparse.\n RE --> Convierte el fragmento en un metodo cuyo nombre explique el propósito del método. \n");
        System.out.println("RESOLUCIÓN DEL EJ4");
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
        // Usando el método refactorizado
        System.out.println("                         " + "----------------------------");
        System.out.println("                         " + "     Método refactorizado   ");
        System.out.println("                         " + "----------------------------");
        System.out.println();
    }
}
