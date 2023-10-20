package org.generation.live3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de mangos: ");
        int mangos = scanner.nextInt();

        System.out.print("Introduce el número de naranjas: ");
        int naranjas = scanner.nextInt();

        MangosNaranjas cajas = new MangosNaranjas(mangos, naranjas);
        cajas.imprimir();

        scanner.close();
    }
}
