import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Integer number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        Integer number1 = new Scanner(System.in).nextInt();
        double quotient = (double) number / number1;
        int sum = number + number1;
        int difference = number - number1;
        int composition = number * number1;
        System.out.println("Сумма числе: " + sum);
        System.out.println("Разность чисел: " + difference);
        System.out.println("Произведение: " + composition);
        System.out.println("Частное: " + quotient);
    }
}
