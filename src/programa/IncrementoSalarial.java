
package programa;

import java.util.Scanner;


public class IncrementoSalarial {
    private int sueldo;
    private int años;

    public IncrementoSalarial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu sueldo: ");
        sueldo = sc.nextInt();
        System.out.println("Ingresa tu antigüedad en la empresa en meses: ");
        años = sc.nextInt();
    }

    public double calcularIncrementoSalarial() {
        if (años < 12) {
            double incremento = sueldo * 0.05;
            sueldo += incremento;
        } else if (años >= 12 && años < 24) {
            double incremento = sueldo * 0.07;
            sueldo += incremento;
        } else if (años >= 24 && años < 60) {
            double incremento = sueldo * 0.10;
            sueldo += incremento;
        } else if (años >= 60 && años < 120) {
            double incremento = sueldo * 0.15;
            sueldo += incremento;
        } else if (años >= 120) {
            double incremento = sueldo * 0.15;
            sueldo += incremento;
        }
        return sueldo;
    }

    public void imprimirSueldoConIncremento() {
        double sueldoConIncremento = calcularIncrementoSalarial();
        System.out.println("Tu sueldo con incremento salarial es: " + sueldoConIncremento);
    }
}
