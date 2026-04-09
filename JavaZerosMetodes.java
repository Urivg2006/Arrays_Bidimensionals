import java.util.Random;
import java.util.Scanner;
  
public class JavaZerosMetodes {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[][] matriu = new char[5][5];
        inicialitzar(matriu);
        generarZeros(matriu);
        int intents = 8;
        int zerosTrobats = 0;
        while (intents > 0 && zerosTrobats < 5) {
            System.out.println("\nEt queden " + intents + " intents.");
            int fila = llegirNumero(entrada, "fila", 5);
            int columna = llegirNumero(entrada, "columna", 5);
            boolean encertat = jugar(matriu, fila, columna);
            if (encertat) {
                zerosTrobats++;
            }

            intents--;
        }
        if (zerosTrobats == 5) {
            System.out.println("\u001B[32mFELICITATS! Has trobat tots els zeros.\u001B[0m");
        } else {
            System.out.println("\u001B[31mGAME OVER. T'has quedat sense intents.\u001B[0m");
        }
    }

    /**
     * Emplena la matriu amb tot de caràcters 'X'
     *
     * @param matriu una matriu de caràcters que representa el tauler
     */
    public static void inicialitzar(char[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = 'X';
            }
        }
        System.out.print("\u001B[33m  1 2 3 4 5\u001B[0m");
        for (int i = 0; i < matriu.length; i++) {
            System.out.println("");
            System.out.print("\u001B[33m" + (i + 1) + " \u001B[0m");
            for (int j = 0; j < matriu.length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
        }
        System.out.println("");

    }

    /**
     * Posa aleatòriament zeros a 5 posicions de la matriu
     *
     * @param matriu una matriu de caràcters que representa el tauler
     */
    public static void generarZeros(char[][] matriu) {
        Random random = new Random();
        byte comptador = 0;
        while (comptador < 5) {
            int fila = random.nextInt(5);
            int columna = random.nextInt(5);
            if (matriu[fila][columna] != 0) {
                matriu[fila][columna] = '0';
                comptador++;
            }
        }
    }

    /**
     * Amb el tauler passat com a paràmetre, demana com a màxim 8 cops fila i
     * columna a l'usuari. Un cop exhaurides les 8 tirades o trobats els 5 zeros
     * acaba
     *
     * @param matriu
     * @param columna
     * @param fila
     */
    public static boolean jugar(char[][] matriu, int fila, int columna) {
        boolean encert = false;
        if (matriu[fila][columna] == '0') {
            System.out.println("\u001B[32m>>>CORRECTE! Has trobat un zero!\u001B[0m");
            matriu[fila][columna] = 'E'; // E de Encertat
            encert = true;
        } else if (matriu[fila][columna] == 'E' || matriu[fila][columna] == 'D') {
            System.out.println("\u001B[31m>>> Ja havies obert aquesta casella! Perds el torn.\u001B[0m");
        } else {
            System.out.println("\u001B[31m>>> INCORRECTE! No hi ha res.\u001B[0m");
            matriu[fila][columna] = 'D';
        }
        imprimir(matriu);
        return encert;
    }

    /**
     * Imprimeix el tauler de joc. Només s'imprimeix zeros si l'usuari els ha
     * trobat. Si un zero s'ha trobat hi haurà emmagatzemada una 'E' de encertat
     * Si una casella s'ha destapat ino hi havia un zero hi haurà una 'D' de
     * destapat
     *
     * @param matriu la matriu de caràcters que representa el tauler
     */
    public static void imprimir(char[][] matriu) {
        System.out.print("\u001B[33m  1 2 3 4 5\u001B[0m");
        for (int i = 0; i < matriu.length; i++) {
            System.out.println("");
            System.out.print("\u001B[33m" + (i + 1) + " \u001B[0m");
            for (int j = 0; j < matriu.length; j++) {
                if (matriu[i][j] == '0') {
                    System.out.print("X ");
                }
                else if (matriu[i][j] == 'E') {
                        System.out.print("\u001B[32m0 \u001B[0m");
                    }else if (matriu[i][j] == 'D'){
                        System.out.print("\u001B[31mD \u001B[0m");
                    }else {
                System.out.print(matriu[i][j] + " ");
                } 
            }    
            }
        System.out.println("");
        }


    /**
     * Demana a l'usuari un número que sigui correcte. Si no ho és el demana
     * fins que sigui correcte.
     *
     * @param entrada un escaner amb l'entrada de dades des del teclat
     * @param maxim un enter per indicar que el número és correcte si està entre
     * 1 i màxim per exemple
     * @return la fila o columna introduida per l'usuari
     */
    public static int llegirNumero(Scanner entrada, String tipus, int maxim) {
        int numero = -1;
        int contador = 0;
        do {
            System.out.println("Introdueix la " + tipus + " <1-" + maxim + ">:");
            while (!entrada.hasNextInt()) {
                System.out.println("\u001B[31mError: No és un número.\u001B[0m");
                entrada.next();
            }
            numero = entrada.nextInt();
            if (numero < 1 || numero > maxim) {
                System.out.println("\u001B[31mNúmero fora de rang.\u001B[0m");
            }
            contador++;
        } while (numero < 1 || numero > maxim);
        return numero - 1;
    }
}