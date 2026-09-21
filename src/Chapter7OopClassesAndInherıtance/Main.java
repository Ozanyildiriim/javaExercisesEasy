package Chapter7OopClassesAndInherıtance;

public class Main {

    public static void main(String[] args) {
        Account bobstAccount = new Account("12345",1000.0,"Ozan","oznyldrm","123456");

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());
//        bobstAccount.setAccountNumber("12345");
//        bobstAccount.setAccountBalance(1000.0);
//        bobstAccount.setCustomerName("Ozan Y");
//        bobstAccount.setEmail("oznyldrm98@gmail.com");
//        bobstAccount.setPhoneNumber("123456789");

        bobstAccount.withdrawFund(100);
        bobstAccount.depositFunds(350);
        bobstAccount.withdrawFund(50);
        bobstAccount.depositFunds(105.5);
        bobstAccount.withdrawFund(45.8);

        Account timsAccount = new Account("Tim","tim@email","12345");
        System.out.println("AccountNo: "+timsAccount.getAccountNumber() + "; name "+timsAccount.getCustomerName());
    }
}
