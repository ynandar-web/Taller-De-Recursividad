import java.util.Scanner;

public class SumaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de filas: ");
        int m = sc.nextInt();

        System.out.print("Ingrese número de columnas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];
        int suma = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma total de la matriz es: " + suma);
    }
}// la variable Big O es O(n²)