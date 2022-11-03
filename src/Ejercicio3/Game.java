package Ejercicio3;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<Player>(4);
    ConfigGame conf = new ConfigGame(1, 1);
    Menu menu = new Menu(conf, players, this);

    public void start(){
        players.add(new Player("Ángel"));
        menu.mainMenu();
    }

    public void play(){
        System.out.printf("Nivell de joc: %d\n" +
                "Jugant...\n" +
                "Hi ha %d jugadors\n" +
                "...Joc acabat\n", conf.getLevel(), conf.getNumPlayers());
    }
}
