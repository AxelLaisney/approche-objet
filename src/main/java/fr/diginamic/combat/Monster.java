package fr.diginamic.combat;

public class Monster extends Entity{
    private int _points;

    public void set_points(int _points) {
        this._points = _points;
    }

    public int get_points() {
        return _points;
    }

    public Monster(String n, int h, int s, int p){
        super(n, h, s);
        set_points(p);
    }

    public void Display(){
        System.out.println(super.DisplayEntity() + " gives "+this.get_points()+ " pts");
    }
}
