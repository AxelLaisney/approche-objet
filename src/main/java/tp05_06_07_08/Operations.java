package tp05_06_07_08;

public abstract class Operations {
    protected String date;
    protected int amount;

    public Operations(String d, int a){
        this.date = d;
        this.amount = a;
    }

    @Override
    public String toString(){
        return "date de l'opération: " + this.date + " | Montant: " + this.amount;
    }

    public String getType(){
        return "";
    }
}
