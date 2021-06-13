import java.util.Scanner;

public class KulllaniciGirisi {
    public static void main(String[] args) {
        String userName, pw ;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        pw = input.nextLine();

        if (userName.equals("Patika")&&pw.equals("java123")){
            System.out.println("Başarılı Giriş Yaptınız !");
        }else{
            System.out.print("Hatalı Giriş Yaptınız! Yeni Şifre oluşturmak ister misiniz ? : ");
            String karar = input.nextLine();
            if (karar.equals("evet")){
                System.out.print("Yeni şifrenizi giriniz : ");
                String reply = input.nextLine();
                if(reply.equals("java123"))
                System.out.println("Eski şifreniz ile yeni şifreniz aynı olamaz .");
                else{
                    System.out.println("şifreniz başarılı bir şekilde oluştu. ");
                }
            }

        }
    }
}
