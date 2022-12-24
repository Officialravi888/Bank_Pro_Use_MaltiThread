package Bank;

public class BankService extends Thread{
    private String Bank;
    private int Id;
    private  String Email;
    private int Account;

    public BankService(String bank, int id, String email, int account) {
        this.Bank = bank;
        this.Id = id;
        this.Email = email;
        this.Account = account;
    }
    @Override
    public void run() {

    }
}
