import java.util.Scanner;

public class taksimetreHesaplama {
    public static void main(String[] args) {
        int km ;
        double total , perkm = 2.20 , start=10.0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi 'km' cinsinden giriniz : ");
        km = input.nextInt();

        total = km * perkm;
        total += start;
        total = (total<20) ? 20 : total;

        System.out.print("ödenecek tutar" + total);



    }
}
