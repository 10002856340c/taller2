
package programa;

import java.util.Scanner;

public class multiplos {
    public void encontrarMultiplos() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sumamulti2 = 0;
        int sumamulti3 = 0;
        int sumamulti5 = 0;

        while (a < 3) {
            System.out.println("ingresa un numero entero que sean multiplos de 2,3 o 5:  ");
            System.out.println("Recuerda que tienes 3 oportunidades  : ");
            int numerou = sc.nextInt();

            if (numerou % 2 == 0) {
                System.out.println("el numero " + numerou + " es multiplo de 2");
                sumamulti2 += numerou;
            } else if (numerou % 5 == 0) {
                System.out.println("el numero " + numerou + " es multiplo 5");
                sumamulti5 += numerou;
            } else if (numerou % 3 == 0) {
                System.out.println("el numero " + numerou + " es multiplo 3");
                sumamulti3 += numerou;
            }

            if (sumamulti2 != 0 && sumamulti3 != 0 && sumamulti5 != 0) {
                break;
            } else {
                a++;
            }
            if (a == 3) {
                System.out.println("la suma de los multiplos de 2 es : " + sumamulti2);
                System.out.println("la suma de los multiplos de 3 es : " + sumamulti3);
                System.out.println("la suma de los multiplos de 5 es : " + sumamulti5);
            }
        }
    }
}