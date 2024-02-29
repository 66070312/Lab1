import Account.*;

public class Bank {
    public Account[] acct;
    public int numAcct;
    
    public Bank(){
        acct = new Account[10];
    }
    
    public void addAccount(Account ac){
        this.acct[this.numAcct++] = ac;
    }
    
    public Account getAccount(int index){
        return this.acct[index];
    }
    
    public int getNumAccount(){
        return this.numAcct;
    }
}