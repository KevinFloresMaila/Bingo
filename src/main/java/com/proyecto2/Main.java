package com.proyecto2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

          String[][] bingo;
        bingo =new String [5][5];
        boolean[] generado=new boolean[101];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                int aux;
            do{
                aux=(int)(Math.random()*100)+1;
             } while(generado[aux]);
            
             generado[aux]=true;
            
            bingo[i][j] = String.valueOf(aux);
            }
        }
    
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }
            System.out.println();
        }
        while (true) {
            System.out.println("Ingrese una fila (del 1 al 5) o presione 0 para SALIR: ");
            int fila = sc.nextInt();
            if(fila==0){
                System.out.println("Gracias por jugar al bingo");
                break;
            }

            System.out.println("Ingrese una columna (del 1 al 5) o presione 0 para SALIR: ");
            int columna = sc.nextInt();
            if(columna==0){
                System.out.println("Gracias por jugar al bingo");
                break;
                }

            int filaleer=fila-1;
            int columnaleer=columna-1;

            if(filaleer<0||filaleer>=5||columnaleer<0||columnaleer>=5){
                System.out.println("El numero ingresado no es valido,Porfavor escoga del 1 al 5");

            continue;
            }

            bingo[filaleer][columnaleer] = "X";

            for (int i = 0; i < bingo.length; i++) {
                for (int j = 0; j < bingo[i].length; j++) {
                  System.out.print(bingo[i][j] + "\t");
                }
               System.out.println();
            }
        }
        sc.close();
        } 
    }