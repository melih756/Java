import java.util.Scanner;
public class main {
    public static void main(String[]args){
        double r,alan,cevre;
        double pi=3.14;

        Scanner inp=new Scanner(System.in);


        System.out.println("yarıçap giriniz : ");
        r=inp.nextDouble();

        alan=pi*r*r;

        cevre=2*pi*r;

        System.out.println("Alan : "+alan);
        System.out.println("Çevre : "+cevre);

    }
}
