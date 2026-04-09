import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class FuncionsArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        funcio1();
        funcio2();
       funcio3();
       funcio4();
    }
    
    public static void funcio1() {
        int [] array = new int [100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            
        }
        for (int i = 0; i < array.length; i++) {
            if (i%10==0) {
                System.out.println("");
            }
            System.out.print(" " +array[i]);
        }
        System.out.println("");
    }
    
    public static void funcio2() {
        Scanner entrada = new Scanner(System.in);
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introdueix un numero per a la posició" +(i+1));
            array[i]=entrada.nextInt();
            
        }
        System.out.println("Contingut:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("La posicio " + i + " conté " + array[i]);
            
        }
    }
    public static void funcio3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quin tamany vols que tingui l'array?");
        int [] array = new int [entrada.nextInt()];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rd.nextInt(10);
        }
        System.out.println("El contingut del array es: " + Arrays.toString(array));
    }
       public static void funcio4() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Quin tamany vols que tingui l'array?");
            int [] array = new int [entrada.nextInt()];
            Random rd = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i]=rd.nextInt(100);
            }
            System.out.println("Quin numero vols buscar?");
            int numero_buscat= entrada.nextInt();
            System.out.println("El contingut de l'array és: " + Arrays.toString(array));
            byte contador=0;
            for (int i = 0; i < array.length; i++) {
            if (array[i]==numero_buscat) {
                contador++;
            } 
           }
            if (contador==0) {
                System.out.println("No hi ha cap numero: " + numero_buscat);
            }else {
                System.out.println("Hi han " + contador + " numeros " + numero_buscat);
            }
    }
      
    
}
