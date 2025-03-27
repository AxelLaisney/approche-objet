package fr.diginamic.combat;

public abstract class Entity {
    protected String _name;
    protected int _hp;
    protected int _strength;

    public int get_strength() {
        return _strength;
    }

    public int get_hp() {
        return _hp;
    }

    public String get_name() {
        return _name;
    }

    public void set_hp(int _hp) {
        if(_hp < 0){
            _hp = 0;
        }
        this._hp = _hp;
    }

    public void set_strength(int _strength) {
        if(_strength <= 0){
            _strength = 1;
        }
        this._strength = _strength;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    protected Entity(String n, int h, int s){
        set_hp(h);
        set_name(n);
        set_strength(s);
    }

    protected void removeHp(int a){
        if(a < 0){
            a = 0;
        }
        this.set_hp(this.get_hp() - a);
    }

    protected String DisplayEntity(){
        return this.getClass().getSimpleName() + ": "+this.get_name()+ " | "+ this.get_hp()+ " hp | ";
    }

    protected abstract void Display();
}
