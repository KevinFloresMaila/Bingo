package com.proyecto2;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[][] bingo = new int[5][5];

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                int numero = random.nextInt(75) + 1;

                for (int x = 0; x < 5; x++) {

                    for (int y = 0; y < 5; y++) {

                        if (bingo[x][y] == numero) {

                            numero = random.nextInt(75) + 1;

                            x = 0;
                            y = 0;
                        }
                    }
                }

                bingo[i][j] = numero;
            }
        }

        System.out.println("===== BINGO =====");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(bingo[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.print("\nIngrese fila (0-4): ");
        int filaX = sc.nextInt();

        System.out.print("Ingrese columna (0-4): ");
        int columnaX = sc.nextInt();

        bingo[filaX][columnaX] = -1;

        System.out.println("\n===== TABLA ACTUALIZADA =====");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (bingo[i][j] == -1) {
                    System.out.print("X\t");
                }
                else {
                    System.out.print(bingo[i][j] + "\t");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}