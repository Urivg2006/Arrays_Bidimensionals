import java.util.Random;


public class Arraybi3 {

    public static void main(String[] args) {
        int dades [][] = new int [4][6];
        int comptador = 0; 
        Random r = new Random();
        int max=0;
        int min=201;
        for (int i =0 ; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                int aleatori = r.nextInt(200);
                dades[i][j] = aleatori;
                    if (aleatori > max) {
                        max = aleatori; 
                    }
        
                    if (aleatori < min) {
                        min = aleatori;
                    }
            }
        }
                for (int i = 0; i < dades.length; i++) {
                    for (int j = 0; j < dades[i].length; j++) {
                        System.out.printf("%3d", dades[i][j]);
                        System.out.print(" "); 
                    }
                    System.out.println();
        
                }
                int suma=0;
                for (int i = 0; i < dades.length; i++) {
                   for (int j = 0; j < dades[i].length; j++) {
                        suma=suma+dades[i][j];
                   }
                }
                    System.out.println("El maxim es: " + max);
                    System.out.println("El minim es: " + min);
                    System.out.println("La suma es: " + suma);
            }
        }