import java.awt.print.Book;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        BooK book1 = new BooK("El Quijote","Miguel de Cervantes",500,10);
        BooK book2 = new BooK("Cien Años de Soledad","Gabriel Garcia Marquez",700,5);
          System.out.println(book1.toString());
          System.out.println(book2.toString());
        book1.sellCopies(3);
          System.out.println(book1.toString());
        book2.sellCopies(8);
        book2.increaseCopies(5);
          System.out.println(book2.toString());
        scanner.close();
    }
}