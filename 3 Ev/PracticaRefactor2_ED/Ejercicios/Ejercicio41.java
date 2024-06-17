package Ejercicios;
public class Ejercicio41 {
  public static void main(String[] args) {
      try {
          Ejercicio41 ejercicio41 = new Ejercicio41(); // Crear una instancia de Ejercicio41
          ejercicio41.titulo(); // Imprimir el banner
          ejercicio41.codigo(); // Ejecutar el método de prueba para comparar resultados
      } catch (Exception e) {
          printError();
      }
  }

  // Métodos de funcionalidad principal
  void codigo() {
      Sensor objeto41A = new Sensor();
      RefactorSensorEstado objeto41B = new RefactorSensorEstado();

      titulo1();
      System.out.println("Comparación de resultados:");
      System.out.println();
      NoRef();
      objeto41A.mide();
      System.out.println();
      Ref();
      objeto41B.mide();
      System.out.println();
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 41:\n\nUso de estados específicos para diferentes tipos de sensores:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ41");
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

  // Definición de clases
  class Sensor {
      void monitorizar() {
          Sensor estado = new Sensor();
          estado.mide();
      }

      void mide() {
          System.out.println("Medidor de estado");
      }
  }

  class RefactorSensorEstado {
      void mide() {
          System.out.println("Medidor de estado");
      }
  }

  class Apagado extends RefactorSensorEstado {}

  class EnReposo extends RefactorSensorEstado {}

  class Activo extends RefactorSensorEstado {}
}
