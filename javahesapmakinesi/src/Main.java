import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        int n1,n2,select;

        Scanner inp=new Scanner(System.in);

        System.out.println("1.sayı giriniz");
        n1=inp.nextInt();

        System.out.println("2.sayı giriniz");
        n2=inp.nextInt();

        System.out.println("1-Toplama\n,2-Çıkarma\n,3-Çarpma\n,4-Bölme");
        System.out.print("Seçiniz");

        select=inp.nextInt();

        if (select==1){
           System.out.println(n1+n2);
        } else if (select==2) {
            System.out.println(n1-n2);
        } else if (select==3) {
            System.out.println(n1*n2);
        } else if(select==4) {
            System.out.println(n1/n2);
        }else {
            System.out.println("Yanlış seçim yaptınız");
        }

    }
}
