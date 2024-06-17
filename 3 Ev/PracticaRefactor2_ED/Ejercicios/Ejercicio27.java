package Ejercicios;
public class Ejercicio27 {
  private String[] animales = { "Gato", "Perro", "Loro", "Cerdo", "Tortuga" };
  private String[] animales2 = { "Gato", "Cerda", "Loro", "Vaca", "Tortuga" };

  public static void main(String[] args) {
      try {
          Ejercicio27 ejercicio27 = new Ejercicio27(); // Crear una instancia de Ejercicio27
          ejercicio27.titulo(); // Imprimir el banner
          ejercicio27.codigo(); // Ejecutar el método de prueba para comparar resultados
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
      System.out.println("Resultado sin refactorizar: " + buscarAnimal(animales));
      System.out.println();
      Ref();
      System.out.println("Resultado refactorizado: " + refactorBuscarAnimal2(animales2));
      System.out.println();
      test();
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 27:\n\nUso de bucles mejorados:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ27");
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

  String buscarAnimal(String[] animales) {
      for (int indice = 0; indice < animales.length; indice++) {
          if (animales[indice].equals("Perro")) {
              return "Perro";
          }
          if (animales[indice].equals("Tortuga")) {
              return "Tortuga";
          }
          if (animales[indice].equals("Loro")) {
              return "Loro";
          }
      }
      return "No encontrado";
  }

  String refactorBuscarAnimal2(String[] animales) {
      for (String animal : animales) {
          if (animal.equals("Perro")) {
              return "Perro";
          }
          if (animal.equals("Tortuga")) {
              return "Tortuga";
          }
          if (animal.equals("Loro")) {
              return "Loro";
          }
      }
      return "No encontrado";
  }

  void test() {
      System.out.println("Comparación de resultados:");
      System.out.println();
      System.out.println("Resultado sin refactorizar: " + buscarAnimal(animales));
      System.out.println("Resultado refactorizado: " + refactorBuscarAnimal2(animales2));
  }
}
