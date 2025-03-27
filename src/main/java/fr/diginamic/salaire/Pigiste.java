package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private int _daysWorked;
    private  double _dailyPay;

    public double get_dailyPay() {
        return _dailyPay;
    }

    public int get_daysWorked() {
        return _daysWorked;
    }

    public void set_dailyPay(double _dailyPay) {
        this._dailyPay = _dailyPay;
    }

    public void set_daysWorked(int _daysWorked) {
        this._daysWorked = _daysWorked;
    }

    public Pigiste(String n, String p, int d, double pay){
        super(n, p);
        set_dailyPay(pay);
        set_daysWorked(d);
    }

    public double getSalaire(){
        return get_daysWorked() * get_dailyPay();
    }


}
