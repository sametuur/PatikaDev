
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat , tarih , turkce , fizik , kimya , muzik;
        System.out.print("Matematik ders notunuzu giriniz : ");
        mat = scanner.nextInt();
        System.out.print("Tarih ders notunuzu giriniz : ");
        tarih = scanner.nextInt();
        System.out.print("Tükçe ders notunuzu giriniz : ");
        turkce = scanner.nextInt();
        System.out.print("fizik ders notunuzu giriniz : ");
        fizik = scanner.nextInt();
        System.out.print("kimya ders notunuzu giriniz : ");
        kimya = scanner.nextInt();
        System.out.print("Müzik ders notunuzu giriniz ");
        muzik = scanner.nextInt();

        double sonuc = (mat+tarih+turkce+fizik+kimya+muzik)/6.0 ;
        String gecme = sonuc > 60 ? "Sınıfı Geçti  " : "Sınıfta Kaldı ";
        System.out.print("sınıf ortalama notunuz" + sonuc +"geçme durumunuz "+gecme);

    }

}
