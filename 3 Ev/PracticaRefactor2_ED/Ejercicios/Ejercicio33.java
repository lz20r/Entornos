package Ejercicios;
public class Ejercicio33 {
  public static void main(String[] args) {
      try {
          Ejercicio33 ejercicio33 = new Ejercicio33(); // Crear una instancia de Ejercicio33
          ejercicio33.titulo(); // Imprimir el banner
          ejercicio33.codigo(); // Ejecutar el método de prueba para comparar resultados
      } catch (Exception e) {
          printError();
      }
  }

  // Métodos de funcionalidad principal
  void codigo() {
      Date fechafin = new Date();
      Date diasiguiente = new Date(fechafin.getAnio(), fechafin.getMes(), fechafin.getDia() + 1);

      titulo1();
      System.out.println("Comparación de resultados:");
      System.out.println();
      NoRef();
      System.out.println(diasiguiente.toString());
      System.out.println();
      Ref();
      Date diaSiguiente2 = Date.siguienteDia(fechafin);
      System.out.println(diaSiguiente2.toString());
      System.out.println();
      test(diasiguiente, diaSiguiente2); 
      System.out.println("");
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 33:\n\nEncapsulamiento de lógica de negocio en métodos estáticos:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ33");
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

  private void test(Date diasiguiente, Date diaSiguiente2) {
      System.out.println("Comparación de resultados:");
      System.out.println();
      System.out.println(diasiguiente.toString());
      System.out.println(diaSiguiente2.toString());
  }
}

// Clase Date
class Date {
  private int año = 2024;
  private int mes = 4;
  private int dia = 24;

  public Date() {}

  public Date(int año, int mes, int dia) {
      this.año = año;
      this.mes = mes;
      this.dia = dia;
  }

  public int getAnio() {
      return this.año;
  }

  public int getMes() {
      return this.mes;
  }

  public int getDia() {
      return this.dia;
  }

  public String toString() {
      StringBuffer cadena = new StringBuffer();
      cadena.append(getDia() + "/");
      cadena.append(getMes() + "/");
      cadena.append(getAnio());
      return cadena.toString();
  }

  static Date siguienteDia(Date var) {
      return new Date(var.getAnio(), var.getMes(), var.getDia() + 1);
  }
}
