import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("birinci sayıyı giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("ikinci sayıyı giriniz : ");
        int sayi2 = input.nextInt();

        System.out.print("üçüncü sayıyı giriniz  : ");
        int sayi3 = input.nextInt();

        if(sayi1 < sayi2 && sayi1 < sayi3 ){
            System.out.println("ilk girdiğiniz sayı en küçük sayı " + sayi1);
            if (sayi2 < sayi3 ){
                System.out.println("Küçükten büyüğe girdiğiniz sayılar : "  + sayi1 + "<" + sayi2 + "<" + sayi3);
            }else{
                System.out.println("Küçükten büyüğe girdiğiniz sayılar : "  + sayi1 + "<" + sayi3 + "<" + sayi2);
            }
        }else if (sayi2 < sayi1 && sayi2 < sayi3){
            System.out.println("ikinci girdiğiniz sayı en küçük sayı " + sayi2);
            if (sayi1 < sayi3 ){
                System.out.println("Küçükten büyüğe girdiğiniz sayılar : "  + sayi2 + "<" + sayi1 + "<" + sayi3);
            }else{
                System.out.println("Küçükten büyüğe girdiğiniz sayılar : "  + sayi2 + "<" + sayi3 + "<" + sayi1);
            }
        }else{
            System.out.println("Küçükten büyüğe girdiğiniz sayılar : "  + sayi3 + "<" + sayi2 + "<" + sayi1);
        }
    }
}
