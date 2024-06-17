package Ejercicios;
public class Ejercicio31 {
  private int horas;
  private int horasExtra;
  private final double horaBase;
  private String tipo;

  public static void main(String[] args) {
      try {
          Ejercicio31 ejercicio31 = new Ejercicio31("Supervisor", 20.0); // Crear una instancia de Ejercicio31
          ejercicio31.titulo(); // Imprimir el banner
          ejercicio31.codigo(); // Ejecutar el método de prueba para comparar resultados
      } catch (Exception e) {
          printError();
      }
  }

  // Métodos de funcionalidad principal
  void codigo() {
      horas = 7;
      horasExtra = 2;
      tipo = "Supervisor";

      titulo1();
      System.out.println("Comparación de resultados:");
      System.out.println();
      NoRef();
      System.out.println("Sueldo antes de refactorizar: " + getSueldoNoRefactor());
      System.out.println();
      Ref();
      System.out.println("Sueldo después de refactorizar: " + getSueldo());
      System.out.println(""); 
  }

  // Métodos de impresión de títulos y mensajes
  private void titulo() {
      System.out.println();
      System.out.println("Patrón de refactorización usual 31:\n\nEncapsulamiento y separación de responsabilidades:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
      System.out.println("RESOLUCIÓN DEL EJ31");
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

  // Métodos originales sin refactorizar
  public double getSueldoNoRefactor() {
      if (tipo.equals("Supervisor")) {
          return horaBase + (horas + horasExtra * 1.40);
      } else if (tipo.equals("Dependiente")) {
          return horaBase + (horas + horasExtra * 1.75);
      }
      return horaBase + (horas + horasExtra * 1.5);
  }

  // Métodos refactorizados
  public String getTipo() {
      return this.tipo;
  }

  public void setTipo(String t) {
      this.tipo = t;
  }

  Ejercicio31(String t, double h) {
      this.tipo = t;
      this.horaBase = h;
  }

  public double getHoraBase() {
      return horaBase;
  }

  public double calculoHoras(int horas, int horasExtra) {
      if (tipo.equals("Supervisor")) {
          return horas + horasExtra * 1.40;
      } else if (tipo.equals("Dependiente")) {
          return horas + horasExtra * 1.75;
      }
      return horas + horasExtra * 1.5;
  }

  public double getSueldo() {
      return getHoraBase() + calculoHoras(horas, horasExtra);
  }

  void test() {
      System.out.println("Comparación de resultados:");
      System.out.println();
      System.out.println("Sueldo antes de refactorizar: " + getSueldoNoRefactor());
      System.out.println("Sueldo después de refactorizar: " + getSueldo());
      System.out.println("");
  }
}
