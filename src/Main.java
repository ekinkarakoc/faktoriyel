import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k  ;
        int faktoriyel = 1;
        System.out.println("bir sayi giriniz");
        k = scanner.nextInt();

        while (k >0){
            faktoriyel *= k;
            k--;
        }
        System.out.println(faktoriyel);
    }
}