import java.util.*;
import java.time.LocalDate;

class Taller {

    public static void tecla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPresiona cualquier tecla para continuar...");
        sc.nextLine();
    }
    //VOID
    public static void diasaño() {
        System.out.println("Un año tiene 365 días, un año bisiesto tiene 366 días.");
    }

    public static void fecha() {
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha actual: " + fecha);
    }

    //INT
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int c, int d) {
        return c - d;
    }

    //DOUBLE
    public static double promedio(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static double area(double r) {
        double pi = Math.PI;
        return pi * (r * r);
    }

    //STRING
    public static String saludo(String nombre) {
        return "Hola " + nombre;
    }

    public static String mayuscula(String texto) {
        return texto.toUpperCase();
    }

    //BOOLEANO
    public static boolean positivo(int num) {
        return num > 0;
    }

    public static boolean par(int num1) {
        return num1 % 2 == 0;
    }

    public static void menu() {
        System.out.println("\nMENÚ");
        System.out.println("\nVOID");
        System.out.println("1. Días del año");
        System.out.println("2. Fecha actual");
        System.out.println("\nINT");
        System.out.println("3. Sumar dos números");
        System.out.println("4. Restar dos números");
        System.out.println("\nDOUBLE");
        System.out.println("5. Promedio de dos números");
        System.out.println("6. Calcular área de circulo");
        System.out.println("\nSTRING");
        System.out.println("7. Saludo con tu nombre");
        System.out.println("8. Texto a mayúscula");
        System.out.println("\nBOOLEANO");
        System.out.println("9. Número positivo");
        System.out.println("10.Número par");
        System.out.println("\n0. SALIR");
        System.out.print("Seleccione una opción: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");

            switch (opcion) {
                case 1:
                    diasaño();
                    tecla();
                    break;
                case 2:
                    fecha();
                    tecla();
                    break;
                case 3:
                    System.out.print("Digite el 1er número: ");
                    int a = sc.nextInt();
                    System.out.print("Digite el 2do número: ");
                    int b = sc.nextInt();
                    System.out.println("El resultado de la suma es: " + sumar(a, b));
                    tecla();
                    break;
                case 4:
                    System.out.print("Digite el 1er número: ");
                    int c = sc.nextInt();
                    System.out.print("Digite el 2do número: ");
                    int d = sc.nextInt();
                    System.out.println("El resultado de la resta es: " + restar(c, d));
                    tecla();
                    break;
                case 5:
                    System.out.print("Digite el primer número: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Digite el segundo número: ");
                    double n2 = sc.nextDouble();
                    System.out.println("El promedio de los dos números es: " + promedio(n1, n2));
                    tecla();
                    break;
                case 6:
                    System.out.print("Digite el radio del círculo: ");
                    double r = sc.nextDouble();
                    System.out.println("El área del ciruclo es: " + area(r));
                    tecla();
                    break;
                case 7:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println(saludo(nombre));
                    tecla();
                    break;
                case 8:
                    System.out.print("Ingrese el texto: ");
                    String texto = sc.nextLine();
                    System.out.println("Resultado: " + mayuscula(texto));
                    tecla();
                    break;
                case 9:
                    System.out.print("Digite un número: ");
                    int num = sc.nextInt();
                    if (positivo(num))
                        System.out.println("El número es positivo");
                    else
                        System.out.println("El número no es positivo");
                    tecla();
                    break;
                case 10:
                    System.out.print("Digite un número: ");
                    int num1 = sc.nextInt();
                    if (par(num1))
                        System.out.println("El número " +num1 +" es par");
                    else
                        System.out.println("El número " +num1 +" es impar");
                    tecla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("ERROR, verifique y digite nuevamente");
            }
        } while (opcion != 0);

        sc.close();
    }
}