import java.sql.SQLOutput;
import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {
        double boy, index  ;
        int kilo ;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextInt();

       index = kilo/(boy * boy);
        System.out.print(index);


    }
}
