import java.util.Scanner;

public class Array2D {

    static Scanner teclat = new Scanner(System.in);
    static double[][] matriu = new double[3][15];
    static String[] grups = new String[3];

    public static void main(String[] args) {
        int num = 0;

        for(int i=0; i<grups.length; i++) grups[i] = "Grup " + (i+1);

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Consultar notes grup");
            System.out.println("2. Assignar notes als grups");
            System.out.println("3. Calcular la mitjana");
            System.out.println("4. Calcular la nota maxima ");
            System.out.println("5. Calcular aprovats grup ");
            System.out.println("6. Calcular aprovats total ");
            System.out.println("7. Sortir");
            System.out.print("Tria una opció: ");
            
            num = teclat.nextInt();
            teclat.nextLine(); 

            switch (num) {
                case 1:
                    consultargrup(); 
                    break;
                case 2:
                    assignarDades(); 
                    break;
                case 3:
                    mitjana();
                    break;
                case 4:
                    maxima();
                    break;
                case 5:
                    grups();
                    break;
                case 6:
                    aprovats();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (num != 7);
    }

    // 3. MÈTODES (FUNCIONS)

public static void assignarDades() {
    for (int i = 0; i < matriu.length; i++) {
        System.out.print((i + 1) + ". Introduir NOM del grup: ");
        grups[i] = teclat.nextLine();

        System.out.println("   Introduir notes per a: " + grups[i]);
        for (int j = 0; j < matriu[i].length; j++) {
            System.out.print("   - Nota " + (j + 1) + ": ");
            matriu[i][j] = teclat.nextDouble();
        }
        teclat.nextLine();
    }
}

public static void consultargrup() {
    System.out.print("Quin grup vols veure? ");
    String grupveure = teclat.nextLine();
    boolean trobat = false;

    for (int y = 0; y < grups.length; y++) {
        if (grups[y] != null && grupveure.equalsIgnoreCase(grups[y])) {
            System.out.println("--> Notes del " + grups[y] + ":");
            for (int j = 0; j < matriu[y].length; j++) {
                System.out.println("    Nota " + (j + 1) + ": " + matriu[y][j]);
            }
            trobat = true;
            break; 
        }
    }

    if (!trobat) {
        System.out.println("Error: No s'ha trobat el grup \"" + grupveure + "\"");
    }
}
public static void mitjana() {
double total = 0; 
int comptadorNotes = 0;

for (int i = 0; i < matriu.length; i++) {
    for (int j = 0; j < matriu[i].length; j++) {
        total = total + matriu[i][j]; 
        comptadorNotes++; 
    }
}
if (comptadorNotes > 0) {
        System.out.println("La mitjana global és: " + (total / comptadorNotes));
    } else {
        System.out.println("No hi ha notes introduïdes.");
    }
}
public static void maxima() {
    double max = 0; 
    
    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            if (matriu[i][j] > max) {
                max = matriu[i][j];
            }
        }
    }
    System.out.println("La nota màxima és: " + max);
}
public static void grups() {
    int grupcercar=-1;
    byte aprovat=0;
    System.out.println("Introduiex grup a contar:");
    String grupveure = teclat.nextLine();
    for (int i = 0; i < grups.length; i++) {
         if (grupveure.equalsIgnoreCase(grups[i])) {
             grupcercar=i;
    }
    }
           for (int i = grupcercar ; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            if (matriu[i][j]>=5) {
                aprovat++;
            }
            }
        }
    }
public static void aprovats() {
    int aprovat=0;
    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            if (matriu[i][j]>5) {
                aprovat++;
            }
        }
    }
    System.out.println("Hi han en total " + aprovat);
}
}