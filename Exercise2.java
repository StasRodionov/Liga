public class Exercise2 {

    public static void main(String[] args) {
        int count = 1;
        for (int i = 1000; i < 10000; i++) {
            if (i % 2 != 0 && (i / 10) % 2 != 0 && (i / 100) % 2 != 0 && (i / 1000) % 2 != 0) {
                System.out.println("Число: " + i + " Кол-во чисел: " + count++);
            }
        }
    }
}

