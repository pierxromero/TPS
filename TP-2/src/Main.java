import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double balanceNow;
     Scanner scanner = new Scanner(System.in);
     BancaryAccount user1 = new BancaryAccount();
       user1.setBalance(15000);
       user1.setIdentifier("898A");
     System.out.print("Enter the userName:");
     user1.setName(scanner.nextLine());
       System.out.println(user1.toString());
     System.out.print("Enter the money credit:");
     balanceNow= user1.credit(scanner.nextDouble());
        System.out.println(user1.toString());
        System.out.printf("\n(Main) Balance:%.2f",balanceNow);
     System.out.print("\nEnter the money to pay:");
       balanceNow=user1.debit(scanner.nextDouble());
        System.out.println(user1.toString());
        System.out.printf("\n(Main) Balance:%.2f",balanceNow);
     System.out.println("\nMaking a purchase of 30.000");
        balanceNow=user1.debit(30000);
        System.out.println(user1.toString());
        System.out.printf("\n(Main) Balance:%.2f",balanceNow);
        scanner.close();
    }
}