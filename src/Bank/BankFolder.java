package Bank;

public class BankFolder{
    public static void main(String[] args) {
        BankService b=new BankService("HDFC",21,"R@gmail.com",677788);
        Thread thread = new Thread(b);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
