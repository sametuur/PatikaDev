import java.util.Scanner;

public class dilimAlma {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarı çapını giriniz : ");
        int r = input.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        int a = input.nextInt();

        double result =  (pi * (r*r) * a) / 360;

        System.out.println("sonuç " + result);
    }
}
