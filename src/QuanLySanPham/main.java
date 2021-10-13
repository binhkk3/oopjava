package QuanLySanPham;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("nhạp số luong sản phâm ");
        Scanner scanner1 = new  Scanner(System.in);
        int sl = scanner1.nextInt();
        ProDuct [] listproducts =new ProDuct[sl];
        input(listproducts);
    }

    public static void input (ProDuct[], listproducts) {

        for (int i = 0; i < sl; i++) {
            System.out.println("nhập vào các thông số của sản phẩm ");
            Scanner scanner= new Scanner(System.in);
            System.out.println("nhạp vào mã sản phẩm ");
            String code = scanner.nextLine();
            System.out.println("nhap ten sp ");
            String name = scanner.nextLine();
            System.out.println("nhạp laoji sp");
            Scanner scanner12 = new  Scanner(System.in);
            String category = scanner12.nextLine();
            System.out.println("nhập giá sp ");
            float price = scanner12.nextFloat();
            String unit = "usd";
            ProDuct product = new ProDuct(code,name,category,unit,price);
        }

        //System.out.println("danh sách sản phẩm" +product.);
    }
}
