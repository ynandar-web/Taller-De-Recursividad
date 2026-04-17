import java.util.Scanner;

public class SumatoriaFraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }

        System.out.println("La sumatoria es: " + suma);
    }
}
