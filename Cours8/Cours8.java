package Cours8;

import java.util.Scanner;
import java.nio.channels.Pipe.SourceChannel;

public class Cours8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] tableau1 = { 4, 3, 22, 110, 264, 16};
        //index tableau =  0 /1  /2   /3   /4  /5

        System.out.println("Tableau droit: ");
        for(int i = 0;i < tableau1.length;i++){
        System.out.println(tableau1[i]);
        }

        System.out.println("tableau inversé: ");
        for(int i = tableau1.length -1; i >= 0; i--){
            System.out.println(tableau1[i]);
        }


        int[] tableau2 = new int[2];
        tableau2[0] = 100;
        tableau2[1] = 10;        
        tableau2[2] = 20;
        sc.close();
    }
}
