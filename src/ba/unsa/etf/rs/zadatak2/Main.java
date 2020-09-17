package ba.unsa.etf.rs.zadatak2;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int n) {
        int broj = n;
        int suma = 0;
        while(true) {
            if (broj == 0) break;
            int cifre = broj % 10;
            suma = suma + cifre;
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n:");
        int n = 0;
        Scanner ulaz = new Scanner(System.in);

        n = ulaz.nextInt();

        for (int i = n - 1; i >= 0; i--) {

            switch (i % sumaCifara(n)) {
                case 0:
                    System.out.println(i);
                    break;
            }
        }
    }

}
