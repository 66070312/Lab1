import java.util.*;
import Account.Account;

public class Customer3 {
    public String firstName;
    public String lastName;
    public ArrayList<Account> acct;
    public int numOfAccount;
    
    public Customer3(){this("", "");}
    public Customer3(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList<Account>();
    }
    
    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount++;
    }
    public Account getAccount(int index){return acct.get(index);}
    public int getNumOfAccount(){return numOfAccount;}
    
    @Override
    public String toString(){
        return firstName+" "+lastName+" has "+numOfAccount+" accounts.";
    }
}