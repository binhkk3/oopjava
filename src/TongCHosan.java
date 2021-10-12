import java.util.Scanner;

public class TongCHosan {
    public static void main(String[] args) {
        float [] [] arr;
        System.out.println("nhap vao so cot ");
        Scanner scanner = new Scanner(System.in);
        int cot = scanner.nextInt();
        System.out.println("nhap so hang ");

        int hang = scanner.nextInt();
        arr = new float[cot][hang];
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.println("nhap vao gia tri cua arr[" + i + "][" + j + "]");
                arr[i][j]= scanner.nextFloat();
            }
        }
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("nhap vao cot ban muon tinh tong ");

        int sum =0;
        int cotTinh = scanner.nextInt();
        for (int i = 0; i < cot; i++) {
                for (int j = 0; j < hang; j++) {
                    if((j+1)==cotTinh){
                        sum += arr[i][j];
                    }

                }

        }
        System.out.println("tong la"+sum);

    }
}
