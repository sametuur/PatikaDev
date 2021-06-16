import java.util.Scanner;

public class UcakFiyatıHesaplama {
    public static void main(String[] args) {
        int km , age , sefer  ;
        double tutar = 0.10, ciftsefer = 0.20  , normaltotal,cifttutar;
        boolean isError= true;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km'e tipinden giriniz : ");
        km = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        sefer = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        normaltotal = km * tutar;
        cifttutar = km * ciftsefer;

        if (age >=  0 &&  sefer < 3 && km > 0){
            if(age < 12 ){
                if(sefer == 2 ){
                    normaltotal =   (cifttutar * 30 ) / 100 ;

                }else{
                    normaltotal =   (normaltotal * 50 ) / 100 ;
                }

            }else if (age >= 12 && age < 24 ){
                if(sefer == 2 ){
                    normaltotal =   (cifttutar * 70 ) / 100 ;
                }else{
                    normaltotal =   (normaltotal * 90 ) / 100 ;
                }

            }else if (65 < age){
                if(sefer == 2 ){
                    normaltotal =   (cifttutar * 50 ) / 100 ;
                }else{
                    normaltotal =   (normaltotal * 70 ) / 100 ;
                }
            }
        }else{
            System.out.println("Hatalı veri Girdiniz!");
            isError = false;
        }
        if(isError) {
            System.out.println("Toplam tutarınız : " + normaltotal);
        }
    }
}
