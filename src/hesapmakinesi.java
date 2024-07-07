import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int a,b,c,x;
        c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sayiyi Giriniz : ");
        a = sc.nextInt();
        System.out.println("2. Sayiyi Giriniz : ");
        b = sc.nextInt();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n");
        x = sc.nextInt();
        switch (x) {
            case 1:
                c = a + b;
                break;
            case 2:
                c = a - b;
                break;
            case 3:
                c = a * b;
                break;
            case 4:
                c = a / b;
                break;
        }
        System.out.println("Sonuç  : "+c);
    }
}
