import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int mat,fizik,kimya,turk,müzik;

        Scanner inp=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
        mat=inp.nextInt();

        System.out.println("Fizik notunuzu giriniz");
        fizik=inp.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        kimya=inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz");
        turk=inp.nextInt();

        System.out.println("Müzik notunuzu giriniz");
        müzik=inp.nextInt();

        double average=((mat+fizik+kimya+turk+müzik)/5);
        if (average>=55){
            System.out.println("Geçtiniz");
        }else {
            System.out.println("Kaldınız");

        }
    }
}
