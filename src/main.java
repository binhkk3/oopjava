import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Book[] listBook = new Book[10];
        input(listBook);
        output(listBook);
        findName("2", listBook);
        System.out.println("Tong tien la "+ totalMoney(listBook));
        }
    public static void input(Book[] listBook) {
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao  gia tri");
            String name  = scanner.nextLine();
            String category = scanner.nextLine();
            //String author = scanner.nextLine();
            double price = scanner.nextDouble();
            int amount = scanner.nextInt();
            Book book = new Book(name,price,amount,category);
            listBook [i] = book;
        }
    }

    public static void output (Book[] listBook) {
        for (int i = 0; i < 3; i++) {
            System.out.println(listBook[i]);
        }
    }

    public static double totalMoney(Book[] listBook) {
        double totalMoney = 0;
        for (int i = 0; i < 3; i++) {
            totalMoney += listBook[i].amount*listBook[i].price;
        }
        return totalMoney;
    }

    public static void   findName(String name,Book[] listBook) {
        for (int i = 0; i < 3; i++) {
            if(listBook[i].name.equals(name)){
                System.out.println(listBook[i]);
            }
        }
    }
}