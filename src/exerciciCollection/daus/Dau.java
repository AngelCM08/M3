package exerciciCollection.daus;

import java.util.*;

public class Dau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rand;

        System.out.print("Quantes vegades vols llançar els daus? ");
        int cops = sc.nextInt();

        //Exercici de la freqüència de llançament de dos daus amb List i el mètode Collecions.frequency()
        List<Integer> freqList = new ArrayList<Integer>();

        //Exercici de la freqüència de llançament de dos daus amb Map
        Map<Integer,Integer> freqMap = new HashMap<>();

        //Llançament de daus
        for(int i=0; i<cops; i++){
            rand = rd.nextInt(6)+1;
            rand += rd.nextInt(6)+1;
            freqList.add(rand);
            freqMap.put(rand,(freqMap.containsKey(rand)) ? freqMap.get(rand)+1 : 1);
        }

        //Resultat List
        System.out.println("Llançament...\nResultat");
        for (int i=2; i<=12; i++) {
            System.out.println(i+" --> "+ Collections.frequency(freqList, i)+" vegades");
        }
        System.out.println("\n***************************************************\n");

        //Resultat Map
        System.out.println("Llançament...\nResultat");
        System.out.println(freqMap);

    }
}