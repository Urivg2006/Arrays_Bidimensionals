import java.util.Scanner;
import java.util.Random;


public class Arraybi4 {

    public static void main(String[] args) {
            Scanner teclat = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Introduir valor n: ");
            int n= teclat.nextInt();
            int aleatori;
            int matriu [][] = new int [n][n];
            int contador=0;
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu.length; j++) {
                    aleatori= rand.nextInt(20);
                    matriu [i][j] = aleatori ;
                }
             }
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    System.out.printf("%3d", matriu[i][j]);
                    System.out.print(" "); 
                }
                System.out.println();
                
            }
                System.out.println("Introduir numero a contar: ");
                int num = teclat.nextInt();
                for (int i = 0; i < matriu.length; i++) {
                    for (int j = 0; j < matriu.length; j++) {
                        if (num==matriu[i][j]) {
                            contador++;
                        }
                        
                    }
                    
        }
       System.out.println("El numero " + num + "surt " + contador + " cops");
    }
}