package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ConfigGame config;
    ArrayList<Player> players;
    Game game;

    private Scanner sc = new Scanner(System.in);
    private boolean exitMain = false, exitConfig = false;

    public Menu(ConfigGame config, ArrayList<Player> players, Game game) {
        this.config = config;
        this.players = players;
        this.game = game;
    }

    public void mainMenu() {
        do {
            System.out.println( "1. Play\n" +
                    "2. Settings\n" +
                    "3. Exit");
            switch (sc.nextInt()) {
                case 1:
                    game.play();
                    break;
                case 2:
                    configMenu();
                    break;
                case 3:
                    exitMain = true;
                    break;
                default:
                    System.out.println("\nERROR, aquesta opció no és possible!\n");
                    break;
            }
        } while (!exitMain);
    }

    public void configMenu(){
        do{
            System.out.println( "1. Players\n" +
                                "2. Game\n" +
                                "3. Return");

            switch (sc.nextInt()){
                case 1:
                    int num;

                    System.out.print("Número de jugadors(Màxim 4)? ");
                    config.setNumPlayers(num = sc.nextInt());
                    sc.nextLine();
                    players.clear();
                    for(int i=0; i<num; i++){
                        System.out.printf("Nom del jugador nº%d: ",i+1);
                        players.add(new Player(sc.nextLine()));
                    }
                    break;
                case 2:
                    System.out.print("Dificultat (1-5): ");
                    config.setLevel(sc.nextInt());
                    break;
                case 3:
                    exitConfig = true;
                    break;
                default:
                    System.out.println("\nERROR, aquesta opció no és possible!\n");
                    break;
            }
        }while(!exitConfig);
    }
}
