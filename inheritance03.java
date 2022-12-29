
import java.util.Scanner;



class bank
{
    protected int account_no;
    protected String account_holder_name;
    protected String account_holder_address;
    protected long account_holder_phone;
    protected String branch_name;
    public static int  min_deposit;
    protected int account_balance;
    

    public void setdata(int a,String b,String c,long d,String e,int min,int bal)
    {
        account_no=a;
        account_holder_name=b;
        account_holder_address=c;
        account_holder_phone=d;
        branch_name=e;
        min_deposit=min;
        account_balance=bal;

    }
    public int get_account_no()
    {
        return account_no;
    }
    public String get_account_holder_name()
    {
        return account_holder_name;
    }
    public String get_account_holder_address()
    {
        return account_holder_address;
    }
    public long  get_account_holder_phone()
    {
        return account_holder_phone;
    }
    public String get_branch_name()
    {
        return branch_name;
    }
    public int get_min_deposit()
    {
        return min_deposit;
    }
    public int get_account_balance()
    {
        return account_balance;
    }

}




class saving_account extends bank
{
    protected int amount_withdrawl;
    protected int max_limit_withdrawl;
    

    public void setdata_saving()
    {
        amount_withdrawl=account_balance-500;
        max_limit_withdrawl=30000;
    }
    public int get_amount_withdrawl()
    {
        return amount_withdrawl;
    }

    public int get_max_limit_withdrawl()
    {
        return max_limit_withdrawl;
    }

}





class loan_account
{
    protected int emi;
    protected int rate_of_interest;
    protected int total_year;
    protected int loan_amount;

    public void setdata(int a,int b,int c,int d)
    {
        emi=a;
        rate_of_interest=b;
        total_year=c;
        loan_amount=d;
    }

    public int get_emi()
    {
        return emi;
    }
    public int get_rate_of_interest()
    {
        return rate_of_interest;
    }
    public int get_total_year()
    {
        return total_year;
    }
    public  int get_total_amount_tobe_paid()
    {
        return loan_amount;
    }

}







public class inheritance03
 {
    public static void main(String []args)
    {
        saving_account s=new saving_account();
        s.setdata(150142363,"vishwas","Bhudakewadi" ,930930694,"tarale",500,31465);
        s.setdata_saving();
        System.out.println(s.get_account_holder_name());
        System.out.println(s.get_account_holder_address());
        System.out.println(s.get_account_holder_phone());
        System.out.println(s.get_account_no());
        System.out.println(s.get_amount_withdrawl());
        System.out.println(s.get_branch_name());


    }
    
}
