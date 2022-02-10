public class Exercise7 {

    public static void main(String[] args) {
        int count = 1;
        for (int i = 10000; i <= 99999; i++) {
            if (i / 10000 == i % 10 && (i / 1000) % 10 == (i / 10) % 10) {
                System.out.println("Число: " + i + " Кол-во чисел: " + count++);
            }
        }
    }
}
