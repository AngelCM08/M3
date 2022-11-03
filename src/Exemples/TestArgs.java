package Exemples;

public class TestArgs {
    public static void main(String[] args) {
        String nom = "ningú";
        int edat = 0;
        if(args.length == 2){
            nom = args[0];
            edat = Integer.valueOf(args[1]);
        }else {
            System.out.println("arguments incorrectes");
        }

        System.out.printf("Hola %s tens %d anys espavila!\n", nom, edat);
    }
}
