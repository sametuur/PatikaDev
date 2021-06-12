import java.util.Scanner;


public class HipotenüsBulma {
    public static void main(String[] args) {
        int a , b , c  , u ;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen a kenarını giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen b kenarını giriniz : ");
        b = input.nextInt();
        System.out.print("Lütfen c kenarını giriniz : ");
        c = input.nextInt();
        u = (a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(alan);
        //alan * alan = u * (u-a)*(u-b)*(u-c);


    }
}
