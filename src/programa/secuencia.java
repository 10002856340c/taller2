
package programa;

public class secuencia {
    public void imprimirNumeros() {
        for (int j = 10; j < 100; j += 10) {
            if (j == 40 || j == 70) {
                continue;
            }
            System.out.println(j + "");
        }
    }
}