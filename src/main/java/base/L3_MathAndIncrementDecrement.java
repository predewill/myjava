package base;

import static java.lang.Math.pow;

public class L3_MathAndIncrementDecrement {

    /* Math.pow() - возведение числа в степень
     * 1-ый аргумент - число, которое возводим в степень,
     * 2-ой – показатель степени, в которую возводим число.
     */
    public static void main(String[] args) {
        double x = 2, y = 8;

        double result = pow(x, y);

        System.out.println(result);
    }

    // Math.sqrt() - математическая функция, которая извлекает квадратный корень
    public static void sqrt() {
        double x = 256;

        double result = Math.sqrt(x);

        System.out.println("Квадратный корень: " + result);
    }

    // Арифметические операторы (C03_Arithmetic Operators): +, -, *, /, %

    public static void arithmetics(String[] args) {
        // Addition (+)
        byte summand1 = 1, summand2 = 2; // Множественное объявление.
        int sum = 0;
        sum = summand1 + summand2;

        System.out.println(sum);

        // Subtraction (-)
        byte minuend = 5, subtrahend = 3;
        int difference = 0;
        difference = minuend - subtrahend;

        System.out.println(difference);

        // Multiplication (*)
        byte factor1 = 2, factor2 = 3;
        int product = 0;
        product = factor1 * factor2;

        System.out.println(product);

        // Division (/)
        byte dividend = 5, divisor = 2;
        int quotient = 0, remainder = 0;
        quotient = dividend / divisor;

        System.out.println(quotient);

        // Remainder after division (%)
        remainder = dividend % divisor;

        System.out.println(remainder);
    }

    // Increment and decrement

    public static void incDec(String[] args) {

        System.out.println("----- Постфиксный инкремент"); // Post-increment

        byte number1 = 0;
        System.out.println(number1++); // Сначала выводим на экран, потом увеличиваем на 1.
        System.out.println(number1);

        System.out.println("----- Префиксный инкремент"); // Pre-increment

        byte number2 = 0;
        System.out.println(++number2); // Сначала увеличиваем на 1, потом выводим на экран.

        System.out.println("----- Постфиксный декремент"); // Post-decrement

        byte number3 = 0;
        System.out.println(number3--); // Сначала выводим на экран, потом уменьшаем на 1.
        System.out.println(number3);

        System.out.println("----- Префиксный декремент"); // Pre-decrement

        byte number4 = 0;
        System.out.println(--number4); // Сначала уменьшаем на 1, потом выводим на экран.
        int i = 0;

        i = i + 1;  i += 1;
        i = i + 5;  i += 5;

        i = i - 10;  i -= 10;
    }
}
