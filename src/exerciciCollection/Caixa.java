package exerciciCollection;

import java.util.*;

public class Caixa {
    List<Llapis> caixa = new ArrayList<Llapis>(10);
    Random rd = new Random();

    public void omplir(String op){
        switch (op){
            case "c":
                for(int i=0; i<10; i++){
                    caixa.add(new Llapis(rd.nextInt(8)));
                }
                break;

            case "cg":
                for(int i=0; i<10; i++){
                    caixa.add(new Llapis(rd.nextInt(8),(float)Math.round(rd.nextFloat(0.1f,3f)*10)/10));
                }
                break;
        }
    }

    public String toScreen() {
        String text="";
        text += "Imprimir amb for:\n";
        for(int i=0; i<caixa.size(); i++){
            text += caixa.get(i).toString()+"\n";
        }

        text += "\nImprimir amb foreach:\n";
        for (Llapis ll: caixa) {
            text += ll.toString()+"\n";
        }

        text += "\nImprimir amb Iterator:\n";
        Iterator<Llapis> it = caixa.iterator();

        while(it.hasNext()){
            text += it.next().toString()+"\n";
        }
        return text;
    }

    public void ordenarColor(){
        Collections.sort(caixa);
    }

    public void ordenarGruix(){
        Collections.sort(caixa, new Comparator<Llapis>(){
            @Override
            public int compare(Llapis ll1, Llapis ll2) {
                if(ll1.getGruix() > ll2.getGruix()) return 1;
                else if(ll1.getGruix() < ll2.getGruix()) return -1;
                else return 0;
            }
        });
    }
}