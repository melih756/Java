import java.util.Scanner;

public class main {
    public static void  main (String[] args){
        double a,e,d,m,p,toplam;
        int armut,elma,domates,muz,pat;
        a=2.14;e=3.67;d=1.11;m=0.95;p=5;

        Scanner inp=new Scanner(System.in);

        System.out.println("kaç kilo armut?");
        armut=inp.nextInt();

        System.out.println("kaç kilo elma?");
        elma=inp.nextInt();

        System.out.println("kaç kilo domates?");
        domates=inp.nextInt();

        System.out.println("kaç kilo muz?");
        muz=inp.nextInt();

        System.out.println("kaç kilo patlıcan?");
        pat=inp.nextInt();

        toplam=a*armut+e*elma+d*domates+m*muz+p*pat;

        System.out.println(toplam);


    }
}
