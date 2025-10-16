import java.util.Scanner;

public class Bouclefor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice; // variable de contrôle

        do {
            System.out
                    .println("1. Affichage d'un rectangle\n2. Affichange d'un losange\n3. Motif surprise!\n5. Quitter");
            System.out.print("Votre choix : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    boolean valid = false;
                    int height = 0;

                    do {
                        System.out.print("Entrer une valeur de hauteur: ");
                        height = sc.nextInt();

                        if (height <= 0) {
                            System.out.println("valeur ne peuvent pas etre plus petite ou égal à 0");
                        } else {
                            valid = true;
                        }
                    } while (!valid);
                    valid = false;
                    int length = 0;
                    do {
                        System.out.print("Entrer une valeur de longueur: ");
                        length = sc.nextInt();
                        if (height < length) {
                            System.out.println("valeur de longueur ne peux pas être plus grande que la hauteur");
                        } else {
                            if (length <= 0) {
                                System.out.println("valeur ne peuvent pas etre plus petite ou égal à 0");
                            } else {
                                valid = true;
                            }
                        }
                    } while (!valid);

                    for (int y = 0; y < height; y++) {
                        for (int x = 0; x < length; x++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    sc.nextLine();
                    valid = false;
                    char answer = 'l';
                    do {
                        System.out.print("Voulez-vous tourner votre rectangle: Y / N : ");
                        String input = sc.nextLine().trim().toUpperCase();

                        if (!input.isEmpty()) {
                            answer = input.charAt(0);

                            switch (answer) {
                                case 'Y':
                                    for (int y = 0; y < length; y++) {
                                        for (int x = 0; x < height; x++) {
                                            System.out.print("* ");
                                        }
                                        System.out.println();
                                    }
                                    valid = true;
                                    break;
                                case 'N':
                                    
                                    valid = true;
                                    break;
                                default:
                                    System.out.println("T CAVE");
                                    break;
                            }
                        }

                    } while (!valid);

                    break;
            }
        } while (choice != 5);

        System.out.println("bye");
    }
}