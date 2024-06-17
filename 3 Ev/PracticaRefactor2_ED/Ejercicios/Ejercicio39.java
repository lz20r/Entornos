package Ejercicios;
public class Ejercicio39 {
  public static void main(String[] args) {
      try {
          Ejercicio39 ejercicio39 = new Ejercicio39(); // Crear una instancia de Ejercicio39
          ejercicio39.titulo(); // Imprimir el banner
          ejercicio39.codigo(); // Ejecutar el método de prueba para comparar resultados
      } catch (Exception e) {
          printError();
      }
  }

  // Métodos de funcionalidad principal
  void codigo() {
      Paisaje paisaje = new Paisaje();

      titulo1();
      System.out.println("Demostración de resultados:");
      System.out.println();
      Ref();
      System.out.println(paisaje.mostrar());
      NoRef();
      System.out.println(paisaje.mostrar());
      System.out.println("");
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 39:\n\nUso de clases específicas para diferentes tipos de escenas:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ39");
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
  class Escena {
      void dibujar() {}
  }

  class EscenaCiudad extends Escena {}

  class EscenaMontaña extends Escena {}

  class Paisaje {
      String mostrar() {
          return "Mostrar Escenas";
      }
  }
}
