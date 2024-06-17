package Ejercicios;
public class Ejercicio35 {
  private double unidades = 13;
  private double precioUnitario = 100;

  public static void main(String[] args) {
      try {
          Ejercicio35 ejercicio35 = new Ejercicio35(); // Crear una instancia de Ejercicio35
          ejercicio35.titulo(); // Imprimir el banner
          ejercicio35.codigo(); // Ejecutar el método de prueba para comparar resultados
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
      System.out.println(descuentoSource(unidades, precioUnitario));
      System.out.println();
      Ref();
      System.out.println(descuentoRefactor(unidades, precioUnitario));
      System.out.println();
      test();
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 35:\n\nUso de constantes:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ35");
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

  double descuentoSource(double unidades, double precioUnitario) {
      return unidades * 0.95 * precioUnitario;
  }

  static final double DESCUENTO_DIRECTO = 0.95;

  double descuentoRefactor(double unidades, double precioUnitario) {
      return unidades * DESCUENTO_DIRECTO * precioUnitario;
  }

  void test() {
      System.out.println("Comparación de resultados:");
      System.out.println();
      System.out.println(descuentoSource(unidades, precioUnitario));
      System.out.println(descuentoRefactor(unidades, precioUnitario));
  }
}
