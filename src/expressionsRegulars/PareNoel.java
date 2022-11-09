package expressionsRegulars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PareNoel {
    public static void main(String[] args) {
        List<Pattern> patterns = new ArrayList<>();

        patterns.add(Pattern.compile("\\*<]:-DOo"));
        patterns.add(Pattern.compile(">:o\\)"));
        patterns.add(Pattern.compile("<]:-D"));

        String[] names = {"Pare Noel","Re","Follet"};
        ArrayList<Integer> count = new ArrayList<>();

        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("src/expressionsRegulars/santako.txt"));
            boolean eof = false;

            while (!eof) {
                String line = inputStream.readLine();
                if (line == null){
                    eof = true;
                }else{
                    for(int i=0; i<patterns.size(); i++) {
                        Matcher m = patterns.get(i).matcher(line);
                        while(m.find()){
                            count[i]++;
                        }
                        count[2] = count[2]-count[0];
                        System.out.print(names[i]+" ("+count[i]+")");
                    }
                    System.out.println();
                }
            }
            inputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
