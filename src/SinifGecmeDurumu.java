import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat , turkce , fizik ,kimya , muzik ;


        Scanner input = new Scanner (System.in);
        System.out.print("Matematik Ders Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Tükçe Ders Notunuzu Giriniz : ");
        turkce = input.nextInt();


        System.out.print("Fizik Ders Notunuzu Giriniz : ");
        fizik = input.nextInt();


        System.out.print("Kimya Ders Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Ders Notunuzu Giriniz : ");
        muzik = input.nextInt();


        double avarage = (mat+turkce+fizik+kimya+muzik) / 5 ;
        boolean result = (mat< 0 || mat> 100 ) || (turkce< 0 || turkce> 100 ) || (fizik < 0  || fizik > 100) || (kimya < 0 || kimya > 100) || (muzik < 0 || muzik > 100) ? true : false;

        if(result){
            System.out.println("lütfen girmiş olduğunuz değerleri kontrol ediniz!");

        }else if (result){
            System.out.println("lütfen girmiş olduğunuz değerleri kontrol ediniz!");

        }else{

            if(avarage <55 ){
                System.out.print("Sınıfta kaldınız seneye görüşmek üzere .");

            }else{
                System.out.println("Tebrikler Sınıfı Geçtiniz . ");
            }
            System.out.println("ortalamanız : "+ avarage);

        }
    }
}
