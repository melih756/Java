import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        double boy,kilo,endeks;

        Scanner inp=new Scanner(System.in);

        System.out.println("Kilo giriniz");
        kilo=inp.nextDouble();

        System.out.println("Boy giriniz");
        boy=inp.nextDouble();

        endeks=kilo/(boy*boy);

        System.out.println(endeks);
    }
}
