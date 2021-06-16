import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int datebirth;


        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        datebirth = input.nextInt();

        if(datebirth % 2 == 0 ){
            if(datebirth % 400 == 0 )
            System.out.println(datebirth+" bir Artık yıldır.");
            else{
                System.out.println(datebirth+" artık bir yıl değildir.");
            }
        }else
        {
            System.out.println(datebirth+" artık bir yıl değildir.");
        }
    }
}
