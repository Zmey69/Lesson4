import java.util.Scanner;

//                                                  Домашние задание.
//                                                  Урок 4 (Лист №5).
//
//   10. Задание особой сложности ***. Переделайте наши программы(Конвертер валют, конвертер температур) так,
//   чтобы пользователь сам мог ввести значения кол-ва рублей\градусов соответственно. В программе не должно
//    быть “магических чисел”.
public class main5 {
    // Символы валют Windows: ₽ (рус.клав)= alt (правый)+8; €= (рус.клав)= alt+0136 анг/клав= alt+0128;
    public static void main(String[] args) {

        System.out.println("Конвертер валют");

        System.out.println("Введение количество Рублей");
        double Рубль = new Scanner(System.in).nextDouble();


        System.out.println("Актуальный курс Доллара:");
        double $ = new Scanner(System.in).nextDouble();

        System.out.println("Актуальный курс Евро:");
        double € = new Scanner(System.in).nextDouble();


        System.out.println(Рубль + "Руб = " + Рубль*(1/€)+ "€");
        System.out.println(Рубль + "Руб = " + Рубль*(1/$)+ "$");



    }
}