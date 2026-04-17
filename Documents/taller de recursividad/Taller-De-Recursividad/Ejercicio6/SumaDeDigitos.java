import java.util.Scanner;

public class SumaDeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        int suma = 0;

        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("Resultado: " + suma);
    }
}
