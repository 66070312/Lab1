public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public static void main(String[] args) {
        CheckingAccount a = new CheckingAccount(100, "aun", 0);
        System.out.println(a.getBalance());
    }
    
    public void setCredit(double credit){this.credit = credit;}
    public double getCredit(){return this.credit;}
    
    @Override
    public String toString(){
        return "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.getCredit() + " credits.";

    }
    @Override
    public void withdraw(double a) throws WithdrawException{
        if ((this.getBalance() - a) >= 0){
            this.setBalance(this.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        } else if ((this.getCredit() - (a - this.getBalance())) >= 0){
            this.setCredit(this.getCredit() - (a - this.getBalance()));
            this.setBalance(0);
            System.out.println(a + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        } else {
            throw new WithdrawException(name + " has not enough money.");
        }
    }
    public void withdraw(String a) throws WithdrawException{
        double b = Double.parseDouble(a);
        this.withdraw(b);
    }
}