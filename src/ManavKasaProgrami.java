import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutkg = 2.14 , elmakg = 3.67 ,domateskg = 1.11 , muzkg = 0.95, patlicankg = 5.00 ,total ;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? ");
        int armut = input.nextInt();
        System.out.print("Elma kaç kilo ? ");
        int elma = input.nextInt();
        System.out.print("Domates kaç kilo ? ");
        int domates = input.nextInt();
        System.out.print("Muz kaç kilo ? ");
        int muz = input.nextInt();
        System.out.print("Patlıcan kaç kilo ? ");
        int patlican = input.nextInt();
        total = (armut * armutkg) + (elma * elmakg)  + (domates * domateskg) + (muz * muzkg) + (patlican * patlicankg);
        System.out.print("toplam tutar : "+ total +" Tl");


    }
}
