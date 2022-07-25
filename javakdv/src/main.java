import java.util.Scanner;

public class main {
    public static void main(String[]args){
        double para;
        Scanner input=new Scanner(System.in);

        System.out.println("Tutar giriniz:");
        para=input.nextDouble();

        double kdv,kdvtutar;

       if (para<=1000){
           kdv=para+(para*18/100);
           kdvtutar=kdv-para;
           System.out.println("Kdv li fiyat :" + kdv+ "kdv tutarı : "+ kdvtutar);
       }else{

           kdv=para+(para*8/100);
           kdvtutar=kdv-para;
           System.out.println("Kdv li fiyat :" + kdv+ "kdv tutarı : "+ kdvtutar);
       }


    }
}
