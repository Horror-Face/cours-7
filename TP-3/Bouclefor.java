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
                        if (height == 0) {
                            System.out.println("erreur, Entrer vide.");

                        }

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

                    showRect(height, length);

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
                                    System.out.println("Entré invalide");
                                    break;
                            }
                        }

                    } while (!valid);

                    break;
                case 2:
                    valid = false;
                    do {
                        System.out.print("Entrer une valeur de hauteur impaire: ");
                        int diamondHeight = sc.nextInt();

                        if (diamondHeight % 2 == 0) {
                            System.out.println("La hauteur doit être un nombre impair.");
                            continue;
                        } else {
                            if (diamondHeight <= 0) {
                                System.out.println("Valeur ne peux pas être négative ou 0.");
                                continue;
                            } else {
                                if (diamondHeight == 0) {
                                    System.out.println("Valeur inexsistente, veuiller en entré une.");
                                    continue;
                                } else {
                                    if (diamondHeight > 79) {
                                        System.out.println("Limite de 79 ligne dépassé.");
                                        continue;
                                    } else {
                                        if (diamondHeight < 3) {
                                            System.out.println("minimum de trois requis.");
                                            continue;
                                        } else {
                                            valid = true;
                                        }
                                    }
                                }

                            }

                        }
                        while (!valid)
                            ;

                        // losange
                        showDiam(diamondHeight);
                        valid = true;
                    }

                    while (!valid);
                    break;
                case 3:
                    int lines = 8;
                    showSupr(lines);
                    break;
                case 5:
                    break;
            }
        } while (choice != 5);

        System.out.println("bye");
        sc.close();
    }
    

    public static void showSupr(int lines) {
        System.out.println("Motif surprise!");

        for (int i = lines; i >= 1; i--) {
            for (int j = lines; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= lines; i++) {
            for (int j = lines; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void showDiam(int diamondHeight) {
        int spaces = diamondHeight / 2;
        for (int i = 1; i <= diamondHeight; i += 2) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
        }
        spaces = 1;
        for (int i = diamondHeight - 2; i >= 1; i -= 2) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
        }
    }

    public static void showRect(int height, int length) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < length; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}