
package programa;

import java.util.Scanner;


public class calificaciones{
    private int[] calificaciones;
    private int n;

    public calificaciones(int n) {
        calificaciones = new int[n];
        this.n = n;
    }

    public void obtenerCalificaciones() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la calificación del alumno " + (i+1) + ": ");
            calificaciones[i] = sc.nextInt();
        }
    }

    public double calcularCalificacionMedia() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += calificaciones[i];
        }
        double media = (double) suma / n;
        return media;
    }

    public int obtenerCalificacionMasBaja() {
        int min = calificaciones[0];
        for (int i = 1; i < n; i++) {
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }
        return min;
    }

    public int obtenerCalificacionMasAlta() {
        int max = calificaciones[0];
        for (int i = 1; i < n; i++) {
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
        }
        return max;
    }
}
