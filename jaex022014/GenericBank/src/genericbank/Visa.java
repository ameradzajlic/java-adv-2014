package genericbank;
public class Visa implements ICard { 
    @Override
    public void getMoney(double amount) {
         System.out.println("Add money with Visa");
    }
    @Override
    public boolean validate() {
        System.out.println("Validating Visa");
        return true;
    }
}
