import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi girin ");
        int boyut = scanner.nextInt();

        HıghArray  dizi = new HıghArray(boyut);
        dizi.fillRandom();
        dizi.display();
        dizi.asalSayılar();

    }
}


