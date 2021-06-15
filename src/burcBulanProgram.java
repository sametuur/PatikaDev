import java.util.Scanner;

public class burcBulanProgram {
    public static void main(String[] args) {
        int Month , day ;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner (System.in);
        System.out.print("Doğduğunuz ayı giriniz : ");
        Month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz : ");
        day =  input.nextInt();
        /*Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart*/

        if(Month == 1){
            if (day <22   ){
                burc = "oğlak";
            }else if (day < 30){
                burc = " kova";
            }else {
                isError = true;
            }
        }else if (Month == 2 ) {
            if (day <19 && day < 28 ){
                burc = "kova";
            }else if (day < 28){
                burc = "balık";
            }else{
                isError = true;
            }

        }

        if (!isError ) {
            System.out.println("Burcunuz : " + burc);
        }else{
            System.out.println("Hatalı Giriş Yaptınız");
        }



    }
}
