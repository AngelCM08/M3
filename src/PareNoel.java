package src;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PareNoel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/santako.txt"));
        List<Pattern> patrons = new ArrayList<>();
        patrons.add(Pattern.compile("\\*<]:-DOo"));
        patrons.add(Pattern.compile(">:o\\)"));
        patrons.add(Pattern.compile("<]:-D"));
        String[] noms = {"Papa Noel", "Ren", "Follet"};
        String line;

        //Primera forma.
        while ((line = br.readLine()) != null) {
            int[] cantidad = new int[]{0, 0, 0};
            for (int i = 0; i < patrons.size(); i++) {
                Matcher m = patrons.get(i).matcher(line);
                while (m.find()) {
                    cantidad[i]++;
                }
                cantidad[2] = cantidad[2]-cantidad[0];
            }
            for(int i=0; i<cantidad.length; i++){
                if(cantidad[i] > 0) {
                    System.out.print(noms[i] + " (" + cantidad[i] + ") ");
                }
            }
            System.out.println();
        }

        BufferedReader br2 = new BufferedReader(new FileReader("src/santako.txt"));
        //Segona forma.
        String[] patronString = {"\\*<]:-DOo", ">:o\\)", "<]:-D"};

        System.out.println("\nSegona Forma");

        while ((line = br2.readLine()) != null) {
            line = line.concat(".");
            int[] cantidad = new int[]{0, 0, 0};
            for (int i = 0; i < patrons.size(); i++) {
                cantidad[i] = line.split(patronString[i]).length-1;
            }
            cantidad[2] = cantidad[2]-cantidad[0];

            for(int i=0; i<cantidad.length; i++){
                if(cantidad[i] > 0) {
                    System.out.print(noms[i] + " (" + cantidad[i] + ") ");
                }
            }
            System.out.println();
        }
    }
}