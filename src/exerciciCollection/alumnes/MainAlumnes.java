package exerciciCollection.alumnes;

import java.util.*;

public class MainAlumnes {
    public static void main(String[] args) {
        Alumne alumne = new Alumne("Eric", Alumne.Genere.HOME,"09929288PUIG");
        Alumne alumne2 = new Alumne("Anna", Alumne.Genere.DONA,"03429288PUIG");
        Alumne alumne3 = new Alumne("Maria", Alumne.Genere.DONA,"98623568PUIG");
        UF mp3uf4 = new UF("003004","Introducció a la POO");
        UF mp3uf5 = new UF("003005","POO avançada");
        UF mp8uf1 = new UF("003014","Android");

        //Omple una llista d'alumnes (3 alumnes)
        List<Alumne> alumneList = new ArrayList<>();
        alumneList.add(alumne);
        alumneList.add(alumne2);
        alumneList.add(alumne3);

        //Posa diverses notes a tots els alumnes (3 notes per alumne)
        alumneList.set(0,alumne).addNota(mp3uf4,Qualifier.EXCELLENT);
        alumneList.set(0,alumne).addNota(mp3uf5,Qualifier.SATISFACTORI);
        alumneList.set(0,alumne).addNota(mp8uf1,Qualifier.NO_SATISFACTORI);

        alumneList.set(1,alumne2).addNota(mp3uf4,Qualifier.NO_SATISFACTORI);
        alumneList.set(1,alumne2).addNota(mp3uf5,Qualifier.EXCELLENT);
        alumneList.set(1,alumne2).addNota(mp8uf1,Qualifier.SATISFACTORI);

        alumneList.set(2,alumne3).addNota(mp3uf4,Qualifier.EXCELLENT);
        alumneList.set(2,alumne3).addNota(mp3uf5,Qualifier.EXCELLENT);
        alumneList.set(2,alumne3).addNota(mp8uf1,Qualifier.EXCELLENT);

        //Treu el llistat de notes de cada un dels alumnes
        notesAlumnes(alumneList);

        //Treu el llistat d'alumnes amb la seva nota mitja i en ordre alfabètic.
        notesMitjanes(alumneList);

    }

    public static void notesAlumnes(List<Alumne> alumneList){
        for(Alumne a : alumneList) {
            System.out.println(a.getNom());
            System.out.println("-------------");
            a.getNotes().forEach((k,v) -> System.out.printf("%s -> %s%n",k,v));
            System.out.println("-------------");
        }
    }

    public static void notesMitjanes(List<Alumne> alumneList){
        Map<String,Float> notesMitges = new TreeMap<>();
        for(Alumne a : alumneList) {
            float notaM=0;
            for (Map.Entry entry : a.getNotes().entrySet()) {
                Qualifier qf = (Qualifier) entry.getValue();
                notaM += qf.getValor();
            }
            notaM = notaM / a.getNotes().size();
            System.out.printf("Nota mitja de %s és %f%n",a.getNom(), notaM);
            notesMitges.put(a.getNom(),notaM);
        }
    }
}
