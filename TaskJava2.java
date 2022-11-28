package HWJ1;

/*
	2. Вывести все простые числа от 1 до 1000
*/
public class TaskJava2 {

    static void primeNumbers(int num) {

        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count <= 2) {
                System.out.println("простое число: " + i);
            }
        }

    }

    public static void main(String args[]) {

        primeNumbers(1000);

    }
}
