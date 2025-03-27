package fr.diginamic.combat;

import java.util.Random;

public class Player extends Entity{
    Random rand = new Random();
    private int _score;
    int h = rand.nextInt(20, 51);
    int s = rand.nextInt(12, 19);

    public void set_score(int _score) {
        this._score = _score;
    }

    public int get_score() {
        return _score;
    }

    public void setHpRando(){
        this._hp = rand.nextInt(20, 51);
    }

    public void setStrengthRando(){
        this._strength =rand.nextInt(12, 19);
    }


    public Player(String n){
        super(n, 0, 0);
        setHpRando();
        setStrengthRando();
        set_score(0);
    }

    public void AddScore(int s){
        this.set_score(this.get_score() + s);
    }

    public void Display(){
        System.out.println(super.DisplayEntity() + " Strength : "+this.get_strength() +  " | score : "+ this.get_score());
    }
}
