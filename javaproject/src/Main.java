import java.util.Scanner;

public class Main {
    public static void main(String[]args){
       int mat,fizik,kimya,tarih,türk,müzik;

       Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya=input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        türk=input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        müzik=input.nextInt();

        int toplam=(mat+fizik+kimya+tarih+müzik+türk);
        double sonuc=toplam/6;

        System.out.println(sonuc);

        boolean kosul1=sonuc<60;
        System.out.println(kosul1);
        boolean kosul2=sonuc>60;
        System.out.println(kosul2);




    }
}
