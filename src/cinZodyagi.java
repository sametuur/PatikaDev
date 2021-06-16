import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
       //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        int datebirth,mod;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz : ");
        datebirth = input.nextInt();
        mod = datebirth % 12 ;

        switch (mod){
            case 1 :
                burc = "Horoz";
                break;
            case 2 :
                burc = "Köpek";
                break;
            case 3 :
                burc = "Domuz";
                break;
            case 4 :
                burc = "Fare";
                break;
            case 5 :
                burc = "Öküz";
                break;
            case 6 :
                burc = "Kaplan";
                break;
            case 7 :
                burc = "Tavşan";
                break;
            case 8 :
                burc = "Ejderha";
                break;
            case 9 :
                burc = "Yılan";
                break;
            case 10 :
                burc = "At";
                break;
            case 11 :
                burc = "Koyun";
                break;
            default:
                System.out.print("Girdiğiniz değer hatalı!");
        }
        System.out.println("Çin Zodyağı burcunuz " + burc);


    }
}
