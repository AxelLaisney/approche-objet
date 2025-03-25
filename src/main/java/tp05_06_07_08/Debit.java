package tp05_06_07_08;

public class Debit extends Operations{

    public Debit(String d, int a){
        super(d, a);
    }

    @Override
    public String getType(){
        return "DEBIT";
    }
}
