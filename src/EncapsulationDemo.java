import java.util.Scanner;
public class EncapsulationDemo {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String userName="Surya Bhavani Kovvuri";
        int accountNumber=1234;
        String password="bankdetails@111";
        double bankBalance=5000000;
        BankDetails obj=new BankDetails(userName,accountNumber,password,bankBalance);
        System.out.println("Enter user name:");
        String name=s.nextLine();
        System.out.println("Enter account number:");
        int accNum=s.nextInt();s.nextLine();
        System.out.println("Enter password:");
        String passwd=s.nextLine();
        if(name.equals(obj.getUserName()) && accNum==(obj.getAccountNumber())  && passwd.equals(obj.getPassword())){
            System.out.println("Your account balance is:\n"+obj.getBankBalance());
        }
        else{
            System.out.println("The Credentials entered are incorrect.");
        }
    }

}
class BankDetails{
    private String userName;
    private  int accountNumber;
    private String password;
    private double bankBalance;

    public BankDetails(String userName, int accountNumber, String password, double bankBalance) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.password = password;
        this.bankBalance = bankBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
}

