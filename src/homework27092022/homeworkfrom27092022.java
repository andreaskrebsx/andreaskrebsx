package homework27092022;

/*    First level: 1 Создайте строку I study Basic Java!
        2 Распечатать последний символ строки. Используем метод String.charAt().
        4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        5 Заменить все символы “а” на “о”.
        6 Преобразуйте строку к верхнему регистру.
        7 Преобразуйте строку к нижнему регистру.
        8 Вырезать строку Java c помощью метода String.substring().
        9 посчитать какой процент составляет число 200 от 470
        10 напишите программу для подсчета какой индекс у символа 'g'

     Second level:
        1. Напишите программу, которая спрашивает имя и считывает его с консоли
           с помощью Scanner
           и после пишет на консоль “Hello …….. !  вместо многоточий имя
        2 Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner и
          после пишет "Ваше имя начинается с буквы …"
        3 имеется число 59.976, нужно вывести целое из него и перевести в int
        4 перевести число 475 типа int в short */


import java.util.Scanner;

public class homeworkfrom27092022 {
    public static void main(String[] args) {

        String IstudyBasicJavaStr = "I study Basic Java!" ; //1
        System.out.println(IstudyBasicJavaStr);

        System.out.println(IstudyBasicJavaStr.charAt(18)); //2

        String trimmedStr = IstudyBasicJavaStr.trim(); //4
        System.out.println(trimmedStr.contains("Java"));

        System.out.println(trimmedStr.replace("a","o")); //5

        System.out.println(IstudyBasicJavaStr.toLowerCase()); //7

        System.out.println(IstudyBasicJavaStr.toUpperCase());//6

        System.out.println(trimmedStr.substring(13,18)); //8

        int  x = 200; //9
        int y = 470;
        System.out.println(x*100/y);

        System.out.println(IstudyBasicJavaStr.indexOf("g")); //10


        Scanner scanner = new Scanner(System.in); // second 1
        System.out.print("input name :  ");
        String phrase = scanner.nextLine();
        System.out.println("Hallo " + phrase + "!");


        Scanner sc = new Scanner(System.in); // second 2
        System.out.print("input name :  ");
        String phrase1 = sc.nextLine();
        System.out.print("Ваше имя начинается с буквы  "  );
        System.out.println(phrase1.charAt(0));

        double a1 = 59.976;  //second 3
        int b1 = (int)Math.round(a1);
        System.out.println(b1);

        int a = 475;   // second 4
        short b = (short) a;
        System.out.println(b);


    }

}
