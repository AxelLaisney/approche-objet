package sets;

import annotations.ToString;

import java.lang.reflect.Field;

public class Pays {
    Class classe = this.getClass();
    @ToString
    private String _nom;
    @ToString
    private int _hab;

    private double _PIB;

    public String get_nom() {
        return _nom;
    }

    public double get_PIB() {
        return _PIB;
    }

    public int get_hab() {
        return _hab;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public void set_hab(int _hab) {
        this._hab = _hab;
    }

    public void set_PIB(double _PIB) {
        this._PIB = _PIB;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        Field[] fields = classe.getDeclaredFields();
        for(Field f: fields){
            f.setAccessible(true);
            if(f.isAnnotationPresent(ToString.class)){
                try {
                    builder.append(f.get(this)).append(" ");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        return  builder.toString();
    }

    public Pays(String n, int h, double p){
        set_hab(h);
        set_nom(n);
        set_PIB(p);
    }
}
