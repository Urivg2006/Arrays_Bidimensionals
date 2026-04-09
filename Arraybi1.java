
public class Arraybi1 {

    public static void main(String[] args) {
        int dades [][] = new int [10][10];
int comptador = 1; 
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
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