import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int sıcaklık;

        Scanner inp=new Scanner(System.in);

        System.out.println("Sıcaklık değeri giriniz : ");
        sıcaklık=inp.nextInt();

        if (sıcaklık<5){
            System.out.println("Kayak yapmayı öneriyoruz");
        } else if (sıcaklık>=5 && sıcaklık<=25) {
            System.out.println("Sinema veya piknik yapabilirsiniz");
        } else if (sıcaklık>25) {
            System.out.println("Yüzme yapabilirsiniz");
        }
    }
}
