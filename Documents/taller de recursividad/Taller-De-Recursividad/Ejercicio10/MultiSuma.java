import java.util.Scanner;

public class MultiSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int resultado = 0;

        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        System.out.println("Resultado: " + resultado);
    }
}// la variable Big O es O(b)