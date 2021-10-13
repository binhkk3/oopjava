package product;
import book.Book;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số lượng sản phẩm");
        int productAmount = scanner.nextInt();
        Product[] listProduct = new Product[productAmount];
        input(listProduct);
        output(listProduct);

        System.out.println("Tổng giá: " + totalMoney(listProduct));
        findByName("3", listProduct);
        editByCode(3, listProduct);
        output(listProduct);
        deleteCode(int code, Product[] listProduct)
    }

    public static void input(Product[] listProduct) {
        for (int i = 0; i < listProduct.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào thông tin: ");
            String name = scanner.nextLine();
            String type = scanner.nextLine();
            double price = scanner.nextDouble();
            int code = scanner.nextInt();
            Product product = new Product(type, code, price, name);
            listProduct[i] = product;
        }
    }

    public static void output(Product[] listProduct) {
        for (int i = 0; i < listProduct.length; i++) {
            System.out.println(listProduct[i]);
        }
    }

    public static void findByName(String name, Product[] listProduct) {
        boolean check = false;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].name.equals(name)) {
                System.out.println(listProduct[i]);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có tên này trong danh sách.");
        }
    }

    public static double totalMoney(Product[] listProduct) {
        double totalMoney = 0;
        for (int i = 0; i < listProduct.length; i++) {
            totalMoney += listProduct[i].price;
        }
        return totalMoney;
    }

    public static void editByCode(int code, Product[] listProduct) {
        boolean check = false;
        for (int i = 0; i < listProduct.length; i++) {
            Scanner scanner = new Scanner(System.in);
            if (listProduct[i].code == code) {
                System.out.print("Nhập tên mới: ");
                String newName = scanner.nextLine();
                listProduct[i].setName(newName);

                System.out.print("Nhập type mới: ");
                String newType = scanner.nextLine();
                listProduct[i].setType(newType);

                System.out.print("Nhập code mới: ");
                int newCode = scanner.nextInt();
                listProduct[i].setCode(newCode);

                System.out.print("Nhập giá mới: ");
                double newPrice = scanner.nextDouble();
                listProduct[i].setPrice(newPrice);

                check = true;
            }
        }