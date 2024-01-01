import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String user, password;
        int islem = 1, price, total = 1000, hak=3;

        while (hak <= 3) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Kullanıcı adınızı girin : ");
            user = inp.nextLine();
            System.out.println("Şifrenizi girin : ");
            password = inp.nextLine();

            if ((user.equals("Merve")) && (password.equals("123"))) {
                System.out.println("Hoş geldiniz ");

                do {
                    System.out.println("Yapmak istediğiniz işlemi tuşlayınız.");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                    islem = inp.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz");
                            price = inp.nextInt();
                            total += price;
                            System.out.println("Güncel Bakiyeniz" + total);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz");
                            price = inp.nextInt();
                            if (price > total) {
                                System.out.println("Bakiyeniz yetersizdir.");
                            } else {
                                total -= price;
                                System.out.println("Güncel bakiyeniz :" + total);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + total);
                            break;
                    }
                }
                while (islem != 4);
                System.out.println("tekrar görüşmek üzere hoşcakalın.");
                break;
            } else {
                hak--;
                System.out.println("yanlış giriş yaptınız lütfen tekrar deneyin");
                if (hak == 0) {
                    System.out.println("3 kez hatalı giriş yaptığınızdan hesabınız bloke edilmiştir.");
                } else {
                    System.out.println("kalan hakkınız : " + hak);
                }
            }
        }
    }
}