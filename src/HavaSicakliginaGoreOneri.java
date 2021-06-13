import java.util.Scanner;

public class HavaSicakliginaGoreOneri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        int heat = input.nextInt();
       /* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
        if(heat<5){
            System.out.print("kayak yapabilirsiniz.");

        }else  if ((5 >= heat && heat <= 15) || (10 >= heat && heat <= 25)){
            System.out.println("Sinamaya gidebilirsiniz");
            System.out.println("piknik yapabilirsiniz.");
        }else{
            System.out.println("yüzmeye gidebilirsiniz .");
        }

    }

}
