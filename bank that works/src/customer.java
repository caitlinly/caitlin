import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class customer {
    private int accountNumber;
    private ArrayList<deposit> deposits;
    private ArrayList<withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private static int IDnum =1;

    customer(){
        name = "";
        accountNumber = IDnum;
        IDnum++;
        checkBalance = 0;
        savingBalance = 0;

    }
    customer(String name, double checkDeposit, double savingDeposit){
        this.name = name;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        ArrayList<deposit> deposits = new ArrayList<>();
        ArrayList<withdraw> withdraws = new ArrayList<>();
        this.deposits = deposits;
        this.withdraws = withdraws;
    }

    public String toString(){
        return "Name: " + name + " Account number: " + accountNumber + " Savings: " + savingBalance + " checking: " + checkBalance;
    }

    public double deposit(double amt, Date date, String account){
        deposit d = new deposit(amt,date,account);
        deposits.add(d);
        if(account == CHECKING) {
            checkBalance += amt;
            return checkBalance;
        }
        if(account == SAVING){
            savingBalance += amt;
            return savingBalance;
        }
        return -1;
    }
    public double withdraw(double amt, Date date, String account){
        withdraw w = new withdraw(amt,date,account);
        withdraws.add(w);
        if(account == CHECKING) {
            if(checkOverdraft(checkBalance - amt)){
                return -1;
            }
            else{
                checkBalance -=amt;
                return checkBalance;
            }
        }
        if(account == SAVING){
            if(checkOverdraft(checkBalance - amt)){
                return -1;
            }
            else{
                savingBalance -= amt;
                return savingBalance;
            }
        }
        return -1;
    }
    private boolean checkOverdraft(double amt){
        if(amt < -100){
            return true;
        }else return false;
    }
    //do not modify
    public void displayDeposits(){
        for(deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
