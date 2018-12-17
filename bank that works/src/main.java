import java.util.Date;

public class main {
    public static void main(String args[]){
        customer me = new customer("caitlin", 1000, 1000);
        System.out.println(me);

        me.deposit(100, new Date(), customer.SAVING);
        me.withdraw(500, new Date(), customer.SAVING);
        me.displayDeposits();
        me.displayWithdraws();
        System.out.println(me);
    }
}