//ask user for checking or savings account
//new withdraw object and add to withdraw list
//output:
// Withdraw of: $4000.0 Date: Sun Nov 04
// 00:00:00 PDT 2018 into accounting: Checking
// Withdraw of: $500.0 Date Thu Aug 16
// 10:52:17 PDT 2018 into account: saving

import java.util.Date;

public class withdraw {
    private double amount;
    private Date date;
    private String account;

    withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        System.out.println("Withdraw of: " + amount + " Date: " + date + " into account: " + account);
        return "";
    }
}