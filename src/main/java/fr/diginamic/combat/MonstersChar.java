package fr.diginamic.combat;

import java.util.Random;

public enum MonstersChar {

    LOUP("Loup", 0, 3 , 8, 5, 10,1),
    GOBELIN("Gobelin", 1,5, 10, 10, 15,2),
    TROLL("Troll", 2, 10, 15, 20, 30, 5);

    public String name;
    public int id;
    public int strength_min;
    public int strength_max;
    public int hpmin;
    public int hpmax;
    public int points;

    private MonstersChar(String n, int id ,int smin, int smax, int hpmin, int hpmax, int p){
        this.name = n;
        this.id = id;
        this.strength_min = smin ;
        this.strength_max = smax +1; //we add 1 due to how Random works to generate random numbers
        this.hpmax = hpmax+1;
        this.hpmin = hpmin;
        this.points = p;
    }
}
