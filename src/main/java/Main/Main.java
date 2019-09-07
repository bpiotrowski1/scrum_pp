package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dwie liczby: a=");
        a = scanner.nextInt();
        System.out.print(" b=");
        b = scanner.nextInt();

        System.out.println("nwd :" + nwd(a, b));
    }

    private static int nwd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
