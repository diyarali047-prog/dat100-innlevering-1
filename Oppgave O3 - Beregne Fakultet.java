import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn et heltall n: ");
        int n = input.nextInt();

        int fakultet = 1;

        for (int i = 1; i <= n; i++) {
            fakultet = fakultet * i;
        }

        System.out.println(n + "! = " + fakultet);
    }
}
