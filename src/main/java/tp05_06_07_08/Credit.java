package tp05_06_07_08;

public class Credit extends Operations{

    public Credit(String d, int a){
        super(d, a);
    }

    @Override
    public String getType(){
        return "CREDIT";
    }
}
