//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и возвращает сумму всех чисел между ними (включительно).
        int a = 20;
        int b = 50;
        System.out.printf("Сумма чисел в интервале %s .. %s = %s%s", a, b, sumRange(a, b), System.lineSeparator());

        // 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
        int sum = add(39, 71);
        System.out.println("Сумма чисел: " + sum);
        String result = add("Привет, ", "мир!");
        System.out.println("Результат сложения строк: " + result);

        // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
        int[] Array = {67, 77, 90, 8, 0, 12};
        int max = findMax(Array);
        System.out.println("Максимальный элемент массива: " + max);

        // 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
        int input = 9;
        long output = factorial(input);
        System.out.println("Факториал числа " + input + " равен " + output);

        // 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
        double circleRadius =444.0;
        double circleArea = calculateArea(circleRadius);
        System.out.println("Площадь круга с радиусом " + circleRadius + ": " + circleArea);

        double rectLength = 7.0;
        double rectWidth = 3.0;
        double rectangleArea = calculateArea(rectLength, rectWidth);
        System.out.println("Площадь прямоугольника: " + rectangleArea);

        // 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
        double average = calculateAverage(12, 13, 14);
        System.out.println("Среднее арифметическое: " + average);

        // 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
        double sideA = 5.0;
        double sideB = 7.0;
        double hypotenuse = calculateHypotenuse(sideA, sideB);
        System.out.println("Гипотенуза при катетах " + sideA + " и " + sideB + " равна: " + hypotenuse);
        // 8. Реализовать тесты для задач выше :)

    }

    // 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и возвращает сумму всех чисел между ними (включительно).
    public static int sumRange(int start, int end) {
        int sum = 0;
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    public static Integer findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
    // 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    public static double calculateHypotenuse(double sideA, double sideB) {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    // 8. Реализовать тесты для задач выше :)
}