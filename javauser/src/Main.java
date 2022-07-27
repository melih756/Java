import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        String username,password;

        Scanner inp=new Scanner(System.in);

        System.out.println("Kullanıcı adınız : ");
        username=inp.nextLine();

        System.out.println("Şifre giriniz");
        password=inp.nextLine();

        if (username.equals("melih") && password.equals("123")){
            System.out.println("Giriş yaptınız");
        } else {
            System.out.println("Bilgileriniz yanlış");
            
        }
    }
}
