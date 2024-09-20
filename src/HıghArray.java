import java.util.Random;

public class HıghArray {
    private int[] array;
    private int size;

    public HıghArray(int size) {
        array = new int[size];
        this.size = 0;
    }

    public void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(100) + 1;
            array[i] = randomNumber;
            size++;
        }
    }

    public void display() {
        System.out.println("dizi elemanları:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public void asalSayılar() {
        System.out.println("dizidekı asal sayılar:");
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (asalMı(array[i])) {
                System.out.print(" "  + array[i]);
                count++;
            }
        }
        System.out.print("Asal sayılar" + count);
        System.out.println("");
    }


    private boolean asalMı(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}

