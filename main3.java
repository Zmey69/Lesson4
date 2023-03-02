//                                                  Домашние задание.
//                                                  Урок 4 (Лист №3).

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {

        // 8. Задание особой сложности **. Сделать так, чтобы все наши калькуляторы могли
        //    работать как с целыми числами, так и с дробными.


        System.out.println("калькулятор суммы чисел");
        System.out.println("Введите первое число");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Введите второе число:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a + "+" + b + " = " + (a + b));


        System.out.println("Калькулятор разности чисел");
        System.out.println("Введите первое число:");
        double ar = new Scanner(System.in).nextDouble();

        System.out.println("Введите второе чисоло:");
        double br = new Scanner(System.in).nextDouble();
        System.out.println(ar + "-" + br + "=" + (ar - br));


        System.out.println("Калькулятор частных чисел");
        System.out.println("Введите первое число:");
        double aс = new Scanner(System.in).nextDouble();


        System.out.println("Введите второе чисоло:");
        double bс = new Scanner(System.in).nextDouble();
        System.out.println(aс + "/" + bс + "=" + (aс / bс));
    }
}