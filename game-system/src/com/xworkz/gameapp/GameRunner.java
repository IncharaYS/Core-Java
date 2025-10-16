package com.xworkz.gameapp;

import com.xworkz.gameapp.game.Game;
import java.util.ArrayList;
import java.util.List;

public class GameRunner {
    public static void main(String[] args) {
        List<Game> gameList=new ArrayList<>();

        gameList.add(new Game(1,"The Legend of Zelda: Breath of the Wild","Action-Adventure","Nintendo Switch",9.8,2017,59.99));
        gameList.add(new Game(2,"God of War","Action","PlayStation 4",9.6,2018,49.99));
        gameList.add(new Game(3,"Minecraft","Sandbox","PC",9.2,2011,26.95));
        gameList.add(new Game(4,"Grand Theft Auto V","Action-Adventure","PC",9.5,2013,39.99));
        gameList.add(new Game(5,"Red Dead Redemption 2","Action-Adventure","PlayStation 4",9.7,2018,59.99));
        gameList.add(new Game(6,"The Witcher 3: Wild Hunt","RPG","PC",9.8,2015,29.99));
        gameList.add(new Game(7,"Fortnite","Battle Royale","PC",8.7,2017,0.00));
        gameList.add(new Game(8,"Apex Legends","Battle Royale","PC",8.9,2019,0.00));
        gameList.add(new Game(9,"PUBG","Battle Royale","Mobile",8.5,2017,0.00));
        gameList.add(new Game(10,"Assassin’s Creed Valhalla","Action RPG","PC",8.8,2020,59.99));

        System.out.println("Game list 1:");
        for(Game game:gameList){
            System.out.println(game);
        }
        System.out.println();

        List<Game> gameList2=new ArrayList<>();

        gameList2.add(new Game(11,"Call of Duty: Modern Warfare II","Shooter","PC",9.0,2022,69.99));
        gameList2.add(new Game(12,"FIFA 23","Sports","PlayStation 5",8.4,2022,59.99));
        gameList2.add(new Game(13,"Cyberpunk 2077","RPG","PC",8.3,2020,49.99));
        gameList2.add(new Game(14,"Elden Ring","Action RPG","PC",9.7,2022,59.99));
        gameList2.add(new Game(15,"Horizon Forbidden West","Action RPG","PlayStation 5",9.1,2022,69.99));
        gameList2.add(new Game(16,"Super Mario Odyssey","Platform","Nintendo Switch",9.7,2017,59.99));
        gameList2.add(new Game(17,"Among Us","Party","Mobile",8.2,2018,0.00));
        gameList2.add(new Game(18,"Overwatch 2","Shooter","PC",8.6,2022,0.00));
        gameList2.add(new Game(19,"Valorant","Shooter","PC",8.8,2020,0.00));
        gameList2.add(new Game(20,"League of Legends","MOBA","PC",9.0,2009,0.00));

        System.out.println("Game list 2:");
        for(Game game:gameList2){
            System.out.println(game);
        }
        System.out.println();

        gameList.addAll(gameList2);
        System.out.println("Game list:");
        for(Game game:gameList){
            System.out.println(game);
        }
        System.out.println();

        Game game1=new Game(7,"Fortnite","Battle Royale","PC",8.7,2017,0.00);
        Game game2=new Game(21,"Need for Speed: Heat","Racing","PC",8.5,2019,49.99);
        gameList.add(4,game2);

        System.out.println("Does list contain game1:"+gameList.contains(game1));
        System.out.println("Does list contain gameList2:"+gameList.containsAll(gameList2));
        System.out.println();

        gameList.remove(game1);
        gameList.remove(7);

        System.out.println("Game list after remove(Object) and remove(index):");
        for(Game game:gameList){
            System.out.println(game);
        }
        System.out.println();

        gameList.removeAll(gameList2);
        System.out.println("Game list after removing gameList2:");
        for(Game game:gameList){
            System.out.println(game);
        }
        System.out.println();

        System.out.println("Does list contain game1:"+gameList.contains(game1));
        System.out.println("Does list contain gameList2:"+gameList.containsAll(gameList2));
        System.out.println();

        gameList.addAll(gameList2);
        gameList.retainAll(gameList2);

        System.out.println("Game list after retaining only gameList2:");
        for(Game game:gameList){
            System.out.println(game);
        }
        System.out.println();
    }
}
