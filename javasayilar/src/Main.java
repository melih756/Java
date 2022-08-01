import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        int s;

        Scanner inp=new Scanner(System.in);

        System.out.println("Sayı giriniz");
        s=inp.nextInt();

        for (int i=0; i<=s; i++){
            if (i%3==0){
                System.out.println("Girilen sayı 3 e tam bölünüyor : " + i);
            } else if (i%4==0) {
                System.out.println("Girilen sayı 4 e tam bölünüyor : " + i);
            }else {
                System.out.println("Girilen sayı 3 ya da 4 e tam bölünmüyor : " + i);
            }
        }
    }
}
