
package programa;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Ingresa una opción:");
            System.out.println("**************BIENVENIDO*************");
            System.out.println("[1] -- Multiplos");
            System.out.println("[2] -- Secuencia");
            System.out.println("[3] -- Incremento");
            System.out.println("[4] -- notas");
            System.out.println("[5] -- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    multiplos m = new multiplos();
                    m.encontrarMultiplos();
                    break;
                case 2:
                    secuencia s = new secuencia();
                    s.imprimirNumeros();
                    break;
                case 3:
                    IncrementoSalarial i = new IncrementoSalarial();
                    i.calcularIncrementoSalarial();
                    break;
                case 4:
                        
                        System.out.println("Ingrese la cantidad de alumnos: ");
                        int n = sc.nextInt();

                       calificaciones grupo = new calificaciones(n);
                        grupo.obtenerCalificaciones();

                        double media = grupo.calcularCalificacionMedia();
                        int min = grupo.obtenerCalificacionMasBaja();
                        int max = grupo.obtenerCalificacionMasAlta();

                        System.out.println("La calificación media es: " + media);
                        System.out.println("La calificación más baja es: " + min);
                        System.out.println("La calificación más alta es: " + max);


                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

}
