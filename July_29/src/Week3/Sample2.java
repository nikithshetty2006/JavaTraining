package Week3;

public class Sample2 {
    public static void main(String[] args){
        Bank b= new Bank();
        b.setPin(1000);
        b.deposit(1001,500);
        b.deposit(1000,500);
        b.getBalance(1000);

    }

}
class Bank{
    private double balance;
    String acc_no;
    private int pin;

    public double getBalance(int e_pin) {
        if(pin==e_pin){
            System.out.println("Current Balance:"+balance);
        }
        else{
            System.out.println("Invalid PIn");
        }
        return balance;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    void deposit(int e_pin,double amount){
        if(pin==e_pin)
        {

                balance += amount;
                System.out.println("Deposited successfully!");

        }
        else {
            System.out.println("Invalid PIN");
        }
    }
    void withdraw(int e_pin,double amount){
        if(pin==e_pin)
        {
            if(amount>balance){
                System.out.println("Insufficient balance");
            }
            else {
                balance -= amount;
                System.out.println("Withdrawn successfully!");
            }
        }
        else {
            System.out.println("Invalid PIN");
        }
    }
}
