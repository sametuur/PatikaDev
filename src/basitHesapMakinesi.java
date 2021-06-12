import java.util.Scanner;

public class basitHesapMakinesi {
    public static void main(String[] args) {
        int num1 , num2 , result;
        Scanner input = new Scanner(System.in);
        System.out.println("Hoş geldiniz hesap makinesini kullanmak için ilk iki sayıyı girdikten sonra lütfen yapmak istediğiniz işlemi 'Toplam' gibi yazınız .");
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        num1 = input.nextInt();
        System.out.print("Lütfen ikinici sayıyı giriniz : ");
        num2 = input.nextInt();
        System.out.print("Yapmak istediğiniz işlemi yazınız : ");
        String str = input.next();





        switch (str){
            case "Toplam" :
                System.out.println( "toplamın sonucu " + (result = num1 + num2));
                break;
            case "Çıkarma":
                System.out.print("Çıkarmanın sonucu " + (result = num1 - num2));
                break;
            case "Bölme":
                System.out.print("Bölmenin sonucu " + (result = num1  / num2));
                break;
            case "Çarpma":

                System.out.print("Çarpmanın sonucu "+ (result = num1 * num2) );
                break;
            default:
                System.out.println("hatalı bir giriş yaptınız ");
        }
    }
}
