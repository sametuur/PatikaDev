import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double para , kdvDahil,kdvDahil2,kdvtutar = 0.18,kdvYuksekMiktar = 0.8;

        Scanner scanner = new Scanner(System.in);
        System.out.print("para değerinizi giriniz : ");
        para = scanner.nextDouble();

        kdvDahil = para * kdvtutar;
        kdvDahil2 = para * kdvYuksekMiktar;


        String buyukPara = para < 1000 ? "kdv'li tutar" + (para+kdvDahil): "kdv'li tutar" + (para+kdvDahil2);
        System.out.println(buyukPara);
        System.out.println("kdv'siz tutar "+ para);


    }
}
