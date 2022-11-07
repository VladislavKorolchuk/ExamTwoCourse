import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int naturalNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        // Проверка, является ли введенное значение числом
        if (input.hasNextInt()) {
            // Введено число
            naturalNumber = input.nextInt();
            // Нам необходимо найти все делители числа
            // Наибольший делитель - это само число - наименьший - 1
            System.out.print("Делителями числа " + naturalNumber + " являются: ");
            for (int i = naturalNumber; i > 0; i--) {
                if ((naturalNumber % i) == 0){
                    System.out.print(i + " ");
                }
            }
        } else System.out.println("Введено не число");
    }

}
