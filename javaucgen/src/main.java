import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int a,b,c,alan,u;

        Scanner input=new Scanner(System.in);

        System.out.println("kenar uzunluğu giriniz");
        a=input.nextInt();

        System.out.println("kenar uzunluğu giriniz");
        b=input.nextInt();

        System.out.println("kenar uzunluğu giriniz");
        c=input.nextInt();

        u=(a+b+c)/2;
        alan = u * (u-a) * (u-b) * (u-c);

        System.out.println("alan"+alan);

    }

}
