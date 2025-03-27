package fr.diginamic.combat;


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Turn {
    Random rand = new Random();
    private int _turn;

    public void set_turn(int _turn) {
        this._turn = _turn;
    }

    public int get_turn() {
        return _turn;
    }

    public Monster generateOpponent(){
        int randoId = rand.nextInt(0, 3);
        Monster m = null;
        for(MonstersChar monster: MonstersChar.values()){
            if(monster.id == randoId){
                int hp = rand.nextInt(monster.hpmin, monster.hpmax);
                int strength = rand.nextInt(monster.strength_min, monster.strength_max);
                m = new Monster(monster.name, hp, strength, monster.points);
            }
        }
        return m;
    }

    public boolean isAlive(Entity e){
        return e.get_hp() > 0;
    }

    public HashMap<Entity, Integer> winnerOfTurn(Entity e1, Entity e2){
        HashMap<Entity, Integer> map = new HashMap<>();
        int attaque1 = e1.get_strength() + rand.nextInt(1, 11);
        int attaque2 = e2.get_strength() + rand.nextInt(1, 11);

        while(attaque1 == attaque2){
            attaque1 = e1.get_strength() + rand.nextInt(1, 11);
            attaque2 = e2.get_strength() + rand.nextInt(1, 11);
        }
        if(attaque1 > attaque2){
            int damages = attaque1 - attaque2;
            map.put(e1, damages);
            return  map;
        }else  if(attaque1 < attaque2){
            int damages = attaque2 - attaque1;
            map.put(e2, damages);
            return map;
        }else{
            return  map;
        }
    }

    public boolean Choice(){
        System.out.println("What do you want to do?");
        System.out.println("1. Fight the monster");
        System.out.println("2. Give up");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        while(choice != 1 && choice != 2){
            System.out.println("Enter a valid command");
            choice = scan.nextInt();
        }
        return choice == 1;
    }

    public void Attaque(HashMap<Entity, Integer> w, Player p, Monster m){
        for(Entity e: w.keySet()){
            if(e instanceof Player) {
                System.out.println("You strike the monster for "+w.get(e) + " damages!");
                m.removeHp(w.get(e));
            }
            if(e instanceof Monster){
                System.out.println("You got hit by the monster for "+w.get(e) + " damages!");
                p.removeHp(w.get(e));
            }
        }
    }
}
