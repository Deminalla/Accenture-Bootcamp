public class BankAccount {
    private int balance;

    public BankAccount(){
    }
    public BankAccount(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount<=5000){
        balance = balance+amount;
        }
        else{
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
        }
    }
    public void withdraw(int amount){
        if(balance>=amount){
        balance = balance-amount;
        }
        else {
            System.out.println("There is not enough funds.");
        }
    }
    public int printBalance(){
        return balance;
    }

    public static void transferFrom(BankAccount bankName1, BankAccount bankName2, int amount){
        if(amount<= bankName1.balance) {
            bankName2.balance += amount;
            bankName1.balance -= amount;
        }
        else{
            System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + bankName1.printBalance() + " are available.");
        }
    }

    public static void main (String [] args){
        BankAccount bank1 = new BankAccount(7000);
        BankAccount bank2 = new BankAccount(7000);
        bank1.withdraw(8000);
        bank1.deposit(9000);
        transferFrom(bank1, bank2, 10000);

    }
}

/*
 3) create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another
4) update your solution:
        * Encapsulate the balance property so it is private
        * add to "withdraw" method, so it would be impossible to withdraw
          more money than exists in bank account. If there is an attempt to withdraw
          more money than exists in bank account, output message:
            "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more
          money from the other account than it's balance.
                For example, if bank account A has 50 units and bank account B has 25 units
                and we try to transfer 30 units from B to A, then it should output:
                    "Transfer canceled. You are trying to transfer 30 units, but only 25 are available."
        * add a limit for depositing money. If the deposit is greater than 5000, then it should not
          do the deposit and output message:
              "Transaction canceled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account than possible
 */