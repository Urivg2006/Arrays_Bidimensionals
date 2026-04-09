import java.util.Scanner;

public class Arraybi2 {

    public static void main(String[] args) {
        int dades [][] = new int [5][5];
    int comptador = 0; 
    for (int i =0 ; i < dades.length; i++) {
    if (i>0) {
        comptador=comptador-4;
    }
    for (int j = 0; j < dades.length; j++) {
        dades[i][j] = comptador;
        comptador++; 
    }
}
        for (int i = 0; i < dades.length; i++) {
            for (int j = 0; j < dades[i].length; j++) {
                System.out.printf("%3d", dades[i][j]);
                System.out.print(" "); 
            }
            System.out.println();
        }
    }
}