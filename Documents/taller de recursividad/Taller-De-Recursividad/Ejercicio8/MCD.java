import java.util.Scanner;

public class MCD {
    
    public static int calcularMCD(int m, int n) {
        if (n == 0) {
            return m;
        }
        return calcularMCD(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int m = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n = sc.nextInt();

        System.out.println("El MCD es: " + calcularMCD(m, n));
    }
}
