package Ejercicios;
public class Ejercicio28 {
    public static void main(String[] args) {
        try {
            Ejercicio28 ejercicio28 = new Ejercicio28(); // Crear una instancia de Ejercicio28
            ejercicio28.titulo(); // Imprimir el banner
            ejercicio28.codigo(); // Ejecutar el método de prueba para comparar resultados
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
        antesRefactorizar();
        System.out.println();
        Ref();
        despuesRefactorizar();
        System.out.println();
    }

    // Métodos de impresión de títulos y mensajes
    private void titulo() {
        System.out.println();
        System.out.println("Patrón de refactorización usual 28:\n\nSeparación de responsabilidades:\n Refactoriza métodos para mejorar su claridad y mantenimiento.\n");
        System.out.println("RESOLUCIÓN DEL EJ28");
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

    public void antesRefactorizar() {
        // Antes de la refactorización
        System.out.println("Estado del código antes de la refactorización:");

        // Clase tipoEmpleado antes de la refactorización
        class tipoEmpleado {
            private String tipo;
            private double horabase;

            public tipoEmpleado(String t, double h) {
                this.tipo = t;
                this.horabase = h;
            }

            public String getTipo() {
                return tipo;
            }

            public double getHorabase() {
                return horabase;
            }
        }

        // Clase Empleado antes de la refactorización
        class Empleado {
            private int horas;
            private int horasextra;
            private tipoEmpleado tipo;

            public double calculoHoras() {
                if (tipo.getTipo().equals("Supervisor")) {
                    return horas + horasextra * 1.40;
                }
                if (tipo.getTipo().equals("Dependiente")) {
                    return horas + horasextra * 1.75;
                }
                return horas + horasextra * 1.5;
            }

            public double getSueldo() {
                return tipo.getHorabase() * calculoHoras();
            }
        }

        // Creación de objetos y llamadas a métodos antes de la refactorización
        tipoEmpleado tipo = new tipoEmpleado("Supervisor", 10.0);
        Empleado empleado = new Empleado();
        empleado.tipo = tipo;
        empleado.horas = 8;
        empleado.horasextra = 2;
        double sueldo = empleado.getSueldo();
        System.out.println("Sueldo antes de refactorizar: " + sueldo);
    }

    public void despuesRefactorizar() {
        System.out.println("Estado del código después de la refactorización:");

        // Clase tipoEmpleado después de la refactorización
        class tipoEmpleado {
            private String tipo;
            private double horabase;

            public tipoEmpleado(String t, double h) {
                this.tipo = t;
                this.horabase = h;
            } 

            public double getHorabase() {
                return horabase;
            }

            public double calculoHoras(int horas, int horasextra) {
                if (tipo.equals("Supervisor")) {
                    return horas + horasextra * 1.40;
                }
                if (tipo.equals("Dependiente")) {
                    return horas + horasextra * 1.75;
                }
                return horas + horasextra * 1.5;
            }
        }

        // Clase Empleado después de la refactorización
        class Empleado {
            private int horas;
            private int horasextra;
            private tipoEmpleado tipo;

            public double getSueldo() {
                return tipo.getHorabase() * tipo.calculoHoras(horas, horasextra);
            }
        }

        // Creación de objetos y llamadas a métodos después de la refactorización
        tipoEmpleado tipo = new tipoEmpleado("Supervisor", 10.0);
        Empleado empleado = new Empleado();
        empleado.tipo = tipo;
        empleado.horas = 8;
        empleado.horasextra = 2;
        double sueldo = empleado.getSueldo();
        System.out.println("Sueldo después de refactorizar: " + sueldo);
    }
}
