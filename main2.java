//                                                    Домашние задание.
//                                                    Урок 4 (Лист №2).

import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {

        // 7. Задание особой сложности *.  Дописать аналоги нашего калькулятора так,
        //    чтобы они могли считать сумму, разность и частное двух чисел.

        System.out.println("калькулятор суммы чисел");
        System.out.println("Введениеn первое число");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Введение второе число:");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a + "+" + b + " = " + (a + b));


        System.out.println("Калькулятор разности чисел");
        System.out.println("Введение первое число:");
        int ar = new Scanner(System.in).nextInt();

        System.out.println("Введите второе чисоло:");
        int br = new Scanner(System.in).nextInt();
        System.out.println(ar + "-" + br + "=" + (ar - br));


        System.out.println("Калькулятор частных чисел");
        System.out.println("Введение первое число:");
        int aс = new Scanner(System.in).nextInt();


        System.out.println("Введите второе чисоло:");
        int bс = new Scanner(System.in).nextInt();
        System.out.println(aс + "/" + bс + "=" + (aс / bс));


    }
}

