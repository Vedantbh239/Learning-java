class Demo {
    String accountHolder;
    double balance;

    Demo(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance; }
        void deposit(double amount){
           
            if(amount>0){
                balance+=amount;
            }}
           
            void displayBalance(){
            System.out.println(accountHolder+":"+balance);
           }
           
        }
        
        public class BankAccount{
            public static void main(String[] args) {
                Demo account=new Demo("Rohan",1000);
                account.deposit(500);
                account.displayBalance(); 
            }
        }

    

