class Account {
    int balance = 50;

    void withdraw(int amount) {
        balance = balance - amount;
    }

    int getBalance() {
        return balance;
    }
}

class TransactionThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            multithreading1.ac.withdraw(10);
            System.out.println(i+" - "+x.getName()+ " balance after withdrawal " +multithreading1.ac.getBalance());
        }
    }
}

class multithreading1 {
    static Account ac = new Account();
    public static void main(String[] args) {
        TransactionThread r =  new TransactionThread();

        
            r.setName("ash");
        
        r.start();
        
    }
}