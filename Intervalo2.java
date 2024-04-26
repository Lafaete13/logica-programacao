import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        // Imprime o resultado para cada caso de teste
        System.out.println(dentroIntervalo+" in");
        System.out.println(foraIntervalo+" out" );

        scanner.close();
    }
}
