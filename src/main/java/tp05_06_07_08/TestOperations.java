package tp05_06_07_08;

public class TestOperations {
    public static void main(String[] args) {
        int total = 0;
        Operations[] operations = {
                new Credit("12/3", 10),
                new Credit("14/3", 15),
                new Debit("15/4", -56),
                new Debit("13/5", -100)
        };

        for(Operations c: operations){
            System.out.println(c.toString());
            System.out.println(c.getType());
            if(c.getType().equals("CREDIT")){
                total += c.amount;
            }else if (c.getType().equals("DEBIT")){
                total += c.amount;
            }else{
                System.out.println("ERROR");
            }
        }

        System.out.println("Total of operations :" + total);
    }
}
