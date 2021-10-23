package ex_2;
import java.util.Date;
public class Account 
{
    private int id;
    private double balance;
    private double annual_interest_rate;
    private Date date_created = new Date();
    public Account()
    {
        this.id = 000;
        this.balance = 00000;
        this.annual_interest_rate = 000;
    }
    public Account (int identification, double b)
    {
        this.id = identification;
        this.balance = b;
    }

    public void set_id(int identification)
    {
        this.id = identification;
    }

    public void set_balance(double b)
    {
        this.balance = b;
    }

    public void set_annual_interest_rate(double A_I_R)
    {
        this.annual_interest_rate = A_I_R;
    }

    public int get_id()
    {
        return id;
    }

    public double get_balance()
    {
        return balance;
    }

    public double get_annual_interest_rate()
    {
        return annual_interest_rate;
    }

    public Date get_date_created()
    {
        return date_created;
    }
    public double get_monthly_interest_rate()
    {
        return annual_interest_rate / 12;
    }
    
    public double get_monthly_rate()
    {
        double monthly_rate = (annual_interest_rate * balance)/12;
        return monthly_rate;
    }
            
    public double withdraw(double amount)
    {
        double new_balance = balance - amount;
        this.set_balance(new_balance);
        return amount;
    }
    public double diposit(double amount)
    {
        double new_balance = balance + amount;
        this.set_balance(new_balance);
        return new_balance;
    }
    
    public void Account_details()
    {
        System.out.println("The balance: " + this.get_balance() + " $.");
        System.out.println("The monthly interest: " + this.get_monthly_rate() + " $.");
        System.out.println("The date of account establishment: " + this.get_date_created());
    }
}
