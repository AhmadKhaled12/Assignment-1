package ex_2;
import java.util.Date;
public class Ex_2 
{
    public static void main(String[] args) 
    {
        Account acc_1 = new Account();
        acc_1.set_id(1122);
        acc_1.set_balance(20000);
        acc_1.set_annual_interest_rate(0.045);
        acc_1.withdraw(2500);
        acc_1.diposit(3000);
        acc_1.Account_details();
        
    }
}
