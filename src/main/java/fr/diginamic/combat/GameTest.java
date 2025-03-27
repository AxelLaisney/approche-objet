package fr.diginamic.combat;

import java.util.HashMap;
import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Turn turn = new Turn();
        HashMap<Entity, Integer> winner = new HashMap<>();
        boolean keepGoing = true;
        System.out.println("Welcome to a simple combat simulation!");
        System.out.println("Please enter your name: ");

//        String playerName = scan.next();
        String playerName = "Axel";

        Player player = new Player(playerName);
        Monster monster  = turn.generateOpponent();

        while(turn.isAlive(player) && keepGoing){
            if(!turn.isAlive(monster)){
                System.out.println("You defeated the monster! Here comes another one");
                player.AddScore(monster.get_points());
                monster = turn.generateOpponent();
            }
            player.Display();
            monster.Display();
            keepGoing = turn.Choice();
            winner = turn.winnerOfTurn(player, monster);
            turn.Attaque(winner, player, monster);
        }

        System.out.println("Game ended. You got a score of "+player.get_score()+ " pts");

    }
}
