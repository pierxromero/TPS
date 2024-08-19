import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int opcion = 0;
     ItemVenta object1 = new ItemVenta();
     System.out.print("Enter to Description:");
     object1.setDescription(scanner.nextLine());
     System.out.print("Enter to Amount:");
     object1.setAmount(scanner.nextInt());
     System.out.print("Enter to Unit Price:");
     object1.setUnitPrice(scanner.nextDouble());
     while (opcion != 5) {
      System.out.println("=== Menu ===");
      System.out.println("1.Print Object");
      System.out.println("2.Update Quantity");
      System.out.println("3.Update Unit Price");
      System.out.println("4.Total Price");
      System.out.println("5.Exit");
      System.out.print("Opcion: ");
      opcion = scanner.nextInt();
      switch (opcion) {
       case 1:
        System.out.println(object1.toString());
        break;
       case 2:
        System.out.print("Enter to new Quantity:");
        object1.setAmount(scanner.nextInt());
        break;
       case 3:
        System.out.print("Enter to new Unit Price:");
        object1.setUnitPrice(scanner.nextDouble());
        break;
       case 4:
        System.out.printf("Total Price:%.2f", object1.totalPrice());
        break;
       case 5:
        System.out.println("Exit...");
       default:
        System.out.println("Error Case");
        break;
      }
     }
     scanner.close();
    }
}