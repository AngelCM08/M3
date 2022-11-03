package Exemples;

import java.util.Random;
import java.util.Scanner;

public class Daus {
    public static void main(String[] args) {
        int[] resultats = new int[11];
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rand;

        System.out.print("Quantes vegades vols llançar els daus? ");
        int cops = sc.nextInt();

        for(int i=0; i<cops; i++){
            rand = rd.nextInt(6)+1;
            rand += rd.nextInt(6)+1;
            System.out.println(rand);
            resultats[rand-2]++;
        }

        System.out.println("Llançament...\nResultat");
        for(int i=0; i<resultats.length; i++){
            System.out.println((i+2)+" -->\t"+resultats[i]+"vegades");
        }
    }
}