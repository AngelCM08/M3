package exerciciCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Crea dues caixes de llapissos.
        Caixa caixa1 = new Caixa();
        Caixa caixa2 = new Caixa();

        //Omple una caixa amb 10 llapisos de diferents colors (random)
        caixa1.omplir("c");
        //Omple l'altre caixa amb 10 llapissos amb diferents colors i de diferents gruixos (random)
        caixa2.omplir("cg");

        //Imprimeix per la consola la informació dels llapissos que hi ha a les dues caixes. Usa recorreguts amb diferents tècniques.
        System.out.println("Caixa1:\n"+caixa1.toScreen()+"\n\nCaixa2:\n"+caixa2.toScreen());

        //Ordena els llapissos per color del més gran al més petit.
        caixa1.ordenarColor();
        caixa2.ordenarColor();

        System.out.println("Caixa1:\n"+caixa1.toScreen()+"\n\nCaixa2:\n"+caixa2.toScreen());

        //Ordena els llapissos per gruix amb una classe anònima i un Comparator
        caixa1.ordenarGruix();
        caixa2.ordenarGruix();

        System.out.println("Caixa1:\n"+caixa1.toScreen()+"\n\nCaixa2:\n"+caixa2.toScreen());

        //Crea una LinkedList que contingui els llapissos de la caixa 2.
        List<Llapis> linkCaixa = new LinkedList<>(caixa2.caixa);

        //Afegeix també a aquesta LinkedList els llapissos de la caixa 1.
        linkCaixa.addAll(caixa1.caixa);

        //Imprimeix el contingut de la LinkedList
        System.out.println("\nLinked amb caixa 2 i 1:");
        for (Llapis ll: linkCaixa) {
            System.out.println(ll.toString());
        }

        //Crea una altra caixa de llapissos amb els llapissos de la LinkedList però que no n'hi hagi de repetits a dins.
        Set<Llapis> llapisSet = new HashSet<>(linkCaixa);
        //Imprimeix el contingut del Set
        System.out.println("\nHashSet (Linked sense repeticions):");
        for (Llapis ll: llapisSet) {
            System.out.println(ll.toString());
        }

        //Crea el següent Map i observa el comportament del mètode put:

        Map<Integer,String> map_colors = new HashMap<>();
        //Afegim entrades al map
        map_colors.put(0,"Negre");
        map_colors.put(1,"Vermell");
        map_colors.put(2,"Groc");
        map_colors.put(3,"Verd");
        map_colors.put(4,"Verd");
        map_colors.put(3,"Blanc");

        /**
         *  Sortida: {0=Negre, 1=Vermell, 2=Groc, 3=Blanc, 4=Verd}
         *
         *  Explica què passa amb el color verd i amb la clau 3. Perquè?
         *  Com es repeteix la clau 3 y el color verd s'elimina l'opció.
        */
        //Imprimeix per pantalla, utilitzant un bucle for, tota la imformació del Map (clau i valor)
        System.out.println(map_colors);

        //Imprimeix per pantalla, utilitzant un bucle for, només els valors del Map
        System.out.println(map_colors.values());

    }
}
