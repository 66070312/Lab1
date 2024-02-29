public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    
    public void deposit(double a){
        if (a > 0){
            this.setBalance(this.getBalance() + a);
            System.out.println(a + " baht is deposited to " + this.getName() + ".");
        } else {System.out.println("Input number must be a positive integer.");}
    }
    
    public void withdraw(double a){
        if ((this.getBalance() - a) < 0){
            System.out.println("Not enough money!");
        }else if (a > 0){
            this.setBalance(this.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + this.getName() + ".");
        }else {System.out.println("Input number must be a positive integer.");}
    }
    
    public void showAccount(){
        System.out.println(this.getName() + " account has " + this.getBalance() +" baht.");
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
}