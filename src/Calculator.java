import java.sql.SQLOutput;
import java.util.Scanner;
import proj.MathFunctions;
public class Calculator {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz");
        int sayi1 = klavye.nextInt();
        System.out.println("lutfen bir sayi  daha giriniz");
        int sayi2 = klavye.nextInt();

        System.out.println("lutfen bir islem turu seciniz:");
        System.out.println("1:Toplama, 2:Cikarma , 3:carpma, 4:bolme, 5:mod ,6:yuzde , 7:sin ,8:cos ,9:tan,10:ussunuAlma");
        int islem = klavye.nextInt();


        switch (islem) {
            case 1:
                double sonuc = MathFunctions.add(sayi1, sayi2);
                System.out.println("Toplama " + sonuc);
                break;
            case 2:
                double sonuc2 =  MathFunctions.sustract(sayi1, sayi2);
                System.out.println("cikarma:" + sonuc2);
                break;
            case 3:
                double sonuc3 = MathFunctions.multiply(sayi1, sayi2);
                System.out.println("carpma:" + sonuc3);
                break;
            case 4:
                double sonuc4 = MathFunctions.divide(sayi1, sayi2);
                System.out.println("bolme:" + sonuc4);
                break;
            case 5:
                double sonuc5 = MathFunctions.mod(sayi1, sayi2);

                System.out.println("mod" + sonuc5);
                break;
            case 6:
                double sonuc6 = MathFunctions.yuzde(sayi1,sayi2);
                System.out.println("yuzde:" + sonuc6);
                break;

            case 7:
               double sonuc7 = MathFunctions.sin(sayi1,sayi2);
                System.out.println("sin fonksiyonu:" + sonuc7);
                break;

            case 8:
                double sonuc8 = MathFunctions.cos(sayi1,sayi2);
                System.out.println("cosinus fonsiyonu:" + sonuc8);
                break;

            case 9:
                double sonuc9 = MathFunctions.tan(sayi1,sayi2);
                System.out.println("tanjant Fonksiyonu:" + sonuc9);
                break;
            case 10:
                double sonuc10 = MathFunctions.ussu(sayi1,sayi2);
                System.out.println("ussunuAlma:" + sonuc10);
                break;

            default:
                System.out.println("boyle bir islem turu yok");

        }
    }
}