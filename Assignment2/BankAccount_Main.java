public class BankAccount_Main {
    public static void main(String[] args) {
        BankAccount bank=new BankAccount();

        bank.setAcountNumber("kd-1133");
        bank.setBalance(5000);

        String AccountName=bank.getAcountNumber();
        double balance=bank.getBalance();

        System.out.println("Bank Account Number :"+AccountName);
        System.out.println("Total Balance :"+balance);
    }
}
