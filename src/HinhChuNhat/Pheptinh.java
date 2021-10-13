package HinhChuNhat;

import java.util.Scanner;

public class Pheptinh {
    public static void main(String[] args) {
        System.out.println("nhập vào các chỉ số của hình ");
        Scanner scanner = new  Scanner(System.in);
        double with = scanner.nextFloat();
        double longs = scanner.nextFloat();
        System.out.println(with);
        System.out.println(longs);
        HinhChuNhat rectangle = new HinhChuNhat(with, longs);
        //System.out.println("Your Rectangle \n"+ rectangle.toString());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getarea());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

    }


}
