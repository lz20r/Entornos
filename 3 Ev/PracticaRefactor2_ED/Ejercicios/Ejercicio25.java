package Ejercicios;
public class Ejercicio25 {
  public static void main(String[] args) {
      try {
          Ejercicio25 ejercicio25 = new Ejercicio25(); // Crear una instancia de Ejercicio25
          ejercicio25.titulo(); // Imprimir el banner
          ejercicio25.codigo(); // Ejecutar el método de prueba para comparar resultados
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
      noRefactor();
      System.out.println();
      Ref();
      refactor();
      System.out.println();
      test();
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 25:\n\nUso de constantes y variables autoexplicativas:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ25");
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

  void noRefactor() {
      int radio = 5;
      double tmp = Math.PI * radio * radio;
      System.out.println(tmp);
      tmp = 2 * Math.PI * radio;
      System.out.println(tmp);
  }

  void refactor() {
      int radio = 5;
      final double area = Math.PI * radio * radio;
      System.out.println(area);
      final double perimetro = 2 * Math.PI * radio;
      System.out.println(perimetro);
  }

  void test() {
      System.out.println("Comparación de resultados:");
      System.out.println();
      noRefactor();
      refactor();
  }
}
