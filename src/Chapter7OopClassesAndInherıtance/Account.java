package Chapter7OopClassesAndInherıtance;

public class Account {

    private String accountNumber;
    private  double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this("56789",2.50,"Default name","Default adress","Default phone");
        System.out.println("Empty constructor called");
    }
    public Account(String accountNumber,double accountBalance,String customerName,String mail,String phone){
        System.out.println("Account constructor with parameter called");
        this.accountNumber=accountNumber;
        this.accountBalance= accountBalance;
        this.customerName = customerName;
        email = mail;
        phoneNumber = phone;
    }

    public Account(String email, String customerName, String phoneNumber) {
        this("9999",100.55,customerName,email,phoneNumber);
//        this.email = email;
//        this.customerName = customerName;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
       accountBalance += deposit;
       System.out.println("Deposit of "+deposit + " made.New balance is: " + this.accountBalance);
    }
    public void withdrawFund(double withdraw){
        if(accountBalance-withdraw<0){
            System.out.println("Insuffıcıent fund of : "+withdraw + " processed, Remaining balance = " + accountBalance);
        }else {
            accountBalance -= withdraw;
            System.out.println("Withdrawal of "+ withdraw + " processed , Remaining balance = " + accountBalance);
        }
    }

}
