package Ejercicios;
public class Ejercicio23 {
  int cantidad = 10;
  int precio = 500;

  public static void main(String[] args) {
      try {
          Ejercicio23 ejercicio23 = new Ejercicio23(); // Crear una instancia de Ejercicio23
          ejercicio23.titulo(); // Imprimir el banner
          ejercicio23.codigo(); // Ejecutar el método de prueba para comparar resultados
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
      System.out.println("Resultado sin refactorizar: " + noRefactor());
      System.out.println();
      Ref();
      System.out.println("Resultado refactorizado: " + refactor());
      System.out.println();
      test();
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 23:\n\nSeparación de lógica de cálculo:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ23");
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

  double noRefactor() {
      final double precioBase;
      precioBase = cantidad * precio;
      return precioBase;
  }

  double refactor() {
      final int precioBase = cantidad * precio;
      final double descuento;
      if (precioBase > 1000) {
          descuento = 0.9;
      } else {
          descuento = 0.95;
      }
      return precioBase * descuento;
  }

  void test() {
      System.out.println("Comparación de resultados:");
      System.out.println();
      System.out.println("Resultado sin refactorizar: " + noRefactor());
      System.out.println("Resultado refactorizado: " + refactor());
  }
}
